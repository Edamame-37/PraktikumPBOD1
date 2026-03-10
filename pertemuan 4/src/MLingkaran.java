public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(7, "Biru", "Dashed");
        System.out.println("Lingkaran 1:");
        lingkaran1.printInfo();
        System.out.println("Jari-jari: " + lingkaran1.getJari());
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());
    }
    
}
