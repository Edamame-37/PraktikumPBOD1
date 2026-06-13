public class Lingkaran extends BangunDatar implements IResize {
    /************ATRIBUT************/
    private double jari;    // jari-jari lingkaran

    /************METHOD************/
    // Konstruktor default, mengeset jumlah sisi = 1 (lingkaran dianggap punya 1 sisi)
    public Lingkaran(){
        setJmlSisi(1);
    }

    // Konstruktor berparameter dengan diameter, warna, dan border
    public Lingkaran (double diameter, String warna, String border){
        super(1, warna, border);    
        this.jari = diameter/2;     
    }

    // Mengembalikan nilai jari-jari lingkaran
    public double getJari (){
        return jari; 
    }

    // Mengeset jari-jari dengan nilai baru
    public void setJari(double jari){
        this.jari = jari;
    }

    // Menghitung dan mengembalikan luas lingkaran (π * r²)
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    // Menghitung dan mengembalikan keliling lingkaran (2 * π * r)
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn() {
        // Memperbesar jari-jari 10%.
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        // Memperkecil jari-jari 10%.
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        // Menskalakan jari-jari berdasarkan nilai persen.
        jari = jari * percent/100;
    }

    // Override method printInfo untuk menampilkan informasi lengkap lingkaran
    @Override
    public void printInfo() {
        super.printInfo();  
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}