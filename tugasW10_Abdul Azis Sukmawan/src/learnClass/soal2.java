package learnClass;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[5];
        isiData(mhs);
        print(mhs);
    }
    public static void isiData(Mahasiswa[] data) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            data[i] = new Mahasiswa();
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nim = ");
            data[i].nim = sc.next();
            System.out.print("Nama = ");
            data[i].nama = sc.next();
            System.out.print("Semester = ");
            data[i].semester = sc.nextInt();
            System.out.print("ipk = ");
            data[i].ipk = sc.nextDouble();
        }
    }

    public static String hasil(double data) {
        String result;
        if (data >= 3) {
            result = "baik";
        } else if (data >= 2 && data < 3) {
            result = "cukup";
        } else {
            result = "kurang";
        }
        return result;
    }

    public static void print(Mahasiswa[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("No " + (i + 1) + ". Nim : " + data[i].nim + ", Nama: " + data[i].nama + ", Semester = " + data[i].semester + ", ipk : " + data[i].ipk + " status : " + hasil(data[i].ipk));
        }
    }

}
