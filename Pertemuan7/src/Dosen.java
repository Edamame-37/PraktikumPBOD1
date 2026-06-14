/*
 * File      : Dosen.java
 * Deskripsi : Kelas anak Civitasakademika untuk Dosen
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public class Dosen extends Civitasakademika {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}