/*
 * Nama File  : MMahasiswa.java
 * Deskripsi  : berisi main program untuk menggunakan class Mahasiswa
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 3 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("119", "Mamat Asli jagakarsa", "Informatika");
        Dosen D1 = new Dosen("67", "Asep asli subang", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234HHH", "Mobil");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah: " + M1.getJumlahSKS());
    }
}
