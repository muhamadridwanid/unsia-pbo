package com.unsia.pbo.latihan4;

import java.util.Scanner;
public class PenilaianSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        double tugas, uts, uas, rata;
        String grade, keterangan;
        System.out.print("Masukkan nama siswa : ");
        nama = input.nextLine();
        System.out.print("Masukkan nilai tugas : ");
        tugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        uas = input.nextDouble();
        rata = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
        if (rata >= 85) { grade="A"; keterangan="Sangat Baik"; }
        else if (rata >= 75) { grade="B"; keterangan="Baik"; }
        else if (rata >= 65) { grade="C"; keterangan="Cukup"; }
        else if (rata >= 50) { grade="D"; keterangan="Kurang"; }
        else { grade="E"; keterangan="Sangat Kurang"; }
        System.out.println("=== HASIL PENILAIAN ===");
        System.out.println("Nama Siswa : " + nama);
        System.out.println("Nilai Akhir : " + rata);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
        if (rata >= 75) System.out.println("Status : LULUS");
        else System.out.println("Status : TIDAK LULUS");
    }
}