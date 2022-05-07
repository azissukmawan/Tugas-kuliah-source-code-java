package com.latihan;

import java.util.Arrays;

public class soal3 {
    public static void main(String[] args) {
        int[] nilaiUTS = { 90, 60, 45, 70, 55 };
        int[] nialiUAS = { 89, 78, 90, 88, 87 };

        int[] nilaiAkhir = nilai(nilaiUTS, nialiUAS);
        print(nilaiUTS, nialiUAS, nilaiAkhir);
        System.out.println("Rata rata nilai akhir dari semua = " + nilaiAkhirAll(nilaiUTS, nialiUAS));
        searchMax(nilaiUTS, nialiUAS);

    }

    public static void searchMax(int[] nilaiUts, int[] nilaiUas) {
        int[] nilaiJumlah = new int[nilaiUts.length];
        int[] nilaiAkhir = new int[nilaiUts.length];
        for (int i = 0; i < nilaiUts.length; i++) {
            nilaiJumlah[i] = nilaiUts[i] + nilaiUas[i];
            nilaiAkhir[i] = nilaiJumlah[i] / 2;
        }
        Arrays.sort(nilaiAkhir);
        System.out.println("nilai akhir yang terbesar adalah = " + nilaiAkhir[nilaiAkhir.length - 1]);
    }

    public static int[] nilai(int[] nilaiUts, int[] nilaiUas) {
        int[] nilaiJumlah = new int[nilaiUts.length];
        int[] nilaiAkhir = new int[nilaiUts.length];
        for (int i = 0; i < nilaiUts.length; i++) {
            nilaiJumlah[i] = nilaiUts[i] + nilaiUas[i];
            nilaiAkhir[i] = nilaiJumlah[i] / 2;
        }
        return nilaiAkhir;
    }

    public static int nilaiAkhirAll(int[] nilaiUts, int[] nilaiUas) {
        int nilaiAkhir[] = new int[nilaiUts.length + nilaiUas.length];
        for (int i = 0; i < nilaiUts.length; i++) {
            nilaiAkhir[i] = nilaiUts[i];
        }
        for (int j = 0; j < nilaiUas.length; j++) {
            nilaiAkhir[j + nilaiUas.length] = nilaiUas[j];
        }
        int result = 0;
        for (int k = 0; k < nilaiAkhir.length; k++) {
            result += nilaiAkhir[k];
        }
        return result / 10;
    }

    public static void print(int[] nilaiUts, int[] nilaiUas, int[] hasil) {
        int no = 1;
        System.out.println("No.UTS UAS Akhir");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(no + ". " + nilaiUts[i] + ", " + nilaiUas[i] + ", " + hasil[i]);
            if (i < hasil[2]) {
                System.out.println();
            }
            no++;
        }
    }

}
