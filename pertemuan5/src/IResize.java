/*
 * Nama File  : IResize.java
 * Deskripsi  : interface IResize.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 17 Maret 2026
*/

public interface IResize {

    // memperbesar ukuran 10%
    public void zoomIn();

    // memperkecil ukuran 10%
    public void zoomOut();

    // menaksirkan ukuran sesuai dengan input yg diberikan
    public void zoom(int percent);
}