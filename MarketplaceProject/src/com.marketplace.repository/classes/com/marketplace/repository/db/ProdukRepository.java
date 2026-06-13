package com.marketplace.repository.db;

import com.marketplace.core.model.Produk;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProdukRepository {
    private static final String FILE_NAME = "database_toko.dat";

    // Persistensi: Menulis koleksi objek ke media penyimpanan lokal (Serialisasi)
    public void simpanData(List<Produk> produkList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(produkList);
        } catch (IOException e) {
            System.err.println("[!] Gagal melakukan ekspor data: " + e.getMessage());
        }
    }

    // Persistensi: Membaca kembali data objek biner saat aplikasi di-boot (Deserialisasi)
    @SuppressWarnings("unchecked")
    public List<Produk> loadData() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Produk>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("[!] Basis data korup, memuat lembar kerja baru.");
            return new ArrayList<>();
        }
    }
}