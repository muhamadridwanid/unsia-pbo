package com.unsia.pbo.latihan4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.println("Menu Minuman");
        System.out.println("1. Teh");
        System.out.println("2. Kopi");
        System.out.println("3. Susu");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Teh");
                break;
            case 2:
                System.out.println("Anda memilih Kopi");
                break;
            case 3:
                System.out.println("Anda memilih Susu");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}