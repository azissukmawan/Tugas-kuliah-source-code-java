/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan;

/**
 *
 * @author user
 */
public class mainBackup2 {
    public static void main(String[] args) {
        // siapkan data penampung,Array 5x3
        double[][] nilai = new double[5][3];
        // isi datanya dengan fungsi
        isiArray(nilai);
        // hitung nilai akhir dengan fungsi
        hitungNilaiAkhir(nilai);
        // tampilkan data dengan fungsi/prosedur
        tampilkanArray(nilai);
    }

    public static void isiArray(double[][] array) {
        array[0][0] = 90;
        array[0][1] = 89;
        array[1][0] = 60;
        array[1][1] = 78;
        array[2][0] = 45;
        array[2][1] = 90;
        array[3][0] = 70;
        array[3][1] = 88;
        array[4][0] = 55;
        array[4][1] = 87;
    }

    public static void hitungNilaiAkhir(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][2] = (array[i][0] + array[i][1]) / 2.0;
        }
    }

    public static void tampilkanArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(
                    (i + 1) + ". UTS: " + array[i][0] + " ,UAS: " + array[i][1] + ", Akhir: " + array[i][2] + ".");
        }
    }
}