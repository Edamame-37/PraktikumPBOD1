/*
 * File      : titik.java
 * Deskripsi : Class Titik pada bidang 2D
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 24 Februari 2026
 */

public class Titik {
    /*************ATRIBUT*************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*************METHOD*************/
    // konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0, 0);
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru x
    public void setOrdinat(double x){
        ordinat = x;
    }

    // mengembalikan jumlah titik yang ada
    public static int getCounterTitik(){
        return counterTitik;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mengembalikan nilai kuadran suatu titik
    public int getKuadran(){
        int kuadran = 0;
        if (this.absis > 0 && this.ordinat > 0){
            kuadran = 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            kuadran = 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            kuadran = 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            kuadran = 4;
        }
        return kuadran;
    }

    // mengembalikan nilai jarak dari sebuah titik ke titik (0,0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    // mengembalikan nilai jarak dari sebuah titik ke titik T
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow((this.absis - T.absis), 2) + Math.pow((this.ordinat - T.ordinat), 2));
    }

    // merefleksikan sumbu x pada suatu titik
    public void refleksiX(){
        this.ordinat = -ordinat;
    }

    // merefleksikan sumbu y pada suatu titik
    public void refleksiY(){
        this.absis = -absis;
    }

    public Titik getRefleksiX(){
        Titik T = new Titik(absis, ordinat);
        T.setOrdinat(-ordinat);
        return T;
    }

    public Titik getRefleksiY(){
        Titik T = new Titik(absis, ordinat);    
        T.setAbsis(-absis);
        return T;
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public static void printCounterTitik(){
        System.out.println(counterTitik);
    }


}