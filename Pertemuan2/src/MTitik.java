/*
 * Nama File  : MTitik.java
 * Deskripsi  : berisi main program untuk menggunakan class Titik
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 24 Februari 2026
 */

public class MTitik {

    public static void main(String[] args) {

        Titik T1 = new Titik();
        T1.setAbsis(2);
        T1.setOrdinat(4);
        T1.printTitik();

        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = new Titik(T1.getAbsis(), T1.getOrdinat());
        T2.printTitik();

        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik();
        T3.printTitik();
        T4.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        Titik T5 = new Titik(-5.0, 9.0);
        T5.printTitik();

        System.out.println("Absis titik T5 adalah: " + T5.getAbsis());
        System.out.println("Ordinat titik T5 adalah: " + T5.getOrdinat());

        T2.geser(5.0, 4.0);
        T2.printTitik();

        System.out.println("Kuadran Titik T5 adalah: Kuadran " + T5.getKuadran());

        System.out.println("Jarak titik T5 dari titik (0,0) adalah: "
                + T5.getJarakPusat());

        System.out.println("Jarak titik T5 dari titik T1 adalah: "
                + T5.getJarak(T1));

        T5.refleksiX();
        T5.printTitik();

        T5.refleksiY();
        T5.printTitik();
    }
}