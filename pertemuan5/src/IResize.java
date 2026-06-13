/* Nama File    : IResize.java
 * Deskripsi    : Interface untuk operasi perubahan ukuran bangun datar
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 21 Maret 2026
 */

/**
 * Kontrak perilaku resize yang harus didukung kelas implementor.
 */
public interface IResize {
    // Menambah ukuran menjadi 10% lebih besar.
    public void zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil.
    public void zoomOut();

    // Menskalakan ukuran sesuai input persentase.
    public void zoom(int percent);
}