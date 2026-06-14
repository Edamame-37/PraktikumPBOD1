/*
 * File      : MahasiswaCivitas.java
 * Deskripsi : Kelas anak Civitasakademika untuk Mahasiswa (dinamakan beda untuk hindari clash)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public class MahasiswaCivitas extends Civitasakademika {
    private String nim;
    private Dosen dosenWali;

    public MahasiswaCivitas(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    public void tampilDataMahasiswa() {
        String namaWali = (dosenWali != null) ? dosenWali.getNama() : "Belum ada";
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Dosen Wali: " + namaWali);
    }
}