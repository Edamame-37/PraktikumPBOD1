/*
 * File      : Kucing.java
 * Deskripsi : Kelas turunan Anabul (Kucing) dengan atribut bobot
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 5 Mei 2026
 */

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void gerak() { System.out.println(panggilan + " berjalan melata."); }

    @Override
    public void bersuara() { System.out.println(panggilan + " bersuara: Meong!"); }
}