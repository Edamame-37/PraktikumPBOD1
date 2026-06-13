public class mainTeman {
    public static void main(String[] args) {
        Teman teman = new Teman(10);
        teman.addNama("Kirk");
        teman.addNama("Jane");
        teman.addNama("Juliet");
        teman.addNama("Jokowi");
        teman.addNama("Pigai");
        teman.addNama("Mamat");
        teman.addNama("Asep");
        teman.addNama("Gibran");
        teman.addNama("Bahlil");
        teman.addNama("Prabowo");

        teman.showTeman();

        System.err.println("Jumlah teman: " + teman.getNbelm());

        System.out.println("teman saya ketiga adalah: " + teman.getNama(2));

        teman.setNama(7, "Jane Doe");
        System.out.println("teman saya kedelapan adalah: " + teman.getNama(7));


        System.out.println("Apakah Jane adalah teman saya? " + teman.isMember("Jane"));
        System.out.println("Jumlah nama 'Jokowi': " + teman.countNama("Jokowi"));

        teman.gantiNama("Kirk", "Chuck");
        System.out.println("Setelah mengganti nama Kirk menjadi Chuck:");
        teman.showTeman();

        teman.delNama("Bahlil");
        System.out.println("Setelah menghapus Bahlil:");
        teman.showTeman();
    }    
}
