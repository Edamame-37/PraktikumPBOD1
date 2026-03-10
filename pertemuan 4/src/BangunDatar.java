public class BangunDatar {

    /*************ATRIBUT*************/

    /*
    Setelah atribut pada kelas BangunDatar diubah menjadi protected,
    apakah konstruktor berikut dapat direalisasikan? Mengapa?

    public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    PENJELASAN:
    Konstruktor tersebut dapat direalisasikan jika atribut pada
    BangunDatar diubah menjadi protected.

    Access modifier protected memungkinkan atribut diakses oleh:
    1. Kelas yang sama
    2. Subclass (kelas turunan)
    3. Kelas dalam package yang sama

    Karena Persegi merupakan subclass dari BangunDatar, maka atribut
    jmlSisi, warna, dan border dapat diakses langsung menggunakan
    keyword this.
    */

    protected  int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    /*************METHOD*************/

    /*
    Apa pengaruh jika keyword final ditambahkan pada kelas BangunDatar?

    PENJELASAN:
    Jika sebuah kelas diberi keyword final, maka kelas tersebut
    tidak dapat diwariskan (tidak dapat menjadi superclass).

    Akibatnya, kelas Persegi dan Lingkaran tidak dapat menggunakan
    keyword extends terhadap BangunDatar dan akan menyebabkan
    error pada saat proses kompilasi.
    */

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    /*
    Apa pengaruh jika keyword final ditambahkan pada method printInfo()
    di dalam kelas BangunDatar?

    PENJELASAN:
    Jika method diberi keyword final, maka method tersebut tidak dapat
    dioverride oleh subclass.

    Artinya kelas Persegi dan Lingkaran tidak dapat membuat method
    printInfo() dengan implementasi yang berbeda dari superclass.

    Jika subclass tetap mencoba melakukan overriding, maka akan
    terjadi error saat proses kompilasi.
    */
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    /*
    Coba lakukan overriding pada method static printCounterBangunDatar().
    Bagaimana hasilnya?

    PENJELASAN:
    Method static pada Java sebenarnya tidak benar-benar dioverride,
    melainkan hanya dilakukan method hiding.

    Hal ini terjadi karena method static terikat pada class,
    bukan pada objek. Ketika subclass membuat method static dengan
    nama yang sama, method tersebut tidak menggantikan method milik
    superclass, tetapi hanya menyembunyikannya.

    Akibatnya, method yang dipanggil akan bergantung pada tipe class
    yang digunakan saat pemanggilan, bukan pada objek yang dibuat.
    */
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek BangunDatar yang telah dibuat: " + counterBangunDatar);
    }
}