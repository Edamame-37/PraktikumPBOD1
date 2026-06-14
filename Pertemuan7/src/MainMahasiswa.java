/*
 * File      : MainMahasiswa.java
 * Deskripsi : Program utama untuk menguji kelas Mahasiswa (Overloading)
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 21 April 2026
 */
public class MainMahasiswa {
    public static void main(String[] args) {
        // Menguji Konstruktor
        System.out.println("Menguji Konstruktor");
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("9999", "mamat", "teknik ancaman");
        Mahasiswa m3 = new Mahasiswa(m2);

        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        System.out.println("\nMenguji Varian setProgramStudi");
        m1.setProgramStudi(); // Tanpa parameter -> "Kosong"
        System.out.print("Varian 1 (Tanpa parameter): ");
        m1.tampilData();

        m1.setProgramStudi("teknik nuklir ledakan");
        System.out.print("Varian 2 (Parameter String): ");
        m1.tampilData();

        m1.setProgramStudi(m2);
        System.out.print("Varian 3 (Parameter Objek) : ");
        m1.tampilData();
    }
}