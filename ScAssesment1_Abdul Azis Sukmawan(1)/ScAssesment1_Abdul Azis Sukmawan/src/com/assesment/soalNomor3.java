package com.assesment;
import java.util.Scanner;

public class soalNomor3 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("harga pakaian = ");
        int hargaPakaian = inputUser.nextInt();
        System.out.print("input jumlah pembelian = ");
        int jumlahLembar = inputUser.nextInt();
        if (jumlahLembar >= 3 && jumlahLembar <= 5) {
            double result = (hargaPakaian * jumlahLembar) - (hargaPakaian * 0.1);
            System.out.println("Harga satuan pakaian " + hargaPakaian + ", jumlah lembar = " + jumlahLembar +
                    "\n" + " dengan harga bayar = " + result + " dan besar diskon sebesar " + (hargaPakaian * 0.1));
        } else if (jumlahLembar >= 6) {
            double result = (hargaPakaian * jumlahLembar) - (hargaPakaian * 0.2);
            System.out.println("Harga satuan pakaian " + hargaPakaian + ", jumlah lembar = " + jumlahLembar +
                    "\n" + " dengan harga bayar = " + result + " dan besar diskon sebesar " + (hargaPakaian * 0.2));
        } else {
            double result = (hargaPakaian * jumlahLembar);
            System.out.println("Harga satuan pakaian " + hargaPakaian + ", jumlah lembar = " + jumlahLembar +
                    "\n" + " dengan harga bayar = " + result + " dan besar diskon sebesar " + (hargaPakaian * 0));
        }
    }
}
