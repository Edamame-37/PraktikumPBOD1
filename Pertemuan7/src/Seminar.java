/*
 * File      : Seminar.java
 * Deskripsi : Kelas pengelola kegiatan Seminar dan array pesertanya
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakpeserta = 0;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika pesertaBaru) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = pesertaBaru;
            banyakpeserta++;
        } else {
            System.out.println("Kapasitas seminar penuh!");
        }
    }

    public void tampilPeserta() {
        System.out.println("--- Daftar Peserta Seminar ---");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i+1) + ". Nomor: " + pesertas[i].getNomor() + " | Nama: " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int jumlahMahasiswa = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof MahasiswaCivitas) {
                jumlahMahasiswa++;
            }
        }
        return jumlahMahasiswa;
    }
}