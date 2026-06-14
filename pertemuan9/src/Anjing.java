/*
 * File      : Anjing.java
 * Deskripsi : Kelas turunan Anabul (Anjing)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 5 Mei 2026
 */

public class Anjing extends Anabul {
    public Anjing(String panggilan) { super(panggilan); }

    @Override
    public void gerak() { System.out.println(panggilan + " berlari."); }

    @Override
    public void bersuara() { System.out.println(panggilan + " bersuara: Guk guk!"); }
}