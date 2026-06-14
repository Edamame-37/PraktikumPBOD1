/*
 * Nama File  : Asersi2.java
 * Deskripsi  : pengaplikasian asersi.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 24 Maret 2026
*/

class Lingkaran {
    private final double jariJari; 
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
        
        /*
         * JAWABAN PERTANYAAN MODUL 3.2
         * Pertanyaan: Secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 
         * Jelaskan!
         * * Jawaban:
         * 1. Pelanggaran Enkapsulasi: Validasi (assert) dilakukan di luar kelas 
         * Lingkaran (yaitu di dalam class Asersi2/main). Seharusnya, validasi 
         * jari-jari dilakukan di dalam konstruktor kelas Lingkaran itu sendiri 
         * agar setiap objek Lingkaran yang dibuat selalu terjamin validitasnya.
         * * 2. Penggunaan Assert yang Kurang Tepat: Secara konsep, `assert` sebaiknya 
         * tidak digunakan untuk memvalidasi input atau argumen dari luar (publik). 
         * Untuk kasus menolak jari-jari bernilai nol atau negatif, pendekatan 
         * yang lebih tepat adalah melempar eksepsi standar, seperti 
         * `IllegalArgumentException`, karena assert bisa dimatikan (disable) 
         * oleh JVM secara bawaan.
         */
    }
}