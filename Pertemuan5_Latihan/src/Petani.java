/*
 * Nama File  : Petani.java
 * Deskripsi  : child class petani.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{

    private String asal_kota;
    private static int counterPetani;

    public Petani() {
        counterPetani++;
    }
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, 
        double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        
        counterPetani++;
    }
    public String getAsalKota() {
        return asal_kota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }
    public void setAsalKota(String x) {
        this.asal_kota = x;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota   : " + asal_kota);
    }
    //asumsi masa kerja dalam tahun
    @Override
    public int hitungMasaKerja() {
        LocalDate tglSekarang = LocalDate.now();
        Period masaKerja = Period.between(tgl_mulai_kerja, tglSekarang);
        return masaKerja.getYears() + 1;
    }
    @Override
    public double hitungPajak() {
        return 0;
    }    
}