/*
 * File      : LambdaMap.java
 * Deskripsi : Implementasi lambda pada Map untuk menampilkan NIM dan nama mahasiswa
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 26 Mei 2026
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        mahasiswaMap.put("99999999999999", "bagas");
        mahasiswaMap.put("24060124140127", "Adi");
        mahasiswaMap.put("24060124140128", "Bambang");
        mahasiswaMap.put("24060124140129", "Cici");

        System.out.println("Daftar Mahasiswa");
        
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + " | Nama: " + nama));
    }
}