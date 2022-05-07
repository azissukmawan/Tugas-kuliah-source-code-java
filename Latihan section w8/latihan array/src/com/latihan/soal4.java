package com.latihan;
import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        String[] buah = new String[5];

        System.out.println("input buah:");
        for (int i = 0; i < buah.length; i++) {
            buah[i] = inputUser.next();
        }
        System.out.println("Buah yang tersdia adalah : ");
        for (int x = 0; x < buah.length; x++) {
            if (x < buah.length-1 && x != buah.length-5) {
                System.out.print(", ");
            } else if (x == buah.length-1) {
                System.out.print(" dan ");
            }
            System.out.print(buah[x]);
        }
        System.out.print(".");
    }
}
