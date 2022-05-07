package com.learn;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
//        Bila diketahui 1 kilogram setara dengan 1000 gram, dan 1 kilogram setara dengan 10 ons. Jika sistem penjualan gula memasukan input dalam gram. Buatlah program untuk melakukan konversi berat gula dimana harga 1 ons gula adalah 1500 rupiah.
        Scanner sc = new Scanner(System.in);
        System.out.print("input gula dalam gram = ");
        int gula = sc.nextInt();
        System.out.println("Gula " + gula + " gram");
        System.out.println("Berat gula dalam kilogram " + kilo(gula));
        System.out.println("Berat gula dalam ons " + ons(gula));
        System.out.println("Harga gula = " + hargaGula(gula));
    }
    public static double kilo(double gram) {
        double kilo = gram / 1000;
        return kilo;
    }
    public static double ons(double kg) {
        double ons = kilo(kg) * 10;
        return ons;
    }

    public static double hargaGula(double ons) {
        double hargaGula = ons(ons) * 1500;
        return hargaGula;
    }

}
