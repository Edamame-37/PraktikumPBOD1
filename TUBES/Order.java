/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : Order.java
 * Deskripsi : Class Order untuk merepresentasikan pesanan yang memiliki customer dan daftar tiket yang dibeli
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

import java.util.ArrayList;
import java.util.List;

public class Order {
    /**********ATRIBUT************/
    private Customer customer;
    private List<Ticket> items = new ArrayList<>();

    /**********METHOD************/
    public Order() {
    }
    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public void addTicket(Ticket t) {
        items.add(t);
        System.out.println("Tiket " + t.ticketId + " ditambahkan");
    }
    
    public void addTicket(Ticket t, int qty) {
        for (int i = 0; i < qty;i++) {
            items.add(t);
        }
        System.out.println(qty +" Tiket " + t.ticketId + " ditambahkan");

    }

    public double getTotal() {
        double total = 0;
        for (Ticket t : items) total += t.getPrice();
        return total;
    }
    
}
