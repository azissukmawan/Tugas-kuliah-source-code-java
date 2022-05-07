package com.learn;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
//        Jika diketahui terdapat sebuah nilai dengan tipe integer diinput dalam sistem. Buatlah fungsi untuk menentukan bahwa bilangan yang diinput adalah bilangan genap atau bukan
//        Yang ditampilkan :
//Nilai = <output>
//Nilai adalah bilangan genap <output>
//        atau:
//Nilai = <output>
//Nilai bukan bilangan ganjil <output>
        Scanner sc = new Scanner(System.in);
        System.out.print("Input nilai = ");
        int nilai = sc.nextInt();
        System.out.println("Nilai = " + nilai);
        System.out.println("nilai adalah bilangan " + genapGanjil(nilai));
        System.out.println(ganjilGenap(nilai));

    }
    public static String genapGanjil(int nilai) {
        if (nilai % 2 == 0){
            return "genap";
        }
        return null;
    }
    public static String ganjilGenap(int nilai) {
        if (nilai % 2 == 0) {
            return "nilai bukan bilangan ganjil";
        }
        return null;
    }

}
