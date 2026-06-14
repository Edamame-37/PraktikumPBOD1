/*
 * File      : Kucing.java
 * Deskripsi : Kelas anak Anabul untuk Kucing
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public class Kucing extends Anabul {
    public Kucing(String nama) { super(nama); }

    @Override
    public void gerak() { System.out.println(nama + " bergerak dengan melata."); }

    @Override
    public void bersuara() { System.out.println(nama + " bersuara: Meong!"); }
}