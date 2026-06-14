package jdbc.model;

/*
 * File      : Mahasiswa.java
 * Deskripsi : Model (Persistent Object) untuk merepresentasikan tabel mahasiswa
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 12 Mei 2026
 */
public class Mahasiswa {
    private int id;
    private String nama;

    public Mahasiswa() {
        this.id = 0;
        this.nama = "";
    }

    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa(id=" + id + ", nama=" + nama + ')';
    }
}