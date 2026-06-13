public class Main {
    public static void main(String[] args) {
        // Referensi parent abstrak untuk menguji polymorphism.
        BangunDatar P1 = new Persegi(5, "Merah", "Solid");
        Persegi P2 = new Persegi(5, "Merah", "Solid");
        BangunDatar L1 = new Lingkaran(7.0, "Merah", "Solid");
        Lingkaran L2 = new Lingkaran(14, "Merah", "Solid");

        // Casting ke interface agar method resize bisa diakses dari referensi parent.
        IResize resizeP1 = (IResize) P1;
        IResize resizeL1 = (IResize) L1;
        
        // Uji method abstrak yang diimplementasikan masing-masing turunan.
        System.out.println("Apakah Luas P1 sama dengan P2 : " + P1.isEqualLuas(P2));
        System.out.println("Apakah Luas L1 sama dengan L2 : " + L1.isEqualLuas(L2));
        System.out.println("Apakah Keliling P1 sama dengan P2 : " + P1.isEqualKeliling(P2));
        System.out.println("Apakah Keliling L1 sama dengan L2 : " + L1.isEqualKeliling(L2));
        
        // Uji resize pada objek persegi.
        System.out.println("--- Info Persegi ---");
        P1.printInfo();
        System.out.println("Sisi Persegi P2 sebelum resize : " + P2.getSisi());
        resizeP1.zoomOut();
        P2.zoomOut();
        System.out.println("Luas P1 sesudah zoomOut (via IResize) : " + P1.getLuas());
        System.out.println("Sisi Persegi P2 sesudah zoomOut : " + P2.getSisi());
        
        // Uji resize pada objek lingkaran.
        System.out.println("--- Info Lingkaran ---");
        L1.printInfo();
        System.out.println("Jari-jari Lingkaran L2 sebelum resize : " + L2.getJari());
        resizeL1.zoomOut();
        L2.zoomOut();
        System.out.println("Keliling L1 sesudah zoomOut (via IResize) : " + L1.getKeliling());
        System.out.println("Jari-jari Lingkaran L2 sesudah zoomOut : " + L2.getJari());
    }
}