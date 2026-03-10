
public class Persegi extends BangunDatar {
    /*************ATRIBUT*************/
    private double sisi;

    /*************METHOD*************/
    public Persegi() {

    }

    /*
    Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
    Mengapa?

    public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    PENJELASAN:
    Konstruktor tersebut tidak dapat direalisasikan jika atribut jmlSisi, warna,
    dan border pada kelas BangunDatar memiliki access modifier private.

    Hal ini karena atribut private hanya dapat diakses di dalam kelas yang sama
    (BangunDatar) dan tidak dapat diakses langsung oleh subclass seperti Persegi.

    Oleh karena itu, subclass harus mengakses atribut tersebut melalui method
    setter yang tersedia pada superclass, misalnya:

    setJmlSisi(4);
    setWarna(warna);
    setBorder(border);

    Cara lain yang lebih baik adalah menggunakan keyword super untuk memanggil
    constructor milik superclass.
    */

    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}