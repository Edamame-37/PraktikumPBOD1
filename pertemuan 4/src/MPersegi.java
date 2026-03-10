public class MPersegi {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(5, "Merah", "Solid");
        System.out.println("Persegi 1:");
        persegi1.printInfo();
        System.out.println("Sisi: " + persegi1.getSisi());
        System.out.println("Luas: " + (persegi1.getSisi() * persegi1.getSisi()));
        System.out.println("Keliling: " + (4 * persegi1.getSisi()));
    }   
}