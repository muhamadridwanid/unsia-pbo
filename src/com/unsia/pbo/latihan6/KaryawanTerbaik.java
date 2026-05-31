package com.unsia.pbo.latihan6;

import java.util.Scanner;

public class KaryawanTerbaik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array
        String[] nama = new String[5];
        int[] absensi = new int[5];
        int[] kinerja = new int[5];
        int[] total = new int[5];

        // Input data karyawan
        for (int i = 0; i < nama.length; i++) {

            System.out.println("Data Karyawan ke-" + (i + 1));

            System.out.print("Nama Karyawan : ");
            nama[i] = input.nextLine();

            System.out.print("Nilai Absensi : ");
            absensi[i] = input.nextInt();

            System.out.print("Nilai Kinerja : ");
            kinerja[i] = input.nextInt();
            input.nextLine(); // membersihkan enter

            // Menghitung total nilai
            total[i] = absensi[i] + kinerja[i];

            System.out.println();
        }

        // Menampilkan hasil penilaian
        System.out.println("===== PENILAIAN KARYAWAN TERBAIK =====");

        for (int i = 0; i < nama.length; i++) {

            System.out.println("Nama Karyawan : " + nama[i]);
            System.out.println("Nilai Absensi : " + absensi[i]);
            System.out.println("Nilai Kinerja : " + kinerja[i]);
            System.out.println("Total Nilai : " + total[i]);

            // Logika IF
            if (total[i] >= 170) {
                System.out.println("Status : Karyawan Terbaik");
            } else {
                System.out.println("Status : Belum Memenuhi");
            }

            System.out.println("------------------------------");
        }
    }
}
