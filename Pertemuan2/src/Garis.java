/*
 * Nama File  : Garis.java
 * Deskripsi  : berisi class Garis yang merepresentasikan garis pada bidang 2D
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 24 Februari 2026
 */

public class Garis {
    /*************ATRIBUT*************/
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    /*************METHOD*************/
    Garis() {
        this.awal = new Titik();
        this.akhir = new Titik();

        this.awal.setAbsis(0.0);
        this.awal.setOrdinat(0.0);
        this.akhir.setAbsis(1.0);
        this.akhir.setOrdinat(1.0);
    }

    Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        this.counterGaris++;
    }

    Titik getAwal() {
        return awal;
    }

    
    Titik getAkhir() {
        return akhir;
    }

    void setAwal(Titik awal) {
        this.awal = awal;
    }
    

    void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    double PanjangGaris(){
        double panjang = Math.sqrt(Math.pow((akhir.getAbsis() - awal.getAbsis()), 2) + Math.pow((akhir.getOrdinat() - awal.getOrdinat()), 2));
        return panjang;
    }

    int getGradien(){
        int gradien = (int) ((akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis()));
        return gradien;
    }

    Titik titikTengah(){
        double absisTengah = (awal.getAbsis() + akhir.getAbsis()) / 2;
        double ordinatTengah = (awal.getOrdinat() + akhir.getOrdinat()) / 2;
        return new Titik(absisTengah, ordinatTengah);
    }

    boolean isSejajar(Garis g){
        return this.getGradien() == g.getGradien();
    }

    boolean isTegakLurus(Garis g){
        return this.getGradien() * g.getGradien() == -1;
    }

    void printGaris(){
        System.out.println("Awal (" + this.awal.getAbsis() + "," + this.awal.getOrdinat() + ") Akhir (" + this.akhir.getAbsis() + "," + this.akhir.getOrdinat() + ")");
    }

    void persamaanGaris(){
        int a = (int) (this.akhir.getOrdinat() - this.awal.getOrdinat());
        int b = (int) (this.awal.getAbsis() - this.akhir.getAbsis());
        int c = (int) ((this.awal.getAbsis() * this.akhir.getOrdinat()) - (this.akhir.getAbsis() * this.awal.getOrdinat()));
        System.out.println("Persamaan garis: " + a + "x + " + b + "y + " + c + " = 0");
    }

    

}
