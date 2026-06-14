/*
 * File      : Piaraan.java
 * Deskripsi : Kelas antrean klinik pemeliharaan hewan menggunakan Queue
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 5 Mei 2026
 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul depan = Lanabul.poll();
        if (depan != null) {
            nbelm--;
        }
        return depan;
    }

    public void showAnabul() {
        System.out.print("Antrean Anabul: ");
        for (Anabul a : Lanabul) {
            System.out.print(a.getNama() + " | ");
        }
        System.out.println();
    }

    public int countKucing() {
        int jumlah = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("Detail Antrean Klinik:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + " (Jenis: " + a.getClass().getName() + ")");
        }
    }
}