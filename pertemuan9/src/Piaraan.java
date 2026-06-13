// File: Piaraan.java
public class Piaraan {
    private int nbelm;
    // Hint: Field Lanabul can be final
    private final Anabul[] Lanabul;

    public Piaraan() {
        this.Lanabul = new Anabul[100];
        this.nbelm = 0;
    }

    public Piaraan(int max) {
        this.Lanabul = new Anabul[max];
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        if (nbelm < Lanabul.length) {
            Lanabul[nbelm] = anabul;
            nbelm++;
        }
    }

    public boolean isMember(Anabul anabul) {
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] == anabul) return true;
        }
        return false;
    }

    public Anabul getAnabul() {
        return (nbelm > 0) ? Lanabul[0] : null;
    }

    public Anabul dequeueAnabul() {
        if (nbelm > 0) {
            Anabul temp = Lanabul[0];
            for (int i = 0; i < nbelm - 1; i++) {
                Lanabul[i] = Lanabul[i + 1];
            }
            Lanabul[nbelm - 1] = null;
            nbelm--;
            return temp;
        }
        return null;
    }

    public void showAnabul() {
        for (int i = 0; i < nbelm; i++) {
            // Sekarang getNama() sudah terdefinisi di Anabul
            System.out.println("- " + Lanabul[i].getNama());
        }
    }

    public double bobotKucing() {
        double total = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                // Sekarang getBobot() sudah terdefinisi di Anabul
                total += Lanabul[i].getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Nama: " + Lanabul[i].getNama() + 
                               ", Jenis: " + Lanabul[i].getClass().getSimpleName());
        }
    }
}