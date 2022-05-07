package latihan_soal;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input baris = ");
        int baris = sc.nextInt();
        System.out.print("input kolom = ");
        int kolom = sc.nextInt();

        int x = 1;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(x % 10);
                x++;
            }
            System.out.println();
        }
        x -= 1;
        System.out.println("jumlah angka = " + x);
    }
}
