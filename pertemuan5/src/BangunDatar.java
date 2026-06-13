/*
 * Nama File  : BangunDatar.java
 * Deskripsi  : berisi class BangunDatar yang merepresentasikan bangun datar
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   :  2026
 */

public abstract class BangunDatar{
    /* ATRIBUT */
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /* METHOD */

    public BangunDatar(){
        counterBangunDatar++;
    }

    public bangunDatar(int jmlSisi, String warna, string border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;

        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    /* ABSTRACT METHOD */
    public abstract double getLuas();

    public abstract double getKeliling();

    /* METHOD BOOLEAN */

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    /* METHOD PENAMPILAN */

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public void printCounterBangunDatar(){
        System.out.println("Jumlah objek terinisiasi: " + counterBangunDatar);
    }







}