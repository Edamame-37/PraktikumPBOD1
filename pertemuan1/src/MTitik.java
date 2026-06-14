/*
 * Nama File  : MTitik.java
 * Deskripsi  : berisi main program untuk menggunakan class Titik
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 17 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(10,6);
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik(); 
        T1.geser(3,4);
        System.out.println("Kondisi titik sekarang: ");
        System.out.print("T1 : ");
        T1.printTitik(); 
        System.out.print("T2 : ");
        T2.printTitik();
        System.out.print("Banyak objek titik: ");
        T1.printCounterTitik();
        int kuadranTitik = T1.getKuadran();
        System.out.printf("Kuadran Titik T1 : %d\n", kuadranTitik);
        double jarakPusat = T1.getJarakPusat();
        System.out.println("Jarak dari pusat pada Titik T1 : "+jarakPusat);
        double jarakAntarTitik = T1.getJarak(T2);
        System.out.printf("Jarak T1 dan T2: %.2f\n",jarakAntarTitik);
        T2.refleksiX();
        System.out.print("Titik T2 setelah refleksiX :");
        T2.printTitik();
        T2.refleksiY();
        System.out.print("Titik T2 setelah refleksiY :");
        T2.printTitik();
        Titik T3 = new Titik();
        T3 = T1.getRefleksiX();
        System.out.print("Titik T3 (refleksiX Titik T1 :");
        T3.printTitik();
        Titik T4 = new Titik();
        T4 = T1.getRefleksiY();
        System.out.print("Titik T4 (refleksiY Titik T1): ");
        T4.printTitik();
    }
}