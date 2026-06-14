package jdbc.service;

/*
 * File      : MysqlMahasiswaService.java
 * Deskripsi : Kelas pengelola logika bisnis (Service/Controller) untuk objek Mahasiswa
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 12 Mei 2026
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    /** Membuat objek mahasiswa kosong */
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    /** Menambahkan data mahasiswa (Create) */
    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
            PreparedStatement pstmt = koneksi.prepareStatement(query);
            pstmt.setInt(1, mhs.getId());
            pstmt.setString(2, mhs.getNama());
            pstmt.executeUpdate();
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Update data mahasiswa (Update) */
    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
            PreparedStatement pstmt = koneksi.prepareStatement(query);
            pstmt.setString(1, mhs.getNama());
            pstmt.setInt(2, mhs.getId());
            pstmt.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Delete data mahasiswa sesuai id (Delete) */
    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id = ?";
            PreparedStatement pstmt = koneksi.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Ambil mahasiswa sesuai id (Read One) */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id = ?";
            PreparedStatement pstmt = koneksi.prepareStatement(query);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }

    /** Ambil semua isi tabel mahasiswa (Read All) */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        try {
            String query = "SELECT * FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                listMhs.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMhs;
    }
    
    /* * [Diskusi / Tanya Jawab]
     * Q: Mengapa menggunakan PreparedStatement dan bukan Statement biasa seperti di Praktikum 3.1 Bagian 1?
     * A: PreparedStatement memisahkan parameter (yang diwakili oleh '?') dari sintaks SQL. 
     * Ini melindungi aplikasi kita dari eksploitasi SQL Injection jika pengguna memasukkan karakter berbahaya.
     */
}