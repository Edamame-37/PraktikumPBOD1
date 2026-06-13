package com.marketplace.app.view;

import com.marketplace.core.model.Produk;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.List;

public class MarketplaceView {
    private JFrame frame;
    private JPanel catalogGrid;
    private JLabel lblCartSummary;
    private JLabel lblCartTotal;
    
    private JButton btnNavCatalog;
    private JButton btnNavAnalytics;
    private JTextField txtSearch;
    private JComboBox<String> cbFilterKategori;
    
    private JButton btnAddProduct;
    private JButton btnCheckoutBottom;
    private JButton btnClearCart; // Tambahan Variabel Tombol Empty Cart
    
    private JButton btnSimpanModal;
    private JButton btnBatalModal;
    private JButton btnProsesCheckout;

    // --- PALET WARNA TAILWIND ---
    private final Color BG_BACKGROUND = Color.decode("#fcf8ff");
    private final Color BG_SURFACE = Color.decode("#ffffff");
    private final Color BG_SURFACE_LOW = Color.decode("#f5f2ff");
    private final Color TEXT_ON_SURFACE = Color.decode("#1b1b24");
    private final Color TEXT_ON_SURFACE_VARIANT = Color.decode("#5c6274");
    private final Color BORDER_OUTLINE = Color.decode("#e2e0ee");
    
    private final Color BRAND_PRIMARY = Color.decode("#2b1dc1"); 
    private final Color BRAND_ON_PRIMARY = Color.decode("#ffffff");
    private final Color BRAND_PRIMARY_CONTAINER = Color.decode("#4f46e5");
    private final Color FOOTER_BG_MODAL = Color.decode("#f3f0ff"); 

    public MarketplaceView() {
        inisialisasiGUI();
    }

