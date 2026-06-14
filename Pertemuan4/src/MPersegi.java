/*
 * Nama File  : MPersegi.java
 * Deskripsi  : berisi class MPersegi yang merepresentasikan objek persegi.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 10 Maret 2026
*/

public class MPersegi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(5, "Merah", "Solid");
        System.out.println("Persegi 1:");
        p1.printInfo();
        System.out.println("Sisi: " + p1.getSisi());
        System.out.println("Luas: " + (p1.getSisi() * p1.getSisi()));
        System.out.println("Keliling: " + (4 * p1.getSisi()));
    }   
}