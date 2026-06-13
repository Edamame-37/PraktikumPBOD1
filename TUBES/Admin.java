/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : Admin.java
 * Deskripsi : Class Admin untuk merepresentasikan administrator yang memiliki ID karyawan
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

import java.util.List;

public class Admin extends User {
    /**********ATRIBUT************/
    private String employeeId;
    private static int counterAdmin = 0;

    /**********METHOD************/
    public Admin() {
        counterAdmin++;
    }
    public Admin(String username, String email, String employeeId) {
        super(username,email);
        this.employeeId = employeeId;
        counterAdmin++;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public static int gerCounterAdmin() {
        return counterAdmin;
    }

    @Override
    public void printInfo() {

        System.out.println("ADMIN INFO : ");
        System.out.println("Username : " + username);
        System.out.println("Email : " + email);
        System.out.println("Employee Id : " + employeeId);
    }
    
    public void updateTicketPrice(Ticket t, double newPrice) {
        assert newPrice > 0: "Admin dilarang memasukkan harga negatif";
        
        t.basePrice = newPrice;
        System.out.println("Admin " + username + " memperbarui harga ticket " + t.ticketId + 
        " menjadi: " + newPrice);
        
    }
    public void removeTicket(List<Ticket> list, Ticket t) {
        list.remove(t);
        System.out.println("Ticket dihapus dari sistem");
        
    }
    public void removeTicket(List<Ticket> list, String ticketId) {
        list.removeIf(t -> t.ticketId.equals(ticketId));
        System.out.println("Ticket dengan id " + ticketId + " dihapus dari sistem");
        
    }
}
