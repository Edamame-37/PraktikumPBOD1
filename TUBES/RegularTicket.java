/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : RegularTicket.java
 * Deskripsi : Class RegularTicket untuk merepresentasikan tiket reguler yang memiliki ID dan harga
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

public class RegularTicket extends Ticket {
    /**********ATRIBUT************/
    public static int counterRegularTicket = 0;

    /**********METHOD************/
    public RegularTicket() {counterRegularTicket++;}
    public RegularTicket(String id, double price) {
        super(id,price);
        counterRegularTicket++;
    }

    public static int getCounterRegularTicket() {
        return counterRegularTicket;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
