package latihan_soal;
import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] nilai = new int[10];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("input nilai = ");
            nilai[i] = sc.nextInt();
        }
        print(nilai);
        System.out.println("nilai total = " + nilaTotal(nilai));
        System.out.println("nilai rata rata = " + nilaTotal(nilai) / nilai.length);
        System.out.println("nilai max = " + maxValue(nilai));
        System.out.println("nilai min = " + minValue(nilai));
    }
    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("nilai = " + data[i]);
        }
    }

    public static int nilaTotal(int[] data) {
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            result += data[i];
        }
        return result;
    }

    public static int maxValue(int[] data) {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static int minValue(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
}
