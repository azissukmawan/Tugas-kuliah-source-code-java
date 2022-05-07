package com.latihan;
import java.util.Arrays;
import java.util.Scanner;

public class soal8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String mahasiswa[];
        mahasiswa = new String[4];
        int nilai[];
        nilai = new int[4];

        System.out.println("Input mahasiswa dan nilai : ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nama = ");
            mahasiswa[i] = userInput.next();
            System.out.print("Nilai = ");
            nilai[i] = userInput.nextInt();

            System.out.println();
        }

        System.out.println("Daftar nilai mahasiswa");
        System.out.println("------------------");
        System.out.println("No, Nama, Nilai");
        int no = 0;
        int sum = 0;
        for (int i = 0; i < nilai.length ; i++) {
            no++;
            System.out.print(no + ", ");
            System.out.print(mahasiswa[i] + ", ");
            System.out.println(nilai[i] + ", ");
            sum += nilai[i];
        }
        Arrays.sort(nilai);
        int nilaiRata = sum / nilai.length;
        System.out.println("nilai rata rata : " + nilaiRata);
        System.out.println("Nama dan nilai tertinggi: " + "Nilai " + nilai[nilai.length - 1] + " di peroleh oleh " + mahasiswa[mahasiswa.length-1]);
        System.out.println("Nama dan nilai Terendah: " + "Nilai " + nilai[0] + " di peroleh oleh " + mahasiswa[0]);
    }
}