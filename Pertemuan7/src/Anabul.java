/*
 * File      : Anabul.java
 * Deskripsi : Kelas Induk untuk hewan peliharaan
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}