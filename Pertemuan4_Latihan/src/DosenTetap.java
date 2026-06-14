/*
 * Nama File  : DosenTetap.java
 * Deskripsi  : berisi class Dosen Tetap yang merepresentasikan objek Dosen Tetap.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 10 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Pegawai {

    private String nidn;
    private String fakultas;
    
    public DosenTetap() {

    }
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, 
        double gajiPokok, String nidn, String fakultas) {
            super(nip,nama,tanggalLahir,tmt,gajiPokok);
            this.nidn = nidn;
            this.fakultas = fakultas;
    }

    public String getNidn() {
        return nidn;
    }
    public String getFakultas() {
        return fakultas;
    }
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        Period masaKerja = getMasaKerja();
        double tunjangan = getTunjangan();
        LocalDate tanggalPensiun = tanggalLahir.plusYears(65).withDayOfMonth(1).plusMonths(1);


        System.out.println("NIP : " + nip);
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(tanggalPensiun));
        System.out.println("Gaji Pokok : " + formatMataUang(gajiPokok));
        System.out.println("Tunjangan : " + formatMataUang(tunjangan));
    }

    @Override 
    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.of(2025,03,10));
    }

    @Override 
    public double getTunjangan() {
        return 0.02*getMasaKerja().getYears()*gajiPokok;
    }
    
}

