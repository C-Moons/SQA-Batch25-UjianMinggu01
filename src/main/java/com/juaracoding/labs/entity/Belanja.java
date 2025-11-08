package com.juaracoding.labs.entity;

public class Belanja {
    private int hargabarang;
    private int jumlahbarang;
    private int diskon;
    private int hargadiskon;
    private int hargatotal;
    private int hargaafterdiskon;

    public Belanja(int harga, int jumlahbarang) {
        this.hargabarang = harga;
        this.jumlahbarang = jumlahbarang;
        this.hargatotal = harga * jumlahbarang;
    }


    public int getHargabarang() {
        return hargabarang;
    }
    public void setHargabarang(int hargabarang) {
        this.hargabarang = hargabarang;
    }
    public int getJumlahbarang() {
        return jumlahbarang;
    }
    public void setJumlahbarang(int jumlahbarang) {
        this.jumlahbarang = jumlahbarang;
    }
    public int getDiskon() {
        return diskon;
    }
    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }
    public int getHargadiskon() {
        return hargadiskon;
    }
    public void setHargadiskon(int hargadiskon) {
        this.hargadiskon = hargadiskon;
    }
    public int getHargatotal() {
        return hargatotal;
    }
    public void setHargatotal(int hargatotal) {
        this.hargatotal = hargatotal;
    }
    public int getHargaafterdiskon() {
        return hargaafterdiskon;
    }
    public void setHargaafterdiskon(int hargaafterdiskon) {
        this.hargaafterdiskon = hargaafterdiskon;
    }

    
}
