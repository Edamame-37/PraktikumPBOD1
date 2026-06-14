/*
 * File      : Datum.java
 * Deskripsi : Kelas Generik untuk menyimpan satu nilai (wrapper)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 28 April 2026
 */

public class Datum<T> {
    private T isi;

    public Datum() { }

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}