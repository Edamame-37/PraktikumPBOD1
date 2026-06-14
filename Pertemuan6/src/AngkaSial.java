/*
 * Nama File  : AngkaSial.java
 * Deskripsi  : Pengenalan klausa 'throw' dan 'throws'.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 24 Maret 2026
*/

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
        
        /*
         * JAWABAN PERTANYAAN MODUL 3.4
         * * Pertanyaan 1: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java 
         * di atas dieksekusi?
         * Jawaban 1   : TIDAK. Ketika `angka == 13`, program akan langsung melempar 
         * eksepsi (`throw new AngkaSialException()`). Alur eksekusi 
         * akan langsung keluar dari metode `cobaAngka` dan mencari 
         * blok `catch` terdekat. Sehingga baris 12 tidak pernah dieksekusi.
         * * Pertanyaan 2: Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
         * Jawaban 2   : TIDAK. Pada baris 20 (`as.cobaAngka(13);`), eksepsi terjadi. 
         * Begitu eksepsi terjadi di dalam blok `try`, sisa instruksi 
         * di dalam blok `try` tersebut akan langsung diabaikan dan 
         * program melompat ke blok `catch`. Oleh karena itu, baris 21 
         * (`as.cobaAngka(12);`) dilewati dan tidak dieksekusi.
         */
    }
}