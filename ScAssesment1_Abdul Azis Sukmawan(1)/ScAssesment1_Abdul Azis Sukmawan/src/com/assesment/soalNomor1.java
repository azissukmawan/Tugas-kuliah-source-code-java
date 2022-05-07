package com.assesment;
import java.util.Scanner;

public class soalNomor1 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panjang = ");
        int panjang = inputUser.nextInt();
        System.out.print("Lebar = ");
        int lebar = inputUser.nextInt();

        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        System.out.println("Bangun persegi panjang dengan panjang " + panjang + " cm dan lebar "
                + lebar + " cm mempunyai luas " + luas + " cm2 dan keliling " + keliling + " cm");
    }
}
