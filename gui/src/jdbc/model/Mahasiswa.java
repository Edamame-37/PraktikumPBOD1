package jdbc.model;

/*
 * File      : Mahasiswa.java
 * Deskripsi : Model untuk merepresentasikan tabel mahasiswa
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

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
}