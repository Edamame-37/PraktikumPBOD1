/*
Tugas Kelompok Pemrograman Berorientasi Objek
Kelas: Pemrograman Berorientasi Objek = D (PBO D)

 * File      : User.java
 * Deskripsi : Class User untuk merepresentasikan pengguna sistem
 * Pembuat   : Muhammad Firdaus Argifari   24060124130107
               Naufal Dwi Yusmawan         24060124130075
               Naufal Rayan Attallah       24060124140170
               Rafa Azlan                  24060124140126
               Basil Ayman                 24060124140160
 * Tanggal   : 31 Maret 2026
 */

public abstract class User {
    /**********ATRIBUT************/
    protected String username;
    protected String email;
    protected static int counterUser = 0;

    /**********METHOD************/
    public User() {
        counterUser++;
    }
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        counterUser++;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static int getCounterUser() {
        return counterUser;
    }

    public abstract void printInfo();

}
