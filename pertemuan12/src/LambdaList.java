/*
 * File      : LambdaList.java
 * Deskripsi : Implementasi lambda pada List, digunakan sebagai parameter pada method
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 26 Mei 2026
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}