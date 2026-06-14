/*
 * Nama File  : Lingkaran.java
 * Deskripsi  : berisi class Lingkaran yang merepresentasikan objek lingkaran.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 10 Maret 2026
*/

public class Lingkaran extends BangunDatar{
    /*************ATRIBUT*************/
    private float jari;

    /*************METHOD*************/
    public Lingkaran() {
        this.jari = 0;
    }

    public Lingkaran(float jari, String warna, String border) {
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    public float getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getLuas() {
        return (float) (3.14 * Math.pow(jari, 2));
    }

    public float getKeliling() {
        return (float) (2 * 3.14 * jari);
    }
}
