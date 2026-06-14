/*
 * File      : Anabul.java
 * Deskripsi : Kelas abstrak induk untuk hewan peliharaan (ditambahkan atribut panggilan)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 5 Mei 2026
 */

public abstract class Anabul {
    protected String panggilan;

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}