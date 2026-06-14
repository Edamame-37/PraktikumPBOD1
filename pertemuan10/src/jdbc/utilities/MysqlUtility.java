package jdbc.utilities;

/*
 * File      : MysqlUtility.java
 * Deskripsi : Utility untuk membangun koneksi ke database menggunakan Singleton pattern
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 12 Mei 2026
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver"); // Gunakan com.mysql.cj.jdbc.Driver untuk konektor v8+
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                // sesuaikan username dan password
                String user = "student"; // Ganti "root" jika tidak menggunakan user khusus
                String password = "rahasia"; // Ganti "" jika root Anda tanpa password
                
                koneksi = DriverManager.getConnection(url, user, password);
                
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
    
    /* * [Diskusi / Tanya Jawab]
     * Q: Mengapa kita mengecek "if (koneksi == null)"?
     * A: Ini adalah implementasi pola desain Singleton. Tujuannya agar aplikasi 
     * hanya membuat satu jembatan koneksi ke database selama aplikasi berjalan. 
     * Ini menghemat memori dan menghindari beban (overhead) berlebih pada database.
     */
}