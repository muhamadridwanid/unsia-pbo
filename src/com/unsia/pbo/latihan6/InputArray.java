package com.unsia.pbo.latihan6;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] angka = new int[5];

        // Input data
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menampilkan data
        System.out.println("\nData Array:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Angka[" + i + "] = " + angka[i]);
        }
    }
}
