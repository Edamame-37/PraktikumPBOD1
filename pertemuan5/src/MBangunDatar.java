/*
 * Nama File  : MBangunDatar.java
 * Deskripsi  : Main driver Bangun Datar.
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 17 Maret 2026
*/

public class MBangunDatar {

    /*
    Bagian 1 : 
    3. Adakah kode yang bermasalah pada saat dijalankan? 
    Ada saat pembuatan objek BangunDatar yang mengalami error karena class BangunDatar
    berupa abstract class yang memiliki abstract method yang belum memiliki implementasi
    dan abstract class tidak dapat membuat objek langsung, tetapi objek dapat dibuat dari
    class anaknya
    
    5. Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek bangun datar yang berbeda?
    Method yang dibuat nomor 4 dapat digunakan oleh objek bangun datar lain karena 
    paramater method tersebut adalah BangunDatar yang merupakan parent class dari Persegi dan Lingkaran

    5. ika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas() dan isEqualKeliling pada class BangunDatar? Mengapa? 
    tetap dapat membuat method tersebut karena abstract class tidak membatasi dalam membuat method biasa
    , tetapi hanya memiliki keharusan untuk adanya abstract method

    5. Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
    Kelebihan : saat class BangunDatar dibuat abstract class, child classnya memiliki keharusan untuk mengimplementasi
    abstract method sesuai dengan kebutuhannya, tanpa harus diimplementasikan pada parent class
    Kekurangan : abstract class tidak dapat membuat objek secara langsung sehingga harus
    dibuat melalui child classnya yaitu Persegi dan Lingkaran.

    Bagian 2 : 
    4. Lakukan eksperimen pemanggilan method yang telah dibuat dari IResize pada main method. Bagaimana hasilnya?
    Hasilnya adalah size mereka mengalami pertambahan dan pengurangan seperti pada Lingkaran, yaitu jari - jari
    , sedangkan Persegi, yaitu sisi.

    Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar? 
    Keuntungan : interface dapat digunakan oleh semua class, sedangkan jika dibuat abstract class
    , class lain harus dibuat sebagai anaknya untuk dapat memuat methodnya dan setiap anak harus mengimplementasikannya.
    Interface juga memusatkan method tanpa ada atribut. Jadi, inteface membuat kita bebas ingin memberikan method ke class apapun
    

    */

    public static void main(String[] args) {

        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10);
        // Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        // Lingkaran L2 = new Lingkaran(14);

        P1.setBorder("Solid");
        P1.setWarna("Biru");
        double luasP1 = P1.getLuas();
        double kelilingP1 = P1.getKeliling();
        L1.setBorder("Dashed");
        L1.setWarna("Black");
        double luasL1 = L1.getLuas();
        double kelilingL1 = L1.getKeliling();

        System.out.println("Informasi Persegi P1 : ");
        P1.printInfo();
        System.out.println("Luas Persegi P1 : " + luasP1);
        System.out.println("Keliling Persegi P1 : " + kelilingP1);
        
        System.out.println("\nInformasi Lingkaran L1 : ");
        L1.printInfo();
        System.out.println("Luas Lingkaran L1 : " + luasL1);
        System.out.println("Keliling Lingkaran L1 : " + kelilingL1);

        Lingkaran L2 = new Lingkaran(14, "Black", "Dashed");

        System.out.println("Jari - jari Lingkaran L2 : " + L2.getJari());
        L2.zoomIn();
        System.out.println("Jari - jari Lingkaran L2 setelah zoom in : " + L2.getJari());
        L2.zoomOut();
        System.out.println("Jari - jari Lingkaran L2 setelah zoom out : " + L2.getJari());
        L2.zoom(30);
        System.out.println("Jari - jari Lingkaran L2 setelah zoom 30% : " + L2.getJari());

        boolean isEqual = L2.isEqualLuas(P1);

        String hasilEqual = (isEqual) ? "Luas Lingkaran L2 sama dengan Luas Persegi P1" : "Luas Lingkaran L2 tidak sama dengan luas Persegi P1";

        System.out.println("\n" +hasilEqual);
    }
}