package jdbc.program;

/*
 * File      : Program.java
 * Deskripsi : Program utama untuk mensimulasikan CRUD pada database
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 12 Mei 2026
 */

import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    // Prosedur tambahan untuk menampilkan semua data (sesuai output modul)
    static void displayAll() {
        System.out.println("===displayAll===");
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa m : listMhs) {
            System.out.println(m);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("");

        // insert
        System.out.println("===insert===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // update
        System.out.println("===update===");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // delete
        System.out.println("===delete===");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
        
        /* 
         * Q: Mengapa output displayAll() di modul sudah ada data (Nina, Rudi, Beni) 
         * padahal tidak ada di kode insert?
         * A: Karena data Nina, Rudi, dan Beni diasumsikan sudah Anda isi secara manual 
         * melalui phpMyAdmin/terminal sebelum program ini dijalankan. Program Java ini 
         * kemudian menambah, mengubah, dan menghapus record "Haryo/Dinaya".
         */
    }
}