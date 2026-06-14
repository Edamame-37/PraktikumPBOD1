/*
 * File      : MainGenerik.java
 * Deskripsi : Program utama untuk menguji fungsionalitas kelas generik
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 28 April 2026
 */
public class MainGenerik {
    public static void main(String[] args) {
        System.out.println("BAGIAN I: GENERIK PADA CLASS");
        Datum<String> dString = new Datum<>("Halo suki");
        System.out.println("Isi Datum String: " + dString.getIsi());

        Anggora kucingAnggora = new Anggora("Snowy", 3.5);
        Datum<Anabul> dAnabul = new Datum<>(kucingAnggora);
        System.out.println("Isi Datum Anabul (Nama): " + dAnabul.getIsi().getNama());

        System.out.println("\nBAGIAN II: GENERIK PADA OPERATOR");
        OperatorGenerik op = new OperatorGenerik();

        Datum<Integer> aInt = new Datum<>(3);
        Datum<Integer> bInt = new Datum<>(6);
        System.out.println("Sebelum Tukar: a=" + aInt.getIsi() + ", b=" + bInt.getIsi());
        op.Tukar(aInt, bInt);
        System.out.println("Setelah Tukar: a=" + aInt.getIsi() + ", b=" + bInt.getIsi());

        Datum<String> s1 = new Datum<>("Kanan");
        Datum<String> s2 = new Datum<>("Kiri");
        op.Tukar(s1, s2);
        System.out.println("Setelah Tukar String: s1=" + s1.getIsi() + ", s2=" + s2.getIsi());

        Datum<Anabul> dAnjing = new Datum<>(new Anjing("Bobi"));
        Datum<Anabul> dBurung = new Datum<>(new Burung("Piko"));
        System.out.println("Sebelum Tukar: a=" + dAnjing.getIsi().getNama() + ", b=" + dBurung.getIsi().getNama());
        op.Tukar(dAnjing, dBurung);
        System.out.println("Setelah Tukar: a=" + dAnjing.getIsi().getNama() + ", b=" + dBurung.getIsi().getNama());

        Kembangtelon kucingTigaWarna = new Kembangtelon("Belang", 4.2);
        double totalBobot = op.Bobot2(kucingAnggora, kucingTigaWarna);
        System.out.println("Total Bobot Snowy (Anggora) + Belang (Kembangtelon) = " + totalBobot + " kg");

        System.out.println("\nBAGIAN III: LARIK GENERIK");
        Data<Anabul> kandang = new Data<>();
        
        kandang.setIsi(1, kucingAnggora);
        kandang.setIsi(2, new Anjing("Heli"));
        kandang.setIsi(50, kucingTigaWarna);

        System.out.println("Isi kandang posisi 1: " + kandang.getIsi(1).getNama());
        System.out.println("Isi kandang posisi 2: " + kandang.getIsi(2).getNama());
        System.out.println("Isi kandang posisi 50: " + kandang.getIsi(50).getNama());
        System.out.println("Total hewan (elemen efektif) di kandang: " + kandang.getSize());

        /*
         * JAWABAN RENUNGAN
         * Pertanyaan: Simpulkan bagaimana cara kerja konsep Generik sesuai kalimat Anda sendiri!
         * Jawaban:
         * Generik adalah suatu mekanisme di Java yang memungkinkan kita membuat sebuah "templat" 
         * tipe data (baik pada Kelas, Antarmuka, maupun Metode) tanpa harus menentukan tipe data 
         * spesifiknya sejak awal penulisan kode. Tipe datanya baru ditentukan dan dikunci secara 
         * spesifik pada saat objek digunakan (instansiasi) di program utama. Cara kerja ini 
         * memaksimalkan reusability (satu kode bisa menampung banyak jenis data) sekaligus 
         * memberikan jaminan type-safety, karena kompilator akan mencegah masuknya tipe data 
         * yang tidak relevan tanpa harus melakukan casting (coercion) manual berulang kali.
         */
    }
}