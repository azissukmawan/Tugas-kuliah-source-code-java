package com.learn;

public class main6 {
    public static void main(String[] args) {
//        Buat sebuah fungsi yang menentukan suatu angka tahun adalah tahun kabisat. Dengan menggunakan fungsi tadi buat program yang menampilkan daftar tahun kabisat dari tahun 2021 sampai dengan tahun 2050
        int tahun1 = 2021;
        int tahun2 = 2050;
        for (int i = tahun1; i <= tahun2; i++){
            System.out.println(i + " " + tahunKabisat(i));
        }

    }

    public static String tahunKabisat(int tahun) {
        if (tahun % 400 == 0 || tahun % 400 == 1 || tahun % 100 == 1 || tahun % 4 == 0) {
            return "adalah tahun kabisat";
        } else {
            return "bukan tahun kabisat";
        }
    }
}
