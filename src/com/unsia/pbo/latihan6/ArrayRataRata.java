package com.unsia.pbo.latihan6;

public class ArrayRataRata {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 90, 85, 70};
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        double rataRata = (double) total / nilai.length;
        System.out.println("Total Nilai = " + total);
        System.out.println("Rata-rata = " + rataRata);
    }
}
