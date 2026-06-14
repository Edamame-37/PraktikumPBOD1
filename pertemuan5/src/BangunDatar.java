/*
 * Nama File  : BangunDatar.java
 * Deskripsi  : Class Parent Bangun Datar.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 17 Maret 2026
*/

public abstract class BangunDatar {

    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Data : " + counterBangunDatar);
    }

    public int getJumlSisi() {
        return jmlSisi;
    }
    public void setJumlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getBorder() {
        return border;
    }
    public void setBorder(String border) {
        this.border = border;
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public  void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi );
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }

    public boolean isEqualLuas(BangunDatar x) {
        return this.getLuas() == x.getLuas();
    }
}
