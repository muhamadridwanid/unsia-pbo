package com.unsia.pbo.latihan5;

import java.util.Scanner;

public class EcommerceSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variabel
        int pilihan, jumlah;
        double harga = 0, total, diskon, bayar;
        String namaBarang;
        // Menu
        System.out.println("===== E-COMMERCE SEDERHANA =====");
        System.out.println("1. Laptop = 7000000");
        System.out.println("2. Mouse = 150000");
        System.out.println("3. Keyboard = 300000");
        // Input pilihan

        System.out.print("Pilih Menu : ");
        pilihan = input.nextInt();
        // Logika pilihan barang
        if (pilihan == 1) {
            namaBarang = "Laptop";
            harga = 7000000;
        } else if (pilihan == 2) {
            namaBarang = "Mouse";
            harga = 150000;
        } else if (pilihan == 3) {
            namaBarang = "Keyboard";
            harga = 300000;
        } else {
            System.out.println("Menu tidak tersedia");
            return;
        }
        // Input jumlah
        System.out.print("Jumlah Beli : ");
        jumlah = input.nextInt();
        // Perhitungan total
        total = harga * jumlah;
        // Diskon
        if (total > 1000000) {
            diskon = total * 0.10;
        } else {
            diskon = 0;
        }
        bayar = total - diskon;
        // Output struk
        System.out.println("\n===== STRUK BELANJA =====");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total : " + total);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total Bayar : " + bayar);
        // Perulangan FOR
        System.out.println("\n===== DETAIL BARANG =====");
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Barang ke-" + i + " : " + namaBarang);
        }
    }
}