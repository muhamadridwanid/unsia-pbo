package com.unsia.pbo.latihan6;

import java.util.Scanner;

public class PenentuanBeasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array
        String[] nama = new String[5];
        double[] nilai = new double[5];

        // Input data mahasiswa
        for (int i = 0; i < nama.length; i++) {

            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("Nama Mahasiswa : ");
            nama[i] = input.nextLine();

            System.out.print("Nilai Rata-rata : ");
            nilai[i] = input.nextDouble();
            input.nextLine(); // membersihkan enter

            System.out.println();
        }

        // Menampilkan hasil seleksi beasiswa
        System.out.println("===== HASIL PENENTUAN BEASISWA =====");

        for (int i = 0; i < nama.length; i++) {

            System.out.println("Nama : " + nama[i]);
            System.out.println("Nilai : " + nilai[i]);

            // Logika IF
            if (nilai[i] >= 85) {
                System.out.println("Status : LOLOS Beasiswa");
            } else {
                System.out.println("Status : Tidak Lolos");
            }

            System.out.println("-----------------------------");
        }
    }
}
