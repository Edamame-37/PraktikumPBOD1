/*
 * Nama File  : Lingkaran.java
 * Deskripsi  : Class Anak Lingkaran.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 17 Maret 2026
*/

public class Lingkaran extends BangunDatar implements IResize{

    private double jari;

    public Lingkaran() {
        jmlSisi = 1;

    }
    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        jari = diameter/2;
        jmlSisi = 1;

    }
    public Lingkaran(double sisi) {
        this.jari = sisi;
        this.warna = " ";
        this.border = " ";
        jmlSisi = 1;

    }

    public double getJari() {
        return jari;
    }
    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI*jari*jari;
    }

    @Override
    public double getKeliling() {
        return Math.PI*jari*2;
    }

    public double getDiameter() {
        return 2*jari;
    }
    @Override
    public void zoomIn() {
        jari = jari*1.1;
    }

    @Override 
    public void zoomOut() {
        jari = jari*0.9;
    }

    @Override 
    public void zoom(int percent) {
        jari = jari * percent/100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("jari : " + jari);
    }


}
