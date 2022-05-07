package com.latihan;
import java.util.Arrays;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("input nilai : ");

        int[] nilai = new int[5];
        int jumlah = 0;
        for (int x = 0; x < nilai.length; x++) {
            nilai[x] = inputUser.nextInt();
            jumlah += nilai[x];
        }
        Arrays.sort(nilai);
        int resultNilai = jumlah / nilai.length;
        System.out.println("jumlah nilai rata rata mahasiswa = " + resultNilai);
        System.out.println("nilai tertinggi adalah = " + nilai[nilai.length-1]);
        System.out.println("nilai terendah adalah = " + nilai[0]);
    }
}
