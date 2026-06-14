/*
 * File      : Teman.java
 * Deskripsi : Kelas pengelola koleksi nama teman menggunakan struktur data List
 * Pembuat   : Rafa Azlan / 24060124140126
 * Tanggal   : 5 Mei 2026
 */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        } else {
            System.out.println("Gagal setNama: Indeks di luar batas.");
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        } else {
            System.out.println("Nama " + nama + " tidak ditemukan untuk dihapus.");
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        } else {
            System.out.println("Gagal gantiNama: " + nama + " tidak ditemukan.");
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman (" + nbelm + " orang): " + Lnama);
    }
}