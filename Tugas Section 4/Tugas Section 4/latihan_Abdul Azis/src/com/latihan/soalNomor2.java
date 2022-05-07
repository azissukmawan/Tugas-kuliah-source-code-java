package com.latihan;

import java.util.Scanner;

public class soalNomor2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan angka = ");
        int angka = userInput.nextInt();
        switch (angka) {
            case 0:
                System.out.println("Angka yang anda masukan adalah \"nol\"");
                break;
            case 1:
                System.out.println("Angka yang anda masukan adalah \"satu\"");
                break;
            case 2:
                System.out.println("Angka yang anda masukan adalah \"dua\"");
                break;
            case 3:
                System.out.println("Angka yang anda masukan adalah \"tiga\"");
                break;
            case 4:
                System.out.println("Angka yang anda masukan adalah \"empat\"");
                break;
            case 5:
                System.out.println("Angka yang anda masukan adalah \"lima\"");
                break;
            case 6:
                System.out.println("Angka yang anda masukan adalah \"enam\"");
                break;
            case 7:
                System.out.println("Angka yang anda masukan adalah \"tujuh\"");
                break;
            case 8:
                System.out.println("Angka yang anda masukan adalah \"delapan\"");
                break;
            case 9:
                System.out.println("Angka yang anda masukan adalah \"sembilan\"");
                break;
        }
    }
}
