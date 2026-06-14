/*
 * File      : Burung.java
 * Deskripsi : Kelas anak Anabul untuk Burung
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public class Burung extends Anabul {
    public Burung(String nama) { super(nama); }

    @Override
    public void gerak() { System.out.println(nama + " bergerak dengan terbang."); }

    @Override
    public void bersuara() { System.out.println(nama + " bersuara: Cuit cuit!"); }
}