    private void inisialisasiGUI() {
        frame = new JFrame("Metric Marketplace Hub");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(BG_BACKGROUND);

        // Sidebar
        JPanel sidebar = new JPanel(new BorderLayout());
        sidebar.setBackground(BG_SURFACE_LOW);
        sidebar.setPreferredSize(new Dimension(260, 0));
        sidebar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, BORDER_OUTLINE));

        JPanel sidebarHeader = new JPanel(new FlowLayout(FlowLayout.LEFT, 24, 28));
        sidebarHeader.setOpaque(false);
        JLabel lblAppTitle = new JLabel("🏪 MarketPlace");
        lblAppTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblAppTitle.setForeground(BRAND_PRIMARY);
        sidebarHeader.add(lblAppTitle);
        sidebar.add(sidebarHeader, BorderLayout.NORTH);

        JPanel navList = new JPanel();
        navList.setLayout(new BoxLayout(navList, BoxLayout.Y_AXIS));
        navList.setOpaque(false);
        navList.setBorder(new EmptyBorder(10, 16, 0, 16));

        btnNavCatalog = new JButton("🛒  Product Catalog");
        btnNavAnalytics = new JButton("📊  Analytics Report");
        
        styleNavButton(btnNavCatalog, true);
        styleNavButton(btnNavAnalytics, false);

        navList.add(btnNavCatalog);
        navList.add(Box.createRigidArea(new Dimension(0, 8)));
        navList.add(btnNavAnalytics);
        sidebar.add(navList, BorderLayout.CENTER);

        frame.add(sidebar, BorderLayout.WEST);

        // Main Content Area
        JPanel mainArea = new JPanel(new BorderLayout());
        mainArea.setBackground(BG_BACKGROUND);

        JPanel topBar = new JPanel(new GridBagLayout());
        topBar.setBackground(BG_SURFACE);
        topBar.setPreferredSize(new Dimension(0, 75));
        topBar.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, BORDER_OUTLINE));
        topBar.setBorder(BorderFactory.createCompoundBorder(
            topBar.getBorder(), new EmptyBorder(0, 24, 0, 24)
        ));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 0, 12);
        
        txtSearch = new JTextField();
        txtSearch.setPreferredSize(new Dimension(280, 40));
        txtSearch.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(BORDER_OUTLINE, 1, true), "Search Name / ID", 
            TitledBorder.LEFT, TitledBorder.TOP, new Font("SansSerif", Font.PLAIN, 10), TEXT_ON_SURFACE_VARIANT
        ));
        gbc.weightx = 0.5;
        topBar.add(txtSearch, gbc);

        cbFilterKategori = new JComboBox<>(new String[]{"Semua Kategori", "Produk Fisik", "Produk Digital"});
        cbFilterKategori.setPreferredSize(new Dimension(180, 40));
        cbFilterKategori.setFont(new Font("SansSerif", Font.PLAIN, 13));
        gbc.weightx = 0.2;
        topBar.add(cbFilterKategori, gbc);
        
        gbc.weightx = 0.3;
        topBar.add(Box.createGlue(), gbc);
        
        mainArea.add(topBar, BorderLayout.NORTH);

        JPanel contentCanvas = new JPanel(new BorderLayout());
        contentCanvas.setBackground(BG_BACKGROUND);
        contentCanvas.setBorder(new EmptyBorder(24, 24, 24, 24));

        JPanel catalogHeader = new JPanel(new BorderLayout());
        catalogHeader.setOpaque(false);
        catalogHeader.setBorder(new EmptyBorder(0, 0, 16, 0));
        
        JLabel lblCatTitle = new JLabel("Available Items");
        lblCatTitle.setFont(new Font("SansSerif", Font.BOLD, 22));
        lblCatTitle.setForeground(TEXT_ON_SURFACE);
        
        btnAddProduct = buatTombolUtama("➕ Add New Product", BRAND_PRIMARY, BRAND_ON_PRIMARY);
        catalogHeader.add(lblCatTitle, BorderLayout.WEST);
        catalogHeader.add(btnAddProduct, BorderLayout.EAST);
        contentCanvas.add(catalogHeader, BorderLayout.NORTH);

        catalogGrid = new JPanel(new GridLayout(0, 3, 16, 16));
        catalogGrid.setBackground(BG_BACKGROUND);
        
        JPanel gridWrapper = new JPanel(new BorderLayout());
        gridWrapper.setBackground(BG_BACKGROUND);
        gridWrapper.add(catalogGrid, BorderLayout.NORTH);
        
        JScrollPane scrollCatalog = new JScrollPane(gridWrapper);
        scrollCatalog.setBorder(null);
        scrollCatalog.getViewport().setBackground(BG_BACKGROUND);
        scrollCatalog.getVerticalScrollBar().setUnitIncrement(18);
        contentCanvas.add(scrollCatalog, BorderLayout.CENTER);

        mainArea.add(contentCanvas, BorderLayout.CENTER);

        JPanel stickyCart = new JPanel(new BorderLayout());
        stickyCart.setBackground(BG_SURFACE);
        stickyCart.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(1, 0, 0, 0, BORDER_OUTLINE),
                new EmptyBorder(16, 24, 16, 24)
        ));

        JPanel cartInfo = new JPanel(new GridLayout(2, 1, 0, 2));
        cartInfo.setOpaque(false);
        lblCartSummary = new JLabel("🛒 Keranjang Belanja (Kosong)");
        lblCartSummary.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblCartSummary.setForeground(TEXT_ON_SURFACE_VARIANT);
        
        lblCartTotal = new JLabel("Total: Rp 0,00");
        lblCartTotal.setFont(new Font("SansSerif", Font.BOLD, 22));
        lblCartTotal.setForeground(BRAND_PRIMARY);
        
        cartInfo.add(lblCartSummary);
        cartInfo.add(lblCartTotal);

        // --- Panel untuk menampung dua buah tombol (Empty & Checkout) ---
        JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 12, 0));
        actionPanel.setOpaque(false);

        btnClearCart = buatTombolUtama("🗑 Empty Cart", Color.WHITE, Color.decode("#d32f2f"));
        btnClearCart.setBorder(BorderFactory.createLineBorder(Color.decode("#d32f2f"), 1));
        btnClearCart.setPreferredSize(new Dimension(140, 46));

        btnCheckoutBottom = buatTombolUtama("Checkout Now ➔", BRAND_PRIMARY, BRAND_ON_PRIMARY);
        btnCheckoutBottom.setPreferredSize(new Dimension(220, 46));

        actionPanel.add(btnClearCart);
        actionPanel.add(btnCheckoutBottom);

        stickyCart.add(cartInfo, BorderLayout.WEST);
        stickyCart.add(actionPanel, BorderLayout.EAST);

        mainArea.add(stickyCart, BorderLayout.SOUTH);

        frame.add(mainArea, BorderLayout.CENTER);
    }

    public void setNavActiveState(String navName) {
        boolean isCatalog = navName.equalsIgnoreCase("Catalog");
        styleNavButton(btnNavCatalog, isCatalog);
        styleNavButton(btnNavAnalytics, !isCatalog);
    }

    public void TampilkanHalamanUtama() {
        catalogGrid.revalidate();
        catalogGrid.repaint();
    }

    public void segarkanKatalog(List<Produk> list, ActionListener beliListener) {
        catalogGrid.removeAll();
        if (list.isEmpty()) {
            JLabel empty = new JLabel("Item tidak ditemukan atau katalog masih kosong.");
            empty.setFont(new Font("SansSerif", Font.ITALIC, 14));
            empty.setForeground(TEXT_ON_SURFACE_VARIANT);
            catalogGrid.add(empty);
        } else {
            for (Produk p : list) {
                catalogGrid.add(buatCardProduk(p, beliListener));
            }
        }
        catalogGrid.revalidate();
        catalogGrid.repaint();
    }

    private JPanel buatCardProduk(Produk p, ActionListener beliListener) {
        RoundedPanel card = new RoundedPanel(14, Color.WHITE);
        card.setLayout(new BorderLayout(12, 12));
        card.setBorder(new EmptyBorder(16, 16, 16, 16));

        JPanel topInfo = new JPanel(new GridLayout(2, 1, 0, 4));
        topInfo.setOpaque(false);
        
        String cleanCategory = p.getClass().getSimpleName().replace("Produk", "• ");
        JLabel lblMeta = new JLabel("ID: " + p.getId() + " " + cleanCategory);
        lblMeta.setFont(new Font("SansSerif", Font.BOLD, 11));
        lblMeta.setForeground(TEXT_ON_SURFACE_VARIANT);
        
        JLabel lblNama = new JLabel(p.getNama());
        lblNama.setFont(new Font("SansSerif", Font.BOLD, 16));
        lblNama.setForeground(TEXT_ON_SURFACE);
        
        topInfo.add(lblMeta);
        topInfo.add(lblNama);

        JLabel lblHarga = new JLabel(String.format("Rp %,.2f", p.hitungTotalHarga()));
        lblHarga.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblHarga.setForeground(BRAND_PRIMARY);

        JButton btnBeli = buatTombolUtama("Add", BG_SURFACE_LOW, BRAND_PRIMARY);
        btnBeli.setFont(new Font("SansSerif", Font.BOLD, 12));
        btnBeli.setPreferredSize(new Dimension(75, 32));
        btnBeli.setActionCommand(p.getId()); 
        btnBeli.addActionListener(beliListener);

        JPanel actionRow = new JPanel(new BorderLayout());
        actionRow.setOpaque(false);
        actionRow.setBorder(new EmptyBorder(6, 0, 0, 0));
        actionRow.add(lblHarga, BorderLayout.WEST);
        actionRow.add(btnBeli, BorderLayout.EAST);

        card.add(topInfo, BorderLayout.NORTH);
        card.add(actionRow, BorderLayout.SOUTH);
        return card;
    }

    public void updateKeranjangUI(int jumlah, double total) {
        if (jumlah == 0) {
            lblCartSummary.setText("🛒 Keranjang Belanja (Kosong)");
            lblCartTotal.setText("Total: Rp 0,00");
        } else {
            lblCartSummary.setText("🛒 " + jumlah + " Item Terpilih di Kasir");
            lblCartTotal.setText(String.format("Total: Rp %,.2f", total));
        }
    }
    
    public JDialog createTambahModal() {
        JDialog dialog = new JDialog(frame, "Tambah Produk Baru", true);
        dialog.setSize(460, 620);
        dialog.setLocationRelativeTo(frame);
        dialog.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(new EmptyBorder(24, 24, 24, 24));

        formPanel.add(buatLabelForm("ID Produk (cth: PR01)"));
        formPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        JTextField txtID = buatTextFieldPolos();
        formPanel.add(txtID);
        formPanel.add(Box.createRigidArea(new Dimension(0, 16)));

        formPanel.add(buatLabelForm("Nama Produk"));
        formPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        JTextField txtNama = buatTextFieldPolos();
        formPanel.add(txtNama);
        formPanel.add(Box.createRigidArea(new Dimension(0, 16)));

        formPanel.add(buatLabelForm("Kategori"));
        formPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        JComboBox<String> cbKategori = new JComboBox<>(new String[]{"Produk Fisik", "Produk Digital"});
        cbKategori.setFont(new Font("SansSerif", Font.PLAIN, 14));
        cbKategori.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        cbKategori.setPreferredSize(new Dimension(0, 40));
        cbKategori.setBackground(Color.WHITE);
        formPanel.add(cbKategori);
        formPanel.add(Box.createRigidArea(new Dimension(0, 16)));

        formPanel.add(buatLabelForm("Harga Dasar (Rp)"));
        formPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        JTextField txtHarga = buatTextFieldPolos();
        formPanel.add(txtHarga);
        formPanel.add(Box.createRigidArea(new Dimension(0, 16)));

        formPanel.add(buatLabelForm("Berat (kg) / Biaya Server (Rp)"));
        formPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        JTextField txtAtribut = buatTextFieldPolos();
        formPanel.add(txtAtribut);

        JPanel footer = new JPanel(new BorderLayout());
        footer.setBackground(FOOTER_BG_MODAL);
        footer.setBorder(new EmptyBorder(16, 24, 16, 24));
        
        btnBatalModal = new JButton("Batal");
        btnBatalModal.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnBatalModal.setForeground(Color.decode("#2b1dc1"));
        btnBatalModal.setContentAreaFilled(false);
        btnBatalModal.setBorderPainted(false);
        btnBatalModal.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btnSimpanModal = buatTombolUtama("Simpan Produk", BRAND_PRIMARY, BRAND_ON_PRIMARY);
        btnSimpanModal.setPreferredSize(new Dimension(180, 44));

        footer.add(btnBatalModal, BorderLayout.WEST);
        footer.add(btnSimpanModal, BorderLayout.EAST);
        
        dialog.add(formPanel, BorderLayout.CENTER);
        dialog.add(footer, BorderLayout.SOUTH);
        
        btnSimpanModal.putClientProperty("txtID", txtID);
        btnSimpanModal.putClientProperty("txtNama", txtNama);
        btnSimpanModal.putClientProperty("cbKategori", cbKategori);
        btnSimpanModal.putClientProperty("txtHarga", txtHarga);
        btnSimpanModal.putClientProperty("txtAtribut", txtAtribut);

        return dialog;
    }

    private JLabel buatLabelForm(String teks) {
        JLabel label = new JLabel(teks);
        label.setFont(new Font("SansSerif", Font.PLAIN, 14));
        label.setForeground(TEXT_ON_SURFACE_VARIANT);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        return label;
    }

    private JTextField buatTextFieldPolos() {
        JTextField txt = new JTextField();
        txt.setFont(new Font("SansSerif", Font.PLAIN, 14));
        txt.setBorder(BorderFactory.createLineBorder(Color.decode("#cccccc"), 1));
        txt.setBackground(Color.WHITE);
        txt.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        txt.setPreferredSize(new Dimension(0, 40));
        txt.setAlignmentX(Component.LEFT_ALIGNMENT);
        return txt;
    }

    public JDialog createCheckoutModal(String struk) {
        JDialog dialog = new JDialog(frame, "Proses Transaksi", true);
        dialog.setSize(420, 560);
        dialog.setLocationRelativeTo(frame);
        
        JPanel panel = new JPanel(new BorderLayout(0, 16));
        panel.setBackground(Color.WHITE);
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel lblStruk = new JLabel(struk);
        lblStruk.setVerticalAlignment(SwingConstants.TOP);
        
        JScrollPane scrollStruk = new JScrollPane(lblStruk);
        scrollStruk.setBorder(BorderFactory.createLineBorder(BORDER_OUTLINE, 1, true));
        scrollStruk.setBackground(Color.WHITE);

        JPanel footer = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        footer.setBackground(Color.WHITE);
        btnProsesCheckout = buatTombolUtama("Selesaikan Transaksi & Cetak", BRAND_PRIMARY, BRAND_ON_PRIMARY);
        btnProsesCheckout.setPreferredSize(new Dimension(240, 42));
        footer.add(btnProsesCheckout);
        
        panel.add(scrollStruk, BorderLayout.CENTER);
        panel.add(footer, BorderLayout.SOUTH);
        dialog.add(panel);
        
        return dialog;
    }

    public JDialog createLaporanModal(String htmlLaporan) {
        JDialog dialog = new JDialog(frame, "Executive Summary Analytics", true);
        dialog.setSize(480, 520);
        dialog.setLocationRelativeTo(frame);
        
        JPanel panel = new JPanel(new BorderLayout(0, 12));
        panel.setBackground(Color.WHITE);
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel content = new JLabel(htmlLaporan);
        content.setVerticalAlignment(SwingConstants.TOP);
        
        JPanel footer = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        footer.setBackground(Color.WHITE);
        JButton btnTutup = buatTombolUtama("Tutup Laporan", BRAND_PRIMARY, BRAND_ON_PRIMARY);
        btnTutup.addActionListener(e -> dialog.dispose());
        footer.add(btnTutup);
        
        panel.add(content, BorderLayout.CENTER);
        panel.add(footer, BorderLayout.SOUTH);
        dialog.add(panel);
        
        return dialog;
    }

    private void styleNavButton(JButton btn, boolean active) {
        btn.setFont(new Font("SansSerif", active ? Font.BOLD : Font.PLAIN, 13));
        btn.setForeground(active ? BRAND_ON_PRIMARY : TEXT_ON_SURFACE_VARIANT);
        btn.setBackground(active ? BRAND_PRIMARY_CONTAINER : Color.decode("#f5f2ff"));
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setOpaque(true);
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        btn.setMaximumSize(new Dimension(240, 44));
        btn.setPreferredSize(new Dimension(240, 44));
        btn.setBorder(new EmptyBorder(0, 16, 0, 16));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private JButton buatTombolUtama(String teks, Color bg, Color fg) {
        JButton btn = new JButton(teks);
        btn.setFont(new Font("SansSerif", Font.BOLD, 14));
        btn.setBackground(bg);
        btn.setForeground(fg);
        btn.setFocusPainted(false);
        btn.setOpaque(true);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setPreferredSize(new Dimension(160, 40));
        return btn;
    }

    class RoundedPanel extends JPanel {
        private int cornerRadius;
        public RoundedPanel(int radius, Color bgColor) {
            cornerRadius = radius;
            setOpaque(false);
            setBackground(bgColor);
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics.setColor(getBackground());
            graphics.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
            graphics.setColor(BORDER_OUTLINE);
            graphics.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius));
            graphics.dispose();
        }
    }

    public void tampilkanPesan(String pesan) {
        JOptionPane.showMessageDialog(frame, pesan);
    }

    public JFrame getFrame() { return frame; }
    public JTextField getTxtSearch() { return txtSearch; }
    public JComboBox<String> getCbFilterKategori() { return cbFilterKategori; }
    public JButton getBtnNavCatalog() { return btnNavCatalog; }
    public JButton getBtnNavAnalytics() { return btnNavAnalytics; }
    public JButton getBtnAddProduct() { return btnAddProduct; }
    public JButton getBtnCheckoutBottom() { return btnCheckoutBottom; }
    public JButton getBtnClearCart() { return btnClearCart; }
    public JButton getBtnSimpanModal() { return btnSimpanModal; }
    public JButton getBtnBatalModal() { return btnBatalModal; }
    public JButton getBtnProsesCheckout() { return btnProsesCheckout; }
}