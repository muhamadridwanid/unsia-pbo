package com.unsia.pbo.latihan3;

public class OperatorOR {
    public static void main(String[] args) {
        int nilai = 75;
        // Kondisi 1: nilai>70 (true) || nilai<50 (false) → TRUE
        boolean hasil1 = (nilai > 70) || (nilai < 50);
        // Kondisi 2: nilai>80 (false) || nilai<50 (false) → FALSE
        boolean hasil2 = (nilai > 80) || (nilai < 50);
        System.out.println("Nilai = " + nilai);
        System.out.println("(nilai > 70) || (nilai < 50) = " + hasil1);
        System.out.println("(nilai > 80) || (nilai < 50) = " + hasil2);
    }
}