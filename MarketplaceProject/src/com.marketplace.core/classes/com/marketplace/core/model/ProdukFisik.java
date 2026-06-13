package com.marketplace.core.model;

public class ProdukFisik extends Produk {
    private static final long serialVersionUID = 1L;
    private double berat;

    public ProdukFisik(String id, String nama, double hargaDasar, double berat) {
        super(id, nama, hargaDasar);
        this.berat = berat;
    }

    public double getBerat() { return berat; }

    @Override
    public double hitungTotalHarga() {
        // Dynamic Binding: Ditambah biaya logistik Rp 10.000 / kg
        return hargaDasar + (berat * 10000);
    }
}