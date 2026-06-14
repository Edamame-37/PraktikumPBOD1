package jdbc.program;

/*
 * File      : FrameUtama.java
 * Deskripsi : Kelas GUI utama aplikasi CRUD Mahasiswa
 */

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class FrameUtama extends JFrame {
    private MysqlMahasiswaService service;
    private JTable tabelMahasiswa;
    private DefaultTableModel modelTabel;
    private JTextField txtNama;
    private int selectedId = -1; 

    public FrameUtama() {
        service = new MysqlMahasiswaService();
        setTitle("Kelola Data Mahasiswa");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        modelTabel = new DefaultTableModel(new String[]{"ID", "NAMA"}, 0);
        tabelMahasiswa = new JTable(modelTabel);
        JScrollPane scrollPane = new JScrollPane(tabelMahasiswa);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(2, 1));
        
        JPanel formPanel = new JPanel(new FlowLayout());
        formPanel.add(new JLabel("nama:"));
        txtNama = new JTextField(15);
        formPanel.add(txtNama);
        
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton btnAmbilSemua = new JButton("Ambil Semua Data");
        JButton btnTambah = new JButton("Tambahkan");
        JButton btnEdit = new JButton("Edit");
        JButton btnHapus = new JButton("Hapus");
        JButton btnReset = new JButton("Reset indeks");

        buttonPanel.add(btnAmbilSemua);
        buttonPanel.add(btnTambah);
        buttonPanel.add(btnEdit);
        buttonPanel.add(btnHapus);
        buttonPanel.add(btnReset);

        bottomPanel.add(formPanel);
        bottomPanel.add(buttonPanel);
        add(bottomPanel, BorderLayout.SOUTH);

        tabelMahasiswa.getSelectionModel().addListSelectionListener(e -> {
            int row = tabelMahasiswa.getSelectedRow();
            if (row != -1) {
                selectedId = (int) modelTabel.getValueAt(row, 0);
                txtNama.setText((String) modelTabel.getValueAt(row, 1));
            }
        });

        btnAmbilSemua.addActionListener(e -> refreshTable());

        btnTambah.addActionListener(e -> {
            String nama = txtNama.getText();
            if (!nama.isEmpty()) {
                Mahasiswa mhs = new Mahasiswa(0, nama);
                service.add(mhs);
                txtNama.setText("");
                refreshTable();
            }
        });

        btnEdit.addActionListener(e -> {
            if (selectedId != -1) {
                Mahasiswa mhs = new Mahasiswa(selectedId, txtNama.getText());
                service.update(mhs);
                txtNama.setText("");
                selectedId = -1;
                refreshTable();
            } else {
                JOptionPane.showMessageDialog(this, "Pilih data di tabel terlebih dahulu!");
            }
        });

        btnHapus.addActionListener(e -> {
            if (selectedId != -1) {
                service.delete(selectedId);
                txtNama.setText("");
                selectedId = -1;
                refreshTable();
            } else {
                JOptionPane.showMessageDialog(this, "Pilih data di tabel terlebih dahulu!");
            }
        });

        btnReset.addActionListener(e -> {
            if(service.isEmpty()){
                service.indexReset();
                JOptionPane.showMessageDialog(this, "Index berhasil di reset ke 0");
            } else {
                JOptionPane.showMessageDialog(this, "Kosongkan tabel terlebih dahulu sebelum reset index!");
            }
        });

        refreshTable();
    }

    private void refreshTable() {
        modelTabel.setRowCount(0); 
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            modelTabel.addRow(new Object[]{mhs.getId(), mhs.getNama()});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FrameUtama().setVisible(true));
    }
}