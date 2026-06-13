/*
 * Nama File  : Dosen.java
 * Deskripsi  : berisi class Dosen yang merepresentasikan dosen wali mahasiswa
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 3 Maret 2026
 */



public class Dosen {
    
    /*************ATRIBUT*************/
    public String nip;
    public String nama;
    public String prodi;

    /*************METHOD*************/
    public Dosen () {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen (String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip () {
        return this.nip;
    }

    public String getNama () {
        return this.nama;
    }

    public String getProdi () {
        return this.prodi;
    }

    public void setNip (String nip) {
        this.nip = nip;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public void setProdi (String prodi) {
        this.prodi = prodi;
    }
}