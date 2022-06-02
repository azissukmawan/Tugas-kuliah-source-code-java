package com;
import java.util.Scanner;

class dataBuku {
    int kode;
    String judul;
    String pengarang;
    String tahunTerbit;
}

public class main {
    public static void main(String[] args) {
        dataBuku[] value = new dataBuku[10];
        int data = input(value);
        buubleShort(value, data);
        print(value, data);
    }
    public static int input(dataBuku[] value) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        boolean kontak = false;
        String option;
        int i = 0;

        do {
            if (!kontak) {
                value[i] = new dataBuku();
                System.out.print("Kode buku = ");
                value[i].kode = input.nextInt();
                System.out.print("Judul buku = ");
                value[i].judul = input.next();
                System.out.print("Pengarang = ");
                value[i].pengarang = input.next();
                System.out.print("Tahun terbit = ");
                value[i].tahunTerbit = input.next();
                i++;
                if (i == value.length) {
                    kontak = true;
                    break;
                }
            }

            System.out.print("Tambah data ? Y / n = ");
            option = input.next();
            if (option.equals("n")) {
                kontak = true;
            }
        } while (!kontak);
        input.close();
        return i;
    }
    public static void print(dataBuku[] value, int input) {
        System.out.println("Data buku perpustakaan");
        System.out.println("========================");
        for (int i = 0; i < input; i++) {
            System.out.println("Kode buku " + value[i].kode + ", judul buku " + value[i].judul + ", pengarang " + value[i].pengarang + ", tahun terbit " + value[i].tahunTerbit);
        }
    }
    public static void buubleShort(dataBuku[] data, int input) {
        boolean onOf;
        do {
            onOf = false;
            for (int i = 0; i < input - 1; i++) {
                if (data[i].judul.compareTo(data[i + 1].judul) > 0) {
                        dataBuku swap;
                        swap = data[i];
                        data[i] = data[i + 1];
                        data[i + 1] = swap;
                        onOf = true;
                }
            }
        } while (onOf == true);
    }
}
