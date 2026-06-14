/*
 * File      : Kucing.java
 * Deskripsi : Kelas turunan Anabul (Kucing) dengan atribut bobot
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 28 April 2026
 */

public class Kucing extends Anabul {
    protected double bobot; 

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void gerak() { System.out.println(nama + " berjalan melata."); }

    @Override
    public void bersuara() { System.out.println(nama + " bersuara: Meong!"); }
}