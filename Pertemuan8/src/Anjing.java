/*
 * File      : Anjing.java
 * Deskripsi : Kelas turunan Anabul (Anjing)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 28 April 2026
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() { System.out.println(nama + " berlari."); }

    @Override
    public void bersuara() { System.out.println(nama + " bersuara: Guk guk!"); }
}