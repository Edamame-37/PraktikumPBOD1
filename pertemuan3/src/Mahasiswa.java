/*
 * Nama File  : Mahasiswa.java
 * Deskripsi  : berisi class Mahasiswa yang merepresentasikan Mahasiswa yang berelasi dengan dosen, matakuliah, dan kendaraan.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 3 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    
    /*************ATRIBUT*************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*************METHOD*************/

    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<MataKuliah>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<MataKuliah>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public String getnim(){
        return this.nim;
    }

    public String getnama(){
        return this.nama;
    }

    public String getprodi(){
        return this.prodi;
    }

    public void setnim(String nim){
        this.nim = nim;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }

    public void addMatKul(MataKuliah matkul){
        this.listMatKul.add(matkul);
    }

    public void setDosenWali(Dosen dosen){
        this.dosenWali = dosen;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul(){
        return this.listMatKul.size();
    }

    public void printMhs(){
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Prodi: " + this.prodi);
    }

    public void printDetailMhs(){
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Prodi: " + this.prodi);

        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah matkul : listMatKul) {
            System.out.println("- " + matkul.getNama() + " (" + matkul.getSks() + " SKS)");
        }

        System.out.println("Dosen Wali: " + this.dosenWali.getNama());
        System.out.println("Kendaraan: " + this.kendaraan.getJenis() + " dengan No. Plat " + this.kendaraan.getNoPlat());
    }
}
