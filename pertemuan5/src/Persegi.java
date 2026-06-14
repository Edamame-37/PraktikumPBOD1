/*
 * Nama File  : Persegi.java
 * Deskripsi  : Class Anak Persegi.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 17 Maret 2026
*/

public class Persegi extends BangunDatar implements IResize{
    private double sisi;
    
    public Persegi() {
        jmlSisi = 4;
    }
    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
        jmlSisi = 4;

    }
    public Persegi(double sisi) {
        this.sisi = sisi;
        this.warna = " ";
        this.border = " ";
        jmlSisi = 4;

    }
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi*sisi;
    }

    @Override
    public double getKeliling() {
        return sisi*4;
    }


    public double getDiagona() {
        return sisi*Math.sqrt(2);
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

    @Override
    public void zoomIn() {
        sisi = sisi*1.1;
    }

    @Override 
    public void zoomOut() {
        sisi = sisi*0.9;
    }

    @Override 
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }
}