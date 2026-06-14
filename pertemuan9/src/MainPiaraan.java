/*
 * File      : MainPiaraan.java
 * Deskripsi : Program utama untuk menguji koleksi antrean Piaraan
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 5 Mei 2026
 */

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        Anjing anjing1 = new Anjing("Heli");
        Burung burung1 = new Burung("Piko");
        Anggora anggora1 = new Anggora("Snowy", 3.5);
        Kembangtelon telon1 = new Kembangtelon("Belang", 4.0);

        System.out.println("--- Proses Antrean Klinik Piaraan ---");
        klinik.enqueueAnabul(anjing1);
        klinik.enqueueAnabul(anggora1);
        klinik.enqueueAnabul(burung1);
        klinik.enqueueAnabul(telon1);

        klinik.showAnabul();
        System.out.println("Banyak anabul antre: " + klinik.getNbelm());

        System.out.println("Apakah 'Heli' ada di antrean? " + klinik.isMember(anjing1));

        System.out.println();
        klinik.showJenisAnabul();

        System.out.println("\nJumlah keluarga Kucing di antrean : " + klinik.countKucing() + " ekor");
        System.out.println("Total bobot keluarga Kucing       : " + klinik.bobotKucing() + " kg");

        System.out.println("\nAnabul giliran pertama (get)      : " + klinik.getAnabul().getNama());
        Anabul dirawat = klinik.dequeueAnabul();
        System.out.println("Memproses anabul... " + dirawat.getNama() + " selesai dirawat.");
        
        System.out.println("\nKondisi antrean setelah 1 anabul dirawat:");
        klinik.showJenisAnabul();

        /*
         * JAWABAN PERTANYAAN RENUNGAN MODUL
         * * Pertanyaan: Simpulkan bagaimana cara kerja konsep Koleksi sesuai kalimat Anda sendiri!
         * * Jawaban:
         * Koleksi (Collection) bekerja sebagai sebuah wadah dinamis yang mampu menyimpan, 
         * mengelola, dan memanipulasi sekumpulan objek (seperti objek String atau Anabul). 
         * Berbeda dengan *array* primitif yang ukurannya kaku dan tetap, struktur data koleksi 
         * di Java (seperti List, Queue, Set) ukurannya dapat membesar atau mengecil secara 
         * otomatis saat program berjalan (*runtime*). Cara kerjanya didukung oleh berbagai 
         * metode bawaan yang sangat memudahkan pemrogram, sehingga kita tidak perlu menulis 
         * logika manual dari nol untuk melakukan pencarian, penambahan antrean (enqueue), 
         * pengeluaran (dequeue), maupun perhitungan elemen di dalamnya.
         */
    }
}