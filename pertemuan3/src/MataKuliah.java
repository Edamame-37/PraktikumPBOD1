/*
 * Nama File  : MataKuliah.java
 * Deskripsi  : berisi class MataKuliah yang merepresentasikan MataKuliah yang diambil mahasiswa
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 3 Maret 2026
 */

public class MataKuliah {

    /*************ATRIBUT*************/
    public String idMatkul;
    public String nama;
    public int sks;

    /*************METHOD*************/
    public MataKuliah () {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah (String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul () {
        return this.idMatkul;
    }

    public String getNama () {
        return this.nama;
    }

    public int getSks () {
        return this.sks;
    }

    public void setIdMatkul (String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public void setSks (int sks) {
        this.sks = sks;
    }
}
