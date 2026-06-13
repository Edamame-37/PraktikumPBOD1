package com.marketplace.core.model;

import java.util.ArrayList;
import java.util.List;

// Generik: Membatasi tipe data agar hanya menerima turunan dari kelas Produk
public class KeranjangBelanja<T extends Produk> {
    private List<T> daftarItem = new ArrayList<>();

    public void tambah(T item) {
        daftarItem.add(item);
    }

    public List<T> getDaftarItem() {
        return daftarItem;
    }

    public void kosongkan() {
        daftarItem.clear();
    }
}