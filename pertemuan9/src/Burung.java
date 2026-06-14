/*
 * File      : Burung.java
 * Deskripsi : Kelas turunan Anabul (Burung)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 5 Mei 2026
 */

public class Burung extends Anabul {
    public Burung(String panggilan) { super(panggilan); }

    @Override
    public void gerak() { System.out.println(panggilan + " terbang."); }

    @Override
    public void bersuara() { System.out.println(panggilan + " bersuara: Cuit cuit!"); }
}