package jdbc.service;

/*
 * File      : MysqlMahasiswaService.java
 * Deskripsi : Kelas Controller CRUD ke DB MySQL
 */

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
            PreparedStatement pstmt = koneksi.prepareStatement(query);
            pstmt.setString(1, mhs.getNama());
            pstmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
            PreparedStatement pstmt = koneksi.prepareStatement(query);
            pstmt.setString(1, mhs.getNama());
            pstmt.setInt(2, mhs.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id = ?";
            PreparedStatement pstmt = koneksi.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id = ?";
            PreparedStatement pstmt = koneksi.prepareStatement(query);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        try {
            String query = "SELECT * FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                listMhs.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return listMhs;
    }

    public void indexReset() {
        try {
            String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
            Statement stmt = koneksi.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Index di reset ke 0");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public boolean isEmpty() {
        boolean empty = true;
        try {
            String query = "SELECT COUNT(*) AS count FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next() && rs.getInt("count") > 0) {
                empty = false;
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return empty;
    }

    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }
}