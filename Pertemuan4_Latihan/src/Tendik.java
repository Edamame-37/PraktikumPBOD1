/*
 * Nama File  : Tendik.java
 * Deskripsi  : berisi class tendik yang merepresentasikan objek tendik.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 10 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{

    private String bidang;

    public Tendik() {

    }

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,String bidang) {
        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        Period masaKerja = getMasaKerja();
        double tunjangan = getTunjangan();
        LocalDate tanggalPensiun = tanggalLahir.plusYears(55).withDayOfMonth(1).plusMonths(1);


        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Tenaga Kependidikan");
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(tanggalPensiun));
        System.out.println("Gaji Pokok : " + formatMataUang(gajiPokok));
        System.out.println("Tunjangan : " + formatMataUang(tunjangan));
    }

    @Override
    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.of(2025, 3, 10));
    }

    @Override 
    public double getTunjangan() {
        return 0.01 * getMasaKerja().getYears() * gajiPokok;
    }


    
}
