/*
 * File      : Civitasakademika.java
 * Deskripsi : Kelas rujukan (induk) untuk peserta seminar
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public abstract class Civitasakademika {
    protected String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getNomor();
}