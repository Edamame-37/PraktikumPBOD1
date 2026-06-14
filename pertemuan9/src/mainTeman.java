/*
 * File      : MainTeman.java
 * Deskripsi : Program utama untuk menguji kelas Teman
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 5 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman daftarTeman = new Teman();

        System.out.println("Menguji Koleksi Teman");
        daftarTeman.addNama("Budi");
        daftarTeman.addNama("Mamat";
        daftarTeman.addNama("Siti");
        daftarTeman.addNama("Andi");
        daftarTeman.addNama("Bagas CB100");


        daftarTeman.showTeman();
        System.out.println("Banyak elemen (getNbelm): " + daftarTeman.getNbelm());

        System.out.println("Teman di indeks 1: " + daftarTeman.getNama(1));
        daftarTeman.setNama(2, "Joko");
        System.out.println("Setelah Andi diubah jadi Joko:");
        daftarTeman.showTeman();

        System.out.println("Apakah 'Budi' anggota? " + daftarTeman.isMember("Budi"));

        daftarTeman.gantiNama("Budi", "Budiman");
        
        System.out.println("Jumlah nama 'Siti': " + daftarTeman.countNama("Siti"));

        daftarTeman.delNama("Joko");
        System.out.println("\nSetelah Joko dihapus dan Budi diganti Budiman:");
        daftarTeman.showTeman();
    }
}