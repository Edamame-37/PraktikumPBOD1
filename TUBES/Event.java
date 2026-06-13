/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : Event.java
 * Deskripsi : Class Event untuk merepresentasikan sebuah event yang memiliki nama dan daftar tiket yang tersedia
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

import java.util.ArrayList;
import java.util.List;

public class Event {
    /**********ATRIBUT************/
    private String name;
    private List<Ticket> availableTickets = new ArrayList<>();
    public static int counterEvent = 0;

    /**********METHOD************/
    public Event(){
        counterEvent++;
    }
    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public List<Ticket> getAvailableTickets() {
        return availableTickets;
    }

    public void addTicketToEvent(Ticket t) {
        availableTickets.add(t);
    }

}
