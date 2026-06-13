/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : VIPTicket.java
 * Deskripsi : Class VIPTicket untuk merepresentasikan tiket VIP yang memiliki harga khusus
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

public class VIPTicket extends Ticket{
    /**********ATRIBUT************/
    private static int counterVipTicket = 0;

    /**********METHOD************/
    public VIPTicket() {
        counterVipTicket++;
    }
    public VIPTicket(String ticketId, double price) {
        super(ticketId,price);
        counterVipTicket++;
    }
    public static int getCounterVipTicket() {
        return counterVipTicket;
    }
    
    @Override
    public double getPrice() {
        return basePrice + (basePrice*0.20);
    }
}
