package assessment2;

public class soal4 {
    public static void main(String[] args) {
        int[] dataArray = new int[100];

        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = i;
        }
        String angkaGenap = "Genap";
        String angkaGanjil = "Ganjil";
        String totalAngka = "Total";

        print(dataArray, totalAngka);
    }
    public static void print(int[] data, String result) {
        switch (result) {
            case "Genap":
                int totalGenap = 0;
                for (int i = 0; i < data.length; i++) {
                    if (data[i] % 2 == 0) {
                        System.out.println(data[i]);
                        totalGenap++;
                    }
                }
                System.out.println("nilai total = " + nilaiTotal(totalGenap));
                break;
            case "Ganjil":
                int totalGanjil = 1;
                for (int j = 0; j < data.length; j++) {
                    if (data[j] % 2 == 1) {
                        System.out.println(data[j]);
                        totalGanjil++;
                    }
                }
                System.out.println("nilai total = " + nilaiTotal(totalGanjil));
                break;
            case "Total":
                int total = 0;
                for (int x = 0; x < data.length; x++) {
                        System.out.println(data[x]);
                        total++;
                }
                System.out.println("nilai total = " + nilaiTotal(total));
        }
    }

    public static int nilaiTotal(int data) {
        int total = 0;
        for (int i = 0; i < data; i++) {
            total += i;
        }
        return total;
    }
}
