package com.juaracoding.labs;
// Buatlah program untuk menghitung jumlah total belanja beserta diskonnya.

import com.juaracoding.labs.entity.Belanja;
// Yang harus dicetak seperti:

// Summary
// // System.out.println("Harga diskon: " + grandTotal * (diskon/100));
// System.out.println("Harga before discount: " + grandTotal);
// System.out.println("Diskon: " + "sample 50%");
// System.out.println("Harga diskon: " + "masukinb harga diskon");
// System.out.println("Harga after discount: " + "masukin after diskon");

// Diskon pertotal, pilihan diskon 30/50/70.
public class App 
{
    public static void main( String[] args )
    {
        Belanja belanja = new Belanja(200000, 10);
        System.out.println("========== Summary ==========");
        System.out.println("Harga Before discount : " + belanja.getHargatotal());

        belanja.setDiskon(30);
        System.out.println("Diskon : " + belanja.getDiskon() + "%");

        belanja.setHargadiskon(belanja.getHargatotal() * belanja.getDiskon() / 100);
        System.out.println("Harga diskon : " + belanja.getHargadiskon());

        belanja.setHargaafterdiskon(belanja.getHargatotal() - belanja.getHargadiskon());
        System.out.println("Harga after discount : " + belanja.getHargaafterdiskon());
        System.out.println("=============================");
    }
}
