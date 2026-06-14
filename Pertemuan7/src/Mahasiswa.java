/*
 * File      : Mahasiswa.java
 * Deskripsi : Kelas Mahasiswa untuk ilustrasi Overloading (Bagian II)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */

public class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    public void tampilData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + programStudi);
    }
}