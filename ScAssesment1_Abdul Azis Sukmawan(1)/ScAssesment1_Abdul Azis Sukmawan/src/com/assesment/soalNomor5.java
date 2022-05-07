package com.assesment;
import java.util.Scanner;

public class soalNomor5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("input lebar = ");
        int lebar = userInput.nextInt();
        System.out.print("input panjang = ");
        int panjang = userInput.nextInt();

        for (int x = 1; x <= panjang; x++){
            for (int y = x; y <= lebar; y++){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
