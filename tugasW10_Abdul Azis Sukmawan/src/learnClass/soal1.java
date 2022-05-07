package learnClass;

class Mahasiswa2 {
    String nim;
    String nama;
    int semester;

    Mahasiswa2(String inputNim, String inputNama, int inputSemester) {
        nim = inputNim;
        nama = inputNama;
        semester = inputSemester;

        System.out.println("Nim : " + nim + ", Nama " + nama + ", Semester : " + semester);
    }
}

public class soal1 {
    public static void main(String[] args) {
        Mahasiswa2[] mhs2 = new Mahasiswa2[10];
        mhs2[0] = new Mahasiswa2("1410120002", "Muhammad Rifky Andisa Purnama", 8);
        mhs2[1] = new Mahasiswa2("1510120014", "Muhammad Faqih Fiddien", 8);
        mhs2[2] = new Mahasiswa2("1810120001", "Adhitya Ramadhan Qodri", 4);
        mhs2[3] = new Mahasiswa2("1810120003", "Aisyah Khairunnisa Luthfiyyah", 4);
        mhs2[4] = new Mahasiswa2("1810120004", "Alvin Bryan Saputra", 4);
        mhs2[5] = new Mahasiswa2("1810120007", "Dave Rizaldy Caesar", 4);
        mhs2[6] = new Mahasiswa2("1810120009", "Farhan Daffa Ananta", 4);
        mhs2[7] = new Mahasiswa2("1810120010", "Fatiyyah Karimah", 4);
        mhs2[8] = new Mahasiswa2("1810120011", "Gian Bisyahri Ramadhan", 4);
        mhs2[9] = new Mahasiswa2("1810120013", "Muhamad Raihan Sarwaluddin", 4);
    }
}
