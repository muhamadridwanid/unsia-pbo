package com.unsia.pbo.latihan5;

import java.util.Scanner;

public class LatihanWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        int i = 1;
        int jumlah = 0;

        while (i <= angka) {
            jumlah = jumlah + i;
            i++;
        }

        System.out.println("Total jumlah = " + jumlah);
    }
}