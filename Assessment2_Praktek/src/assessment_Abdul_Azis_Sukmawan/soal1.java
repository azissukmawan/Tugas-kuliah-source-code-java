package assessment_Abdul_Azis_Sukmawan;
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    int nilai;
}

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        Mahasiswa[] dataMahasiswa = new Mahasiswa[5];
        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i] = new Mahasiswa();
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nim : ");
            dataMahasiswa[i].nim = sc.next();
            System.out.print("Nama : ");
            dataMahasiswa[i].nama = sc.next();
            System.out.print("Nilai = ");
            dataMahasiswa[i].nilai = sc.nextInt();
        }
        print(dataMahasiswa);
        System.out.println("Nilai terbesar di peroleh oleh : " + maxValue(dataMahasiswa));
        System.out.println("Nilai rata rata : " + sumValue(dataMahasiswa));
    }
    public static void print(Mahasiswa[] data){
        System.out.println("Daftar nilai mahasiswa");
        System.out.println("-------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println("No." + (i + 1) + " " + data[i].nim + ", " + data[i].nama + ", " + data[i].nilai + ", " + nilaiGrade(data[i].nilai));
        }
    }
    public static String nilaiGrade(int nilai) {
        String result = " ";
        for (int i = 0; i < nilai; i++) {
            if (nilai >= 80) {
                result = "A";
            } else if (nilai >= 70 && nilai < 80) {
                result = "B";
            } else if (nilai >= 60 && nilai < 70) {
                result = "C";
            } else if (nilai >= 40 && nilai < 60) {
                result = "D";
            } else {
                result = "E";
            }
        }
        return result;
    }
    public static String maxValue(Mahasiswa[] data) {
        int max =  data[0].nilai;
        String result = data[0].nama;
        for (int i = 0; i < data.length; i++) {
            if (data[i].nilai > max) {
                max = data[i].nilai;
                result = data[i].nama;
            }
        }
        result.equals(max);
        return result;
    }

    public static double sumValue(Mahasiswa[] nilai) {
        double sum = 0;
        for (int i = 0; i < nilai.length; i++) {
            sum += nilai[i].nilai;
        }
        return sum / nilai.length;
    }


}
