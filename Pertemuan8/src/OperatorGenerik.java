/*
 * File      : OperatorGenerik.java
 * Deskripsi : Kelas yang berisi operator/metode generik (Tukar & Bobot2)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 28 April 2026
 */

public class OperatorGenerik {
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public <T1 extends Kucing, T2 extends Kucing> double Bobot2(T1 k1, T2 k2) {
        return k1.getBobot() + k2.getBobot();
    }
}