package com.unsia.pbo.latihan5;

import java.util.Scanner;

public class TiketWisata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variabel
        String nama;
        int jumlahTiket;
        int pilihan;
        double harga = 0;
        double subtotal;
        double total = 0;
        double diskon;
        double bayar;

        // Input nama
        System.out.println("===== PEMESANAN TIKET WISATA =====");
        System.out.print("Nama Pengunjung : ");
        nama = input.nextLine();

        // Input jumlah tiket
        System.out.print("Jumlah tiket yang dibeli : ");
        jumlahTiket = input.nextInt();

        // Perulangan FOR
        for (int i = 1; i <= jumlahTiket; i++) {
            System.out.println("\nTiket ke-" + i);
            System.out.println("1. Tiket Anak");
            System.out.println("2. Tiket Dewasa");
            System.out.print("Pilih tiket : ");
            pilihan = input.nextInt();
            String jenisTiket = "";

            // Percabangan
            if (pilihan == 1) {
                jenisTiket = "Tiket Anak";
                harga = 20000;
            } else if (pilihan == 2) {
                jenisTiket = "Tiket Dewasa";
                harga = 50000;
            } else {
                System.out.println("Pilihan tidak tersedia");
                continue;
            }

            // Hitung subtotal
            subtotal = harga;

            // Tambah total
            total = total + subtotal;

            // Output tiket
            System.out.println("Jenis Tiket : " + jenisTiket);
            System.out.println("Harga : " + harga);
        }

        // Diskon
        if (total > 200000) {
            diskon = total * 0.10;
        } else {
            diskon = 0;
        }

        // Total bayar
        bayar = total - diskon;

        // Output struk
        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Nama Pengunjung : " + nama);
        System.out.println("Total Belanja : " + total);

        System.out.println("Diskon : " + diskon);
        System.out.println("Total Bayar : " + bayar);
    }
}