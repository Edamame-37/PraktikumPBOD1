public class MBangunDatar{
    public static void main (String[] args){
        // Membuat objek Persegi dengan sisi=4, warna biru, border hitam
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");
        
        // Membuat objek Lingkaran dengan diameter=14, warna pink, border hitam
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam");
        
        // Menampilkan informasi Persegi dan Lingkaran
        Persegi1.printInfo();
        Lingkaran1.printInfo();

        // Menampilkan keliling dan luas Persegi
        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi : " + Persegi1.getLuas());

        // Menampilkan keliling dan luas Lingkaran
        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());
    }
}