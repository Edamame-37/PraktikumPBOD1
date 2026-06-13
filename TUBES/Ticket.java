/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : Ticket.java
 * Deskripsi : Class Ticket untuk merepresentasikan sebuah tiket yang memiliki ID dan harga
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

public abstract class Ticket {
    /**********ATRIBUT************/
    protected String ticketId;
    protected double basePrice;

    /**********METHOD************/
    public Ticket(){}
    public Ticket(String ticketId, double basePrice) {
        assert basePrice > 0 : "Harga ticket harus lebih dari 0";
        this.ticketId = ticketId;
        this.basePrice = basePrice;
    }

    public String getTicketId() {
        return ticketId;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double getPrice();
}
