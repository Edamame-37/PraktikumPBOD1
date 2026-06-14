/*
 * Nama File  : PNS.java
 * Deskripsi  : child class PNS.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{ 

    private String nip;
    private static int counterPNS;

    public PNS() {
        counterPNS++;
    }
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        this.nip = nip;
        counterPNS++;
    }
    public String getNip() {
        return nip;
    }
    public static int getCounterPNS() {
        return counterPNS;
    }
    public void setNip(String x) {
        this.nip = x;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP     : " + nip);
    }

    //asumsi masa kerja dalam tahun
    @Override
    public int hitungMasaKerja() {
        LocalDate tglSekarang = LocalDate.now();
        Period masaKerja = Period.between(tgl_mulai_kerja, tglSekarang);
        return masaKerja.getYears() + 7;
    }

    @Override
    public double hitungPajak() {
        double pajak = 0.10*pendapatan;
        return pajak;
    }


}