/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : Customer.java
 * Deskripsi : Class Customer untuk merepresentasikan pelanggan yang memiliki poin loyalitas
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

public class Customer extends User{
    /**********ATRIBUT************/
    private int loyalPoints;
    private static int counterCustomer = 0;

    /**********METHOD************/
    public Customer() {
        counterCustomer++;
    }
    public Customer(String username, String email, int loyalPoints) {
        super(username,email);
        this.loyalPoints = loyalPoints;
        counterCustomer++;
    }

    public int getLoyalPoints() {
        return loyalPoints;
    }
    public static int getCounterCustomer() {
        return counterCustomer;
    }

    @Override
    public void printInfo() {

        System.out.println("CUSTOMER INFO: ");
        System.out.println("Username : " + username);
        System.out.println("Email : " +email);
        System.out.println("Loyal Points : " + loyalPoints);
    }


}
