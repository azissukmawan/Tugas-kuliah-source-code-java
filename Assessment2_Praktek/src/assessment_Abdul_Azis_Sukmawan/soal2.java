package assessment_Abdul_Azis_Sukmawan;
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        System.out.println("Program untuk menghitung Gaji Karyawan PT. EBS");
        System.out.println("----------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int[] gajilPokok = new int[4];
        int[] jamLembur = new int[4];
        for (int i = 0; i < gajilPokok.length; i++) {
            System.out.print("Masukan gaji pokok karyawan ke-" + (1 + i) + " : ");
            gajilPokok[i] = sc.nextInt();
            System.out.print("Masukan Lama lembur (jam) karyawan ke-" + (1 + i) + " : ");
            jamLembur[i] = sc.nextInt();
        }
        System.out.println("----------------------------------------------");
        double[] gajiLembur = new double[jamLembur.length];
        for (int j = 0; j < gajiLembur.length; j++) {
            int batasLembur = jamLembur[0];
            if (jamLembur[j] > 20) {
                batasLembur = jamLembur[j] - jamLembur[j] % 20;
                gajiLembur[j] = batasLembur * 0.01 * gajilPokok[j];
            }
            if (jamLembur[j] <= 20) {
                gajiLembur[j] = jamLembur[j] * 0.01 * gajilPokok[j];
            }
        }
        double[] komponenGaji = new double[4];
        double[] pajak = new double[gajilPokok.length];
        double[] hasil = new double[gajiLembur.length];
        int totalGaji = 0;
        int totalPajak = 0;
        for (int x = 0; x < gajiLembur.length; x++) {
            komponenGaji[x] = gajilPokok[x] + gajiLembur[x];
            pajak[x] = komponenGaji[x] * 0.01 *  10;
            hasil[x] = komponenGaji[x] - pajak[x];
            totalGaji += hasil[x];
            totalPajak += pajak[x];
            System.out.println("Karyawan ke-" + (x + 1) + ": " + hasil[x] + "0");
        }
        System.out.println("----------------------------------------------");
        System.out.println("Total gaji : " + totalGaji + ".00");
        System.out.println("Total pajak : " + totalPajak + ".00");
    }
}
