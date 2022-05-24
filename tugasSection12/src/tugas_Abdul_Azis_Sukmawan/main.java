package tugas_Abdul_Azis_Sukmawan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] array = {23,41,50,8,7,2};
        print(array);
    }
    public static void cetakMenu() {
        System.out.println("Menu Utama");
        System.out.println("----------");
        System.out.println("1. Array Awal");
        System.out.println("2. Tampilkan Array");
        System.out.println("3. Sorting dengan BubbleSort");
        System.out.println("4. Sorting dengan SelectionSort");
        System.out.println("5. Sorting dengan ExchangeSort");
        System.out.println("6. Sorting dengan InsertionSort");
        System.out.println("7. Sequential Search");
        System.out.println("8. Keluar");
        System.out.println("----------");
        System.out.println("Masukkan pilihan anda:");
    }
    public static void print(int[] data) {
        int option = 0;
        do {
            cetakMenu();
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    printArray(data);
                    break;
                case 2:
                    printArray(data);
                    break;
                case 3:
                    bubbleShort(data);
                    break;
                case 4:
                    selectionSort(data);
                    break;
                case 5:
                    exchangeSort(data);
                    break;
                case 6:
                    insertionSort(data);
                    break;
                case 7:
                    System.out.print("angka yang di cari ? ");
                    int search = sc.nextInt();
                    squentialSearch(data, search);
                    break;
                case 8:
                    break;

            }
        } while (option != 8);
        System.out.println("Terimakasih sudah menggunakan program sederhana ini");
    }
    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println("");
    }
    public static void bubbleShort(int[] data) {
        boolean onOf;
        do {
            onOf = false;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    if (data[i] > data[i + 1]) {
                        int swap;
                        swap = data[i];
                        data[i] = data[i + 1];
                        data[i + 1] = swap;
                        onOf = true;
                    }
                }
            }
        } while (onOf == true);
    }
    public static void selectionSort(int[] data) {
        int n = data.length;
        for (int i= 0; i < n-2;i++) {
            int index = i;
            for (int j = i + 1; j <= n-1; j++) {
                if (data[index] > data[j]) {
                    index = j;
                }
            }
            int swap;
            swap = data[i];
            data[i] = data[index];
            data[index] = swap;
        }
    }
    public static void exchangeSort(int[] data) {
        int n = data.length;
        for (int i  = 0; i <= n-2; i++) {
            for (int j = i + 1; j <= n-1; j++) {
                if (data[i] > data[j]) {
                    int temp;
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] data) {
        int n = data.length;
        for (int i = 1; i <= n-1; i++) {
            int key = data[i];
            int j = i -1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }
    public static void squentialSearch(int[] data, int found) {
        int search = found;
        int i;
        int index = 0;
        for (i = 0; i < data.length && index == 0; i++) {
            if (data[i] == search) {
                index = 1;
            }
            System.out.println(i);
        }
        if (index > 0) {
            System.out.println("Data " + search + " di temukan pada index " + i);
        } else {
            System.out.println("data tidak di temukan");
        }
    }

}
