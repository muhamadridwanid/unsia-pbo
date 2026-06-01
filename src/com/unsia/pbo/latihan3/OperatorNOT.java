package com.unsia.pbo.latihan3;

public class OperatorNOT {
    public static void main(String[] args) {
        boolean kondisi1 = true;
        boolean kondisi2 = false;
        System.out.println("Nilai kondisi1 = " + kondisi1);
        System.out.println("Nilai kondisi2 = " + kondisi2);
        // NOT membalik: true jadi false
        System.out.println("!kondisi1 = " + (!kondisi1));
        // NOT membalik: false jadi true
        System.out.println("!kondisi2 = " + (!kondisi2));
    }
}