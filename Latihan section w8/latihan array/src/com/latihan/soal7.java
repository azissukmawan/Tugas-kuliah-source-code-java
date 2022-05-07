package com.latihan;

import java.util.Arrays;

public class soal7 {
    public static void main(String[] args) {
        int [] nilai = {65, 80, 85, 90};
        String [] mahasiswa = {"Parto", "Rendi", "Tina", "Wanda"};

        System.out.println("Daftar nilai mahasiswa");
        System.out.println("------------------");
        System.out.println("No, Nama, Nilai");
        int no = 0;
        int sum = 0;
        for (int x = 0; x < mahasiswa.length; x++) {
            no++;
            System.out.println(no + ", " + mahasiswa[x] + ", " + nilai[x]);
            sum += nilai[x];
        }
        System.out.println("------------------");
        int nilaiRata = sum / nilai.length;
        System.out.println("nilai rata rata : " + nilaiRata);
        System.out.println("Nama dan nilai tertinggi: " + "Nilai " + nilai[3] + " di peroleh oleh " + mahasiswa[3]);
        System.out.println("Nama dan nilai tertinggi: " + "Nilai " + nilai[0] + " di peroleh oleh " + mahasiswa[0]);

    }
}
