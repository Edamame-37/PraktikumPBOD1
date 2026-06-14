/*
 * Nama File  : MPegawai.java
 * Deskripsi  : main driver class pegawai.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 10 Maret 2026
*/

import java.time.LocalDate;

public class MPegawai {

    public static void main(String[] args) {
        Tendik A1 = new Tendik();
        A1.setBidang("Kemahasiswaan");
        A1.setNip("1223344");
        A1.setNama("Budi Setiyadi");
        LocalDate x = LocalDate.of(1994, 3, 3);
        A1.setTanggalLahir(x);
        A1.setTmt(LocalDate.of(2013, 12, 12));
        A1.setGajiPokok(5000000.00);

        System.out.println("Informasi Tenaga Kependidikan : ");
        A1.printInfo();

        Tendik A2 = new Tendik("21515616", "Tejo Ineg", LocalDate.of(1974,1,23), 
        LocalDate.of(2001,10,29), 10000000.00,"Sumber Daya");

        System.out.println("\nInformasi Tenaga Kependidikan A2 : ");
        A2.printInfo();

        System.out.println("\nInformasi Dosen Tamu D1 : ");
        
        DosenTamu D1 = new DosenTamu("98908080", "Ayan Jojo", LocalDate.of(1980, 5, 12),LocalDate.of(2001, 2, 27),5000000,"8908098","FPIK",
        LocalDate.of(2012, 10, 20));
        
        D1.printInfo();
        
        System.out.println("\nInformasi Dosen Tetap D2 : ");
        DosenTetap D2 = new DosenTetap("98908080", "Ayan Jojo", LocalDate.of(1980, 5, 12),LocalDate.of(2001, 2, 27),5000000,"8908098","FPIK");

        D2.printInfo();
    
    
    }
}
