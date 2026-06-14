/*
 * Nama File  : DosenTamu.java
 * Deskripsi  : berisi class Dosen Tamu yang merepresentasikan objek Dosen Tamu.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 10 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Pegawai {

    private LocalDate tanggalAkhirKontrak;
    private String nidk;
    private String fakultas;

    public DosenTamu() {

    }

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, 
        LocalDate tmt, double gajiPokok,String nidk, String fakultas, LocalDate tanggalAkhirKontrak) {
            super(nip,nama,tanggalLahir,tmt,gajiPokok);
            this.nidk = nidk;
            this.fakultas = fakultas;
            this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }
    public String getNidk() {
        return nidk;
    }
    public String getFakultas() {
        return fakultas;
    }
    public LocalDate getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public void setTanggalAkhirKontrak(LocalDate date) {
        this.tanggalAkhirKontrak = date;
    }
    @Override
    public Period getMasaKerja() {
        return Period.between(tmt, tanggalAkhirKontrak);
    }

    @Override
    public double getTunjangan() {
        return 0.025*gajiPokok;
    }

    @Override
    public void printInfo() {
        Period masaKerja = getMasaKerja();
        double tunjangan = getTunjangan();

        System.out.println("NIP : " + nip);
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Akhir Kontrak : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Gaji Pokok : " + formatMataUang(gajiPokok));
        System.out.println("Tunjangan : " + formatMataUang(tunjangan));


    }


}
