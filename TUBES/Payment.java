/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : Payment.java
 * Deskripsi : Interface Payment untuk merepresentasikan metode pembayaran
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

public interface Payment {
    /**********ATRIBUT************/

    /**********METHOD************/
    void processPayment(double amount) throws PaymentException;
}
