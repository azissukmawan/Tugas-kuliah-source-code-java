package com.learn;
import java.util.Scanner;

public class main {
//    Jika diketahui terdapat dua buah nilai dengan tipe integer diinput dalam sistem. Buatlah fungsi untuk menentukan manakah bilangan yang terbesar.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nilai 1 = ");
        int nilai1 = input.nextInt();
        System.out.println("Nilai1 = " + nilai1);
        System.out.print("nilai 2 = ");
        int nilai2 = input.nextInt();
        System.out.println("Nilai2 = " + nilai2);

        int result = perbandingan(nilai1, nilai2);
        System.out.println("Nilai terbesarnya adalah " + result);
    }

    public static int perbandingan(int nilai1, int nilai2) {
        if (nilai1 > nilai2) {
            return nilai1;
        } else {
            return nilai2;
        }
    }


}
