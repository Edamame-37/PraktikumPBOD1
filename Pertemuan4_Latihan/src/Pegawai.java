/*
 * Nama File  : Pegawai.java
 * Deskripsi  : berisi class Pegawai yang merepresentasikan objek Pegawai.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 10 Maret 2026
*/

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai() {

    }
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }
    public String nama() {
        return nama;
    }
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }
    public LocalDate getTmt() {
        return tmt;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    @SuppressWarnings("deprecation")
    protected String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format((formatter));
    }

    @SuppressWarnings("deprecation")
    protected String formatMataUang(double uang) {
        Locale localeID = new Locale("id","ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        String hasil = formatRupiah.format(uang);

        return hasil;
    }

    public abstract Period getMasaKerja(); 

    public abstract void printInfo();

    public abstract double getTunjangan();

}
