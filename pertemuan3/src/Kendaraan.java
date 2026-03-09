/*
 * Nama File  : Kendaraan.java
 * Deskripsi  : berisi class Kendaraan yang merepresentasikan Kendaraan yang dimiliki mahasiswa
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 3 Maret 2026
 */

public class Kendaraan {

    /*************ATRIBUT*************/
    public String noPlat;
    public String jenis;

    /*************METHOD*************/
    public Kendaraan () {
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan (String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat () {
        return this.noPlat;
    }

    public String getJenis () {
        return this.jenis;
    }

    public void setNoPlat (String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis (String jenis) {
        this.jenis = jenis;
    }
}
