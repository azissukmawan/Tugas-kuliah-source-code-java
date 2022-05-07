package com.assesment;
import java.util.Scanner;

public class soalNomor2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Tahun = ");
        int tahun = inputUser.nextInt();

        if (tahun % 400 == 0) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat, sehingga jumlah hari adalah 366 hari");
        } else if (tahun % 400 == 1 || tahun % 100 == 0) {
            System.out.println("Tahun " + tahun + " adalah bukan tahun kabisat, sehingga jumlah hari adalah 365 hari");
        } else if (tahun % 400 == 1 || tahun % 100 == 1 || tahun % 4 == 0) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat, sehingga jumlah hari adalah 366 hari");
        } else {
            System.out.println("Tahun " + tahun + " adalah bukan tahun kabisat, sehingga jumlah hari adalah 365 hari");
        }
    }
}
