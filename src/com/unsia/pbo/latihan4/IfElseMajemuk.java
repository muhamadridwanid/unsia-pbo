package com.unsia.pbo.latihan4;

import java.util.Scanner;

public class IfElseMajemuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai siswa : ");
        nilai = input.nextInt();
        if (nilai >= 90) {
            System.out.println("Grade A");
            System.out.println("Keterangan: Sangat Baik");
        } else if (nilai >= 80) {
            System.out.println("Grade B");
            System.out.println("Keterangan: Baik");
        } else if (nilai >= 70) {
            System.out.println("Grade C");
            System.out.println("Keterangan: Cukup");
        } else if (nilai >= 60) {
            System.out.println("Grade D");
            System.out.println("Keterangan: Kurang");
        } else {
            System.out.println("Grade E");
            System.out.println("Keterangan: Sangat Kurang");
        }
    }
}