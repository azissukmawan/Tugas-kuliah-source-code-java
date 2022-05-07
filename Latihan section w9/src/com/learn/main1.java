package com.learn;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
//        Bila satu inci setara dengan 2.54 cm dan satu kaki setara dengan 12 inchi. Tulislah program dengan fungsi untuk melakukan konversi tinggi manusia dari cm ke kaki dan inci.
        Scanner sc = new Scanner(System.in);
        System.out.print("tinggi badan = ");
        int tinggiBadan = sc.nextInt();
        System.out.println("Tinggi badan manusia = " + tinggiBadan + " cm");
        System.out.println("tinggi badan manusia dalam kaki " + kaki(tinggiBadan));
        System.out.println("tinggi badan manusia dalam inchi " + inchi(tinggiBadan));

    }
    public static double inchi(double cm) {
        double resultInchi = cm / 2.54;
        return resultInchi;
    }
    public static double kaki(double cm) {
        double result = inchi(cm)/12 ;
        return result;
    }

}
