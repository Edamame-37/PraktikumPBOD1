package com.marketplace.core.model;

public class ProdukDigital extends Produk {
    private static final long serialVersionUID = 1L;
    private double biayaServer;

    public ProdukDigital(String id, String nama, double hargaDasar, double biayaServer) {
        super(id, nama, hargaDasar);
        this.biayaServer = biayaServer;
    }

    public double getBiayaServer() { return biayaServer; }

    @Override
    public double hitungTotalHarga() {
        // Dynamic Binding: Ditambah biaya pemeliharaan infrastruktur
        return hargaDasar + biayaServer;
    }
}