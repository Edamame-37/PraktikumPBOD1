/*
 * Nama File  : MTitik.java
 * Deskripsi  : berisi main program untuk menggunakan class Titik
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 24 Februari 2026
 */

public class MGaris {

    public static void main(String[] args) {

        Titik T1 = new Titik(0.0, 0.0);
        Titik T2 = new Titik(4.0, 4.0);

        Garis G1 = new Garis(T1, T2);
        G1.printGaris();

        System.out.println("Titik Awal G1: " + G1.getAwal().getAbsis() + ", " + G1.getAwal().getOrdinat());
        System.out.println("Titik Akhir G1: " + G1.getAkhir().getAbsis() + ", " + G1.getAkhir().getOrdinat());

        G1.setAwal(new Titik(1.0, 1.0));
        G1.setAkhir(new Titik(5.0, 5.0));
        G1.printGaris();

        System.out.println("Titik Awal G1 Baru: " + G1.getAwal().getAbsis() + ", " + G1.getAwal().getOrdinat());
        System.out.println("Titik Akhir G1 Baru: " + G1.getAkhir().getAbsis() + ", " + G1.getAkhir().getOrdinat());

        System.out.println("Panjang garis G1: " + G1.PanjangGaris());

        System.out.println("Gradien G1: " + G1.getGradien());

        Titik tengah = G1.titikTengah();
        System.out.print("Titik tengah G1: ");
        tengah.printTitik();

        Titik T3 = new Titik(1, 1);
        Titik T4 = new Titik(5, 5);
        Garis G2 = new Garis(T3, T4);

        System.out.println("Apakah G1 sejajar G2? " + G1.isSejajar(G2));

        Titik T5 = new Titik(0, 0);
        Titik T6 = new Titik(4, -4);
        Garis G3 = new Garis(T5, T6);

        System.out.println("Gradien G3: " + G3.getGradien());
        System.out.println("Apakah G1 tegak lurus G3? " + G1.isTegakLurus(G3));

        G1.persamaanGaris();

        Garis G4 = new Garis();
        G4.printGaris();

        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
    }
}