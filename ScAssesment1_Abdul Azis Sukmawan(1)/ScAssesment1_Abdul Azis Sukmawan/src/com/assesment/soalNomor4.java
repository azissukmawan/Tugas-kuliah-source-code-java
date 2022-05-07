package com.assesment;
import java.util.Scanner;
public class soalNomor4 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("jumlah baris = ");
        int baris = inputUser.nextInt();
        System.out.print("jumlah kolom = ");
        int kolom = inputUser.nextInt();

        int jumlahBintang = 0;
        for(int i=1; i<=kolom; i++) {
            for(int j=1; j<=baris; j++) {
                if (i==1||i==kolom||j==1||j==baris) {
                    System.out.print("*");
                    jumlahBintang++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("jumlah * = " + jumlahBintang);
    }
}
