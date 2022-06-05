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
        display(value);
    }
    public static void cetakMenu() {
        System.out.println("Menu Utama");
        System.out.println("----------");
        System.out.println("1. Tampilkan data");
        System.out.println("2. Tampilkan data yang di sort");
        System.out.println("3. Sorting dengan BubbleSort");
        System.out.println("4. Sorting dengan SelectionSort");
        System.out.println("5. Sorting dengan ExchangeSort");
        System.out.println("6. Sorting dengan InsertionSort");
        System.out.println("7. Sequential Search");
        System.out.println("8. Keluar");
        System.out.println("----------");
        System.out.println("Masukkan pilihan anda:");
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
        return i;
    }
    public static void display(dataBuku[] data) {
        int i = input(data);
        int option = 0;
        do {
            Scanner sc = new Scanner(System.in);
            cetakMenu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    print(data, i);
                    break;
                case 2:
                    print(data, i);
                    break;
                case 3:
                    buubleShort(data, i);
                    break;
                case 4:
                    selectionSort(data, i);
                    break;
                case 5:
                    exchangeSort(data, i);
                    break;
                case 6:
                    insertionSort(data, i);
                    break;
                case 7:
                    System.out.print("Judul buku ? ");
                    String search = sc.next();
                    squentialSearch(data, search, i);
                case 8:
                    break;

            }
        } while (option != 8);
        System.out.println("Terimakasih sudah menggunakan program sederhana ini");
    }
    public static void print(dataBuku[] value, int input) {
        System.out.println("Data buku perpustakaan");
        System.out.println("========================");
        for (int i = 0; i < input; i++) {
            System.out.println("Kode buku " + value[i].kode);
            System.out.println("Judul buku " + value[i].judul);
            System.out.println("Pengarang " + value[i].pengarang);
            System.out.println("Tahun terbit " + value[i].tahunTerbit);
            System.out.println();
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
    public static void selectionSort(dataBuku[] data, int indexInput) {
        for (int i= 0; i < indexInput-2;i++) {
            int index = i;
            for (int j = i + 1; j <= indexInput-1; j++) {
                if (data[index].judul.compareTo(data[j].judul)  > 0) {
                    index = j;
                }
            }
            dataBuku swap;
            swap = data[i];
            data[i] = data[index];
            data[index] = swap;
        }
    }
    public static void exchangeSort(dataBuku[] data, int n) {
        for (int i  = 0; i <= n-2; i++) {
            for (int j = i + 1; j <= n-1; j++) {
                if (data[i].judul.compareTo(data[j].judul) > 0) {
                    dataBuku temp;
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    public static void insertionSort(dataBuku[] data, int n) {
        for (int i = 1; i <= n-1; i++) {
            String key = data[i].judul;
            int j = i -1;
            while (j >= 0 && data[j].judul.compareTo(key) > 0) {
                data[j + 1].judul = data[j].judul;
                j--;
            }
            data[j + 1].judul = key;
        }
    }
    public static void squentialSearch(dataBuku[] data, String found, int n) {
        String search = found;
        int i;
        int index = 0;
        for (i = 0; i < n && index == 0; i++) {
            if (data[i].judul.equals(search)) {
                index = 1;
            }
            System.out.println(i);
        }
        if (index > 0) {
            System.out.println("Buku " + search + " di temukan pada index " + i);
        } else {
            System.out.println("Buku tidak di temukan");
        }
    }
}
