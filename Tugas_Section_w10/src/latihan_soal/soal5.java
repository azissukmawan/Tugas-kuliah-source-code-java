package latihan_soal;

public class soal5 {
    public static void main(String[] args) {
        String[][] dataMahasiswa = {
                {"N1910120042", "Ani Arini"},
                {"N1910120043", "Budi Mulyadi"},
                {"N1910120044", "Cecep Gorbacep"},
                {"N1910120045", "Dodi Dora"},
                {"N1910120046", "Endah Pamandangan"}
        };
        int[] nilai = {80, 73, 95, 45, 60};
        print(dataMahasiswa, nilai);
    }

    public static void print(String[][] data, int[] nilai) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + ", " + data[i][1] + ", "+ nilai[i] + ", " + jenisNilai(nilai, i));
        }
    }

    public static String jenisNilai(int[] nilai, int index) {
        String result = " ";
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[index] >= 80) {
                result = "A";
            } else if (nilai[index] >= 70 && nilai[i] < 80) {
                result = "B";
            } else if (nilai[index] >= 60 && nilai[i] < 70) {
                result = "C";
            } else if (nilai[index] >= 40 && nilai[i] < 60) {
                result = "D";
            } else if (nilai[index] < 40) {
                result = "E";
            }
        }
        return result;
    }

}
