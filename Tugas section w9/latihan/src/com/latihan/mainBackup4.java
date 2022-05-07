package com.latihan;

import java.util.Scanner;

public class mainBackup4 {
    public static void main(String[] args) {
        String[][] dataArray = new String[10][2];
        int jumlahBarang = inputBarang(dataArray);
        printArray(dataArray, jumlahBarang);
    }

    public static int inputBarang(String[][] array) {
        Scanner sc = new Scanner(System.in);
        boolean kontak = false;
        String kodeBarang;
        String namaBarang;
        int i = 0;

        do {
            System.out.print("masukan kode barang = ");
            kodeBarang = sc.nextLine();
            if (kodeBarang.equals("")) {
                kontak = true;
            }

            if (!kontak) {
                System.out.print("masukan nama barang = ");
                namaBarang = sc.nextLine();
                array[i][0] = kodeBarang;
                array[i][1] = namaBarang;
                i++;
                if (i == array.length) {
                    kontak = true;
                }
            }
        } while (!kontak);
        sc.close();
        return i;
    }

    public static void printArray(String[][] data, int jumlahBarang) {
        System.out.println("NO  Kode  Nama");
        System.out.println("-----------------");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println(
                    (i + 1) + ". " + data[i][0] + " Barang " + data[i][1] + " nomor " + (i + 1));
        }
    }
}
