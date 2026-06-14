/*
 * File      : MainAnabul.java
 * Deskripsi : Program simulasi polimorfisme inclusion pada Anabul
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] peliharaan = new Anabul[3];
        peliharaan[0] = new Kucing("Mochi");
        peliharaan[1] = new Anjing("Heli");
        peliharaan[2] = new Burung("Rio");

        System.out.println("Simulasi Anabul");
        for (Anabul a : peliharaan) {
            a.gerak();
            a.bersuara();
            System.out.println("-");
        }
    }
}