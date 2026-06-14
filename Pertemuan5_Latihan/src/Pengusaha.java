/*
 * Nama File  : Pengusaha.java
 * Deskripsi  : child class pengusaha.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{

    private String npwp;
    private static int counterPengusaha;

    public Pengusaha() {
        counterPengusaha++;
    }
    public Pengusaha(String nama,LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama,tglMulaiKerja,alamat,pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    public String getNpwp() {
        return npwp;
    }
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    public void setNpwp(String x) {
        this.npwp = x;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP    : " + npwp);
    }

    //asumsi masa kerja dalam tahun
    @Override
    public int hitungMasaKerja() {
        LocalDate tglSekarang = LocalDate.now();
        Period masaKerja = Period.between(tgl_mulai_kerja, tglSekarang);
        return masaKerja.getYears();
    }
    @Override
    public double hitungPajak() {
        double pajak = 0.15*pendapatan;
        return pajak;
    }

}