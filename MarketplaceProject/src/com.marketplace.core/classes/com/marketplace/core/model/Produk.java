package com.marketplace.core.model;

import java.io.Serializable;

public abstract class Produk implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String nama;
    protected double hargaDasar;

    public Produk(String id, String nama, double hargaDasar) {
        this.id = id;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public double getHargaDasar() { return hargaDasar; }
    
    // Polimorfisme: Di-override oleh subclass
    public abstract double hitungTotalHarga();
}