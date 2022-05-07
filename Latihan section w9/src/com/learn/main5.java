package com.learn;
import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input nilai awal = ");
        int nilaiAwal = sc.nextInt();
        System.out.print("input nilai akhir = ");
        int nilaiAkhir = sc.nextInt();
        for (int i = nilaiAwal; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
            System.out.println("nilai ke - " + nilaiAwal + " " + periksaGenap(nilaiAwal));
        }

    }
    public static String periksaGenap(int angka) {
        if (angka % 2 == 0) {
            return "genap";
        } else {
            return "ganjil";
        }
    }

}
