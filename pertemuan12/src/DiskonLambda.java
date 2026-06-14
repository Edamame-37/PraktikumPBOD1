/*
 * File      : DiskonLambda.java
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 26 Mei 2026
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
        
        /* 
         * Pertanyaan: Dapatkah anda membedakan antara bagaimana diskonLebaran 
         * dan diskonBiasa diimplementasikan?
         * * Jawaban: 
         * Ya, perbedaannya terletak pada sintaks penulisannya:
         * 1. diskonLebaran diimplementasikan menggunakan ekspresi sebaris (single-line 
         * expression). Karena hanya berisi satu operasi matematika, kita tidak 
         * perlu menuliskan tanda kurung kurawal "{}" dan kata kunci "return". 
         * Hasil perhitungan otomatis dikembalikan (implicit return).
         * 2. diskonBiasa diimplementasikan menggunakan blok statement (block 
         * expression). Penulisan ini menggunakan tanda kurung kurawal "{}" 
         * untuk membungkus logika. Karena berbentuk blok, maka kita diwajibkan 
         * untuk menuliskan kata kunci "return" secara eksplisit untuk 
         * mengembalikan nilai, diikuti tanda titik koma (;) di dalam blok tersebut.
         */
    }
}