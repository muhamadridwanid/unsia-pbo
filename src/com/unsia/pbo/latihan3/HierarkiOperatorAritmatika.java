package com.unsia.pbo.latihan3;

public class HierarkiOperatorAritmatika {
    public static void main(String[] args) {
        int hasil1, hasil2, hasil3, hasil4;
        // Perkalian didahulukan daripada penjumlahan
        hasil1 = 2 + 3 * 4; // 2 + 12 = 14
        // Tanda kurung didahulukan
        hasil2 = (2 + 3) * 4; // 5 * 4 = 20
        // Pembagian & perkalian lebih dulu dari pengurangan
        hasil3 = 20 - 8 / 2 * 3; // 20 - 12 = 8
        // Tanda kurung mempengaruhi hasil
        hasil4 = (20 - 8) / 2 * 3; // 12/2*3 = 18
        System.out.println("Hasil 1 = 2 + 3 * 4");
        System.out.println("Hasil = " + hasil1);
        System.out.println("Hasil 2 = (2 + 3) * 4");
        System.out.println("Hasil = " + hasil2);
        System.out.println("Hasil 3 = 20 - 8 / 2 * 3");
        System.out.println("Hasil = " + hasil3);
        System.out.println("Hasil 4 = (20 - 8) / 2 * 3");
        System.out.println("Hasil = " + hasil4);
    }
}