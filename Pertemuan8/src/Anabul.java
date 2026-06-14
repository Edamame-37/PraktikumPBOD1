/*
 * File      : Anabul.java
 * Deskripsi : Kelas abstrak induk untuk hewan peliharaan
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 28 April 2026
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}