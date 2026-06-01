package com.unsia.pbo.latihan5;

import java.util.Scanner;

public class LatihanFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        for (int i = 1; i <= angka; i++) {
            System.out.println("Bilangan ke-" + i);

        }
    }
}