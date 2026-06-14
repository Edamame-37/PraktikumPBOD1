package jdbc.utilities;

/*
 * File      : MysqlUtility.java
 * Deskripsi : Utility untuk membangun koneksi ke database
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Gagal Koneksi : " + e.getMessage());
            }
        }
        return koneksi;
    }
}