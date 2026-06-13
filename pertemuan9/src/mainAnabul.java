public class mainAnabul {
    public static void main(String[] args) {
        Piaraan p = new Piaraan(10);
        Kucing k1 = new Kucing("Meong", 3.5);
        Anjing a1 = new Anjing("Doggo");
        
        p.enqueueAnabul(k1);
        p.enqueueAnabul(a1);
        p.showAnabul();
        p.showJenisAnabul();
        System.out.println("Total Bobot Kucing: " + p.bobotKucing());
    }
}