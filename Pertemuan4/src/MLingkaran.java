/*
 * Nama File  : MLingkaran.java
 * Deskripsi  : berisi class MLingkaran yang merepresentasikan objek lingkaran.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 10 Maret 2026
*/

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(7, "Biru", "Dashed");
        System.out.println("Lingkaran 1:");
        l1.printInfo();
        System.out.println("Jari-jari: " + l1.getJari());
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());
    }
    
}
