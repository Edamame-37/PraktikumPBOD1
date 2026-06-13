import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;
    private int maxNbelm = -1;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public Teman(int max) {
        this.Lnama = new ArrayList<>(max);
        this.maxNbelm = max;
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.Lnama.size();
    }

    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama) {
        if (maxNbelm == -1 || nbelm < maxNbelm) {
            Lnama.add(nama);
            nbelm++;
        } else {
            System.out.println("Koleksi sudah penuh!");
        }
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int idx = Lnama.indexOf(nama);
        if (idx != -1) {
            Lnama.set(idx, namabaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String s : Lnama) {
            if (s.equals(nama)) count++;
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String s : Lnama) {
            System.out.println("- " + s);
        }
    }
}