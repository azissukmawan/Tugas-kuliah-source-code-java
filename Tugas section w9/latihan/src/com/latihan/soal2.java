package com.latihan;

public class soal2 {
    public static void main(String[] args) {
        int[] nilaiUTS = { 90, 60, 45, 70, 55 };
        int[] nialiUAS = { 89, 78, 90, 88, 87 };

        int[] nilaiAkhir = nilai(nilaiUTS, nialiUAS);
        print(nilaiUTS, nialiUAS, nilaiAkhir);
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
