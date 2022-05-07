package latihan_soal;

public class soal3 {
    public static void main(String[] args) {
        int[] dataArray = new int[201];

        for (int i = 101; i < dataArray.length; i += 4) {
            dataArray[i] = i;
            System.out.println(dataArray[i]);
        }

        System.out.println("jumlah bilangan = " + jumlah(dataArray));
    }

    public static int jumlah(int[] data) {
        int result = 0;
        for (int i = 101; i < data.length; i += 4) {
            result += data[i];
        }
        return result;
    }
}
