/*
 * Nama File  : AngkaSialException.java
 * Deskripsi  : pengaplikasian eksepsi.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 24 Maret 2026
*/

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial");
    }
}