package com.latihan;

import java.util.Scanner;

public class soalNomor1 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Bulan ke berapa ? ");
        int user = inputUser.nextInt();

        String musimDingin = "musim dingin";
        String musimPanas = "musim panas";
        String musimGugur = "musim gugur";
        String musimSemi = "musim semi";
        if (user <= 2 || user == 12) {
            System.out.println("Bulan ke-" + user + " adalah " + musimDingin);
        } else if (user >= 6 && user <= 8) {
            System.out.println("Bulan ke-" + user + " adalah " + musimPanas);
        } else if (user >= 9 && user <= 11) {
            System.out.println("Bulan ke-" + user + " adalah " + musimGugur);
        } else {
            System.out.println("Bulan ke-" + user + " adalah " + musimSemi);
        }
    }
}
