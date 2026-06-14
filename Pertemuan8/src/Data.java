/*
 * File      : Data.java
 * Deskripsi : Kelas Larik Generik berkapasitas 100 elemen
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 28 April 2026
 */

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return ruang[posisi - 1];
        }
        return null;
    }

    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null && objek != null) {
                banyak++;
            } 
            else if (ruang[posisi - 1] != null && objek == null) {
                banyak--;
            }
            ruang[posisi - 1] = objek;
        } else {
            System.out.println("Posisi di luar batas 1-100!");
        }
    }

    public int getSize() {
        return banyak;
    }
}