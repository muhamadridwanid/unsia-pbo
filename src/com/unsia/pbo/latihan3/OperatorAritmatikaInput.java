package com.unsia.pbo.latihan3;

import java.util.Scanner;
public class OperatorAritmatikaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;
        System.out.print("Masukkan angka pertama : ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        angka2 = input.nextInt();
        System.out.println("Perkalian : " + (angka1 * angka2));
        System.out.println("Pembagian : " + (angka1 / angka2));
        System.out.println("Sisa Pembagian : " + (angka1 % angka2));
        System.out.println("Penjumlahan : " + (angka1 + angka2));
        System.out.println("Pengurangan : " + (angka1 - angka2));
    }
}