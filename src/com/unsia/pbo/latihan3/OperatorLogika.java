package com.unsia.pbo.latihan3;

public class OperatorLogika {
    public static void main(String[] args) {
        boolean kondisi1 = true;
        boolean kondisi2 = false;
        System.out.println("kondisi1 = " + kondisi1);
        System.out.println("kondisi2 = " + kondisi2);
        // AND: true hanya jika KEDUA kondisi true
        System.out.println("kondisi1 && kondisi2 = " + (kondisi1 && kondisi2));
        // OR: true jika SALAH SATU kondisi true
        System.out.println("kondisi1 || kondisi2 = " + (kondisi1 || kondisi2));
        // NOT: membalik nilai boolean
        System.out.println("!kondisi1 = " + (!kondisi1));
        System.out.println("!kondisi2 = " + (!kondisi2));
    }
}