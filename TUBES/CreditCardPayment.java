/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : CreditCardPayment.java
 * Deskripsi : Class CreditCardPayment untuk merepresentasikan pembayaran dengan kartu kredit
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

public class CreditCardPayment implements Payment{
    /**********ATRIBUT************/
    private String number;

    /**********METHOD************/
    public CreditCardPayment(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        if (amount <= 0) {
            throw new PaymentException("Jumlah pembayaran tidak valid");
        }

        System.out.println("Credit Card No : " + number);
        System.out.println("Pembayaran berhasil sebesar: Rp" + amount);
    }
    
}
