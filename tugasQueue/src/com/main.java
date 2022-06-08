package com;
import java.util.Scanner;

class data{
    int nilai;
}

class que{
    data[] value = new data[10];
    int tail = -1;
    int head = 0;
    int size = 0;
}


public class main {
    public static void main(String[] args) {
        que data = new que();
        init(data);

        data inputData = new data();
        display(inputData, data);
    }
    public static void init(que data) {
        data.value = new data[10];
        data.tail = -1;
        data.head = 0;
        data.size = 0;
    }
    public static boolean isFull(que data) {
        return data.size == data.value.length;
    }
    public static boolean isEmpty(que data) {
        return data.size == 0;
    }
    public static int enqueque(que data, data inputData) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai = ");
        inputData = new data();
        inputData.nilai = input.nextInt();
        if (isFull(data)) {
            System.out.println("Data is full");
        } else {
            if (isEmpty(data)) {
                data.head = 0;
                data.tail = -1;
            }
            data.tail++;
            if (data.tail == data.value.length) {
                data.tail = 0;
            }
            data.size++;
            data.value[data.tail] = inputData;
        }
        System.out.println("Data di tambahkan ke entri");
        System.out.println();
        return data.size;
    }
    public static data dequeque(que data) {
        data hasil = null;
        if (isEmpty(data)) {
            System.out.println("data penuh");
        } else {
            hasil = data.value[data.head];
            data.head++;
            if (data.head == data.value.length) {
                data.head = 0;
            }
            data.size--;
            if (data.size == 0) {
                data.head = 0;
                data.tail = -1;
            }
        }
        return hasil;
    }
    public static void print(que data) {
        if (isEmpty(data)) {
            System.out.println("data ksosng");
        } else {
            int counter = data.head;
            for (int i = 0; i < data.size; i++) {
                System.out.println("Nilai ke " + (i + 1));
                System.out.println("Nilai " + data.value[counter].nilai);
                System.out.println();
                counter++;
                if (counter == data.value.length) {
                    counter = 0;
                }
            }
        }
    }
    public static void menu() {
        System.out.println("Queue Menu");
        System.out.println("----------");
        System.out.println("1. Enqueue Item ke dalam Queue");
        System.out.println("2. Dequeue Item dari Queue");
        System.out.println("3. Tampilkan Isi Queue");
        System.out.println("4. Tampilkan Nilai Total, Rata-Rata, Minimum dan Maksimum");
        System.out.println("5. Keluar");
        System.out.println("----------");
        System.out.println("Masukkan pilihan anda:");
    }
    public static void display(data inputData, que data) {
        int option = 0;
        do {
            menu();
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    enqueque(data, inputData);
                    break;
                case 2:
                    data result;
                    result = dequeque(data);
                    System.out.println("nilai yang di hapus adalah " + result.nilai);
                    System.out.println("==============");
                    break;
                case 3:
                    print(data);
                    break;
                case 4:
                    int total = nilaiTotal(data);
                    double nilaiRataRata = nilaiTotal(data) / data.size;
                    System.out.println("Nilai total = " + total);
                    System.out.println("Nilai rata rata = " + nilaiRataRata);
                    System.out.println("Nilai max = " + data.value[data.tail].nilai);
                    System.out.println("Nilai min = " + data.value[data.head].nilai);
                    break;
                case 5:
                    break;
            }
        } while (option != 5);
        System.out.println("Terimakasih sudah menggunakan program sederhana ini");
    }
    public static int nilaiTotal(que data) {
        int counter = data.head;
        int result = 0;
        for (int i = 0; i < data.size; i++) {
            result += data.value[counter].nilai;
            counter++;
        }
        return result;
    }
}
