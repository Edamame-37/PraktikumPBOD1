package com.marketplace.app.controller;

import com.marketplace.core.model.*;
import com.marketplace.app.view.MarketplaceView;
import com.marketplace.repository.db.ProdukRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.stream.Collectors;

public class MarketplaceController {
    private List<Produk> katalog;
    private KeranjangBelanja<Produk> keranjang;
    private MarketplaceView view;
    private ProdukRepository repo;
    private String currentNav = "Catalog";

    public MarketplaceController(MarketplaceView view, ProdukRepository repo) {
        this.view = view;
        this.repo = repo;
        this.katalog = repo.loadData();
        this.keranjang = new KeranjangBelanja<>();

        inisialisasiListener();
    }

    public void start() {
        filterDanSegarkanKatalog();
        view.updateKeranjangUI(0, 0);
        view.getFrame().setLocationRelativeTo(null);
        view.getFrame().setVisible(true);
    }

    private void inisialisasiListener() {
        view.getTxtSearch().addCaretListener(e -> filterDanSegarkanKatalog());
        view.getCbFilterKategori().addActionListener(e -> filterDanSegarkanKatalog());

        view.getBtnAddProduct().addActionListener(e -> bukaModalTambah());
        view.getBtnCheckoutBottom().addActionListener(e -> bukaModalCheckout());
        
        // --- FITUR KOSONGKAN KERANJANG ---
        view.getBtnClearCart().addActionListener(e -> {
            if (keranjang.getDaftarItem().isEmpty()) {
                view.tampilkanPesan("Keranjang sudah kosong!");
                return;
            }
            
            int choice = JOptionPane.showConfirmDialog(view.getFrame(), 
                "Apakah Anda yakin ingin menghapus semua item di keranjang?", 
                "Konfirmasi Kosongkan", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE);
                
            if (choice == JOptionPane.YES_OPTION) {
                keranjang.kosongkan();
                view.updateKeranjangUI(0, 0);
            }
        });
        
        view.getBtnNavCatalog().addActionListener(e -> {
            currentNav = "Catalog";
            view.setNavActiveState(currentNav);
            view.TampilkanHalamanUtama();
        });
        
        view.getBtnNavAnalytics().addActionListener(e -> {
            currentNav = "Analytics";
            view.setNavActiveState(currentNav);
            jalankanLaporanAnalisisFungsional();
        });

        view.getFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                repo.simpanData(katalog);
                System.exit(0);
            }
        });
    }

    private void filterDanSegarkanKatalog() {
        String keyword = view.getTxtSearch().getText().toLowerCase().trim();
        String kategoriSelected = (String) view.getCbFilterKategori().getSelectedItem();

        List<Produk> hasilFilter = katalog.stream()
            .filter(p -> p.getNama().toLowerCase().contains(keyword) || p.getId().toLowerCase().contains(keyword))
            .filter(p -> {
                if (kategoriSelected.equalsIgnoreCase("Semua Kategori")) return true;
                return p.getClass().getSimpleName().equalsIgnoreCase(kategoriSelected.replace(" ", ""));
            })
            .collect(Collectors.toList());

        view.segarkanKatalog(hasilFilter, new BeliListener());
    }

    class BeliListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String idProduk = e.getActionCommand();
            katalog.stream()
                .filter(p -> p.getId().equalsIgnoreCase(idProduk))
                .findFirst()
                .ifPresent(p -> {
                    keranjang.tambah(p);
                    double totalBelanja = keranjang.getDaftarItem().stream().mapToDouble(Produk::hitungTotalHarga).sum();
                    view.updateKeranjangUI(keranjang.getDaftarItem().size(), totalBelanja);
                });
        }
    }

    private void bukaModalTambah() {
        JDialog dialog = view.createTambahModal();
        JButton btnSimpan = view.getBtnSimpanModal();
        JButton btnBatal = view.getBtnBatalModal();

        if (btnBatal != null) {
            for (ActionListener al : btnBatal.getActionListeners()) btnBatal.removeActionListener(al);
            btnBatal.addActionListener(e -> dialog.dispose());
        }

        if (btnSimpan != null) {
            for (ActionListener al : btnSimpan.getActionListeners()) btnSimpan.removeActionListener(al);
            btnSimpan.addActionListener(e -> {
                try {
                    JTextField txtID = (JTextField) btnSimpan.getClientProperty("txtID");
                    JTextField txtNama = (JTextField) btnSimpan.getClientProperty("txtNama");
                    JComboBox<?> cbKategori = (JComboBox<?>) btnSimpan.getClientProperty("cbKategori");
                    JTextField txtHarga = (JTextField) btnSimpan.getClientProperty("txtHarga");
                    JTextField txtAtribut = (JTextField) btnSimpan.getClientProperty("txtAtribut");
                    
                    String id = txtID.getText().trim();
                    String nama = txtNama.getText().trim();
                    
                    if(id.isEmpty() || nama.isEmpty()) {
                        view.tampilkanPesan("ID dan Nama Produk tidak boleh kosong!");
                        return;
                    }
                    
                    double harga = Double.parseDouble(txtHarga.getText());
                    double atribut = Double.parseDouble(txtAtribut.getText());
                    
                    if (cbKategori.getSelectedIndex() == 0) {
                        katalog.add(new ProdukFisik(id, nama, harga, atribut));
                    } else {
                        katalog.add(new ProdukDigital(id, nama, harga, atribut));
                    }
                    
                    filterDanSegarkanKatalog();
                    dialog.dispose();
                    view.tampilkanPesan("Produk '" + nama + "' Berhasil Ditambahkan!");
                    
                } catch (NumberFormatException ex) {
                    view.tampilkanPesan("Input angka nominal tidak valid! Mohon periksa kembali.");
                }
            });
        }
        dialog.setVisible(true);
    }

    private void bukaModalCheckout() {
        List<Produk> items = keranjang.getDaftarItem();
        if (items.isEmpty()) {
            view.tampilkanPesan("Keranjang Anda masih kosong!");
            return;
        }

        double totalBelanja = items.stream().mapToDouble(Produk::hitungTotalHarga).sum();
        
        StringBuilder struk = new StringBuilder("<html><body style='width:320px; font-family:SansSerif; color:#1b1b24;'>");
        struk.append("<h2 style='text-align:center; color:#3525cd;'>METRIC MARKETPLACE</h2>");
        struk.append("<p style='text-align:center; font-size:10px; color:#464555;'>Nota Pembelian Digital</p><hr><br>");
        
        for (Produk p : items) {
            struk.append("<div style='margin-bottom:10px;'>")
                 .append("<b>1x ").append(p.getNama()).append("</b><br>")
                 .append("<span style='color:#464555; font-size:11px;'>ID: ").append(p.getId()).append("</span>")
                 .append("<span style='float:right; color:#3525cd;'>Rp ").append(String.format("%,.2f", p.hitungTotalHarga())).append("</span>")
                 .append("</div>");
        }
        struk.append("<br><hr><br><table style='width:100%; font-size:14px;'>")
             .append("<tr><td><b>Grand Total:</b></td>")
             .append("<td style='text-align:right; color:#3525cd;'><b>Rp ").append(String.format("%,.2f", totalBelanja)).append("</b></td></tr>")
             .append("</table></body></html>");

        JDialog dialog = view.createCheckoutModal(struk.toString());
        JButton btnProses = view.getBtnProsesCheckout();
        
        if (btnProses != null) {
            for (ActionListener al : btnProses.getActionListeners()) btnProses.removeActionListener(al);
            btnProses.addActionListener(e -> {
                keranjang.kosongkan();
                view.updateKeranjangUI(0, 0);
                dialog.dispose();
                view.tampilkanPesan("Pembayaran Sukses Diproses. Terima Kasih!");
            });
        }
        dialog.setVisible(true);
    }

    private void jalankanLaporanAnalisisFungsional() {
        if (katalog.isEmpty()) {
            view.tampilkanPesan("Katalog kosong, belum ada data untuk dianalisis.");
            currentNav = "Catalog";
            view.setNavActiveState(currentNav);
            return;
        }

        double totalInventaris = katalog.stream().mapToDouble(Produk::hitungTotalHarga).sum();
        
        StringBuilder html = new StringBuilder("<html><body style='width:380px; font-family:SansSerif; color:#1b1b24;'>");
        html.append("<div style='background-color:#f5f2ff; padding:16px; border-radius:10px; border:1px solid #c7c4d8; margin-bottom:15px;'>")
            .append("<span style='color:#464555; font-size:11px; font-weight:bold;'>TOTAL NILAI INVENTARIS KATALOG</span><br>")
            .append("<h2 style='color:#3525cd; margin:4px 0 0 0;'>Rp ").append(String.format("%,.2f", totalInventaris)).append("</h2></div>");

        katalog.stream()
            .max((p1, p2) -> Double.compare(p1.hitungTotalHarga(), p2.hitungTotalHarga()))
            .ifPresent(p -> html.append("<div style='border:1px solid #c7c4d8; padding:12px; border-radius:10px; margin-bottom:15px;'>")
                                .append("<h4 style='margin:0; color:#1b1b24;'>👑 Produk Termahal</h4>")
                                .append("<p style='color:#464555; margin:4px 0 0 0; font-size:13px;'>").append(p.getNama()).append(" (<span style='color:#3525cd; font-weight:bold;'>Rp ").append(String.format("%,.2f", p.hitungTotalHarga())).append("</span>)</p></div>"));
        
        html.append("<h4 style='margin-bottom:6px;'>Daftar Produk Premium (&gt; Rp 150.000):</h4>")
            .append("<ul style='color:#464555; padding-left:20px; margin-top:0;'>");
            
        katalog.stream()
               .filter(p -> p.hitungTotalHarga() > 150000)
               .forEach(p -> html.append("<li style='margin-bottom:4px;'>").append(p.getNama()).append("</li>"));
               
        html.append("</ul></body></html>");

        JDialog dialog = view.createLaporanModal(html.toString());
        dialog.setVisible(true);
        
        currentNav = "Catalog";
        view.setNavActiveState(currentNav);
    }
}