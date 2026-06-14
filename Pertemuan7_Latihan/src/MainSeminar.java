/*
 * File      : MainSeminar.java
 * Deskripsi : Program utama untuk menguji interaksi Polimorfisme pada Seminar
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public class MainSeminar {
    public static void main(String[] args) {
        Seminar sem = new Seminar();

        Dosen d1 = new Dosen("Dr. Budi", "19700101");
        Dosen d2 = new Dosen("Prof. Siti", "19650202");

        MahasiswaCivitas m1 = new MahasiswaCivitas("Ali", "24001");
        MahasiswaCivitas m2 = new MahasiswaCivitas("Bina", "24002");
        MahasiswaCivitas m3 = new MahasiswaCivitas("Caca", "24003");
        MahasiswaCivitas m4 = new MahasiswaCivitas("Deni", "24004");
        MahasiswaCivitas m5 = new MahasiswaCivitas("Eka", "24005");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);

        sem.registrasi(d1);
        sem.registrasi(d2);
        sem.registrasi(m1);
        sem.registrasi(m2);
        sem.registrasi(m3);
        sem.registrasi(m4);
        sem.registrasi(m5);

        System.out.println("Total Peserta Seminar Terdaftar: " + sem.countPeserta());

        System.out.println("Total Mahasiswa yang Hadir   : " + sem.countMahasiswa());

        sem.tampilPeserta();

        System.out.println("\n--- Data Spesifik Mahasiswa ---");
        m1.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();

        /*
         * JAWABAN PERTANYAAN RENUNGAN MODUL
         * * Pertanyaan: Simpulkan bagaimana cara kerja Polimorfisme sesuai kalimat Anda sendiri!
         * * Jawaban:
         * Polimorfisme adalah konsep di mana satu entitas (seperti nama fungsi atau referensi objek) 
         * dapat mewakili berbagai bentuk dan perilaku yang berbeda. 
         * - Pada Overloading (Ad Hoc), polimorfisme bekerja pada saat kompilasi (compile-time) 
         * di mana satu nama metode dapat dipanggil dengan berbagai parameter berbeda. 
         * - Pada Inclusion (Universal), polimorfisme bekerja pada saat eksekusi (run-time) 
         * di mana tipe data kelas induk (seperti array Civitasakademika) dapat menyimpan dan 
         * mengenali secara otomatis bentuk asli dari objek turunannya (Dosen atau Mahasiswa), 
         * sehingga metode yang dipanggil (seperti getNomor()) menyesuaikan dengan 
         * implementasi pada masing-masing kelas anak.
         */
    }
}