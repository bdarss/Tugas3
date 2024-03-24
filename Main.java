package Tugas3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner bil = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMHS = new ArrayList<>();

        System.out.print("Masukan Nama: ");
        String nim = bil.nextLine();
        System.out.print("Masukan NIM: ");
        String nama = bil.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama);
        daftarMHS.add(mahasiswa);

        ArrayList<MataKuliah> daftarMatkul = new ArrayList<>();
        while (true) {
            System.out.print("Masukkan kode mata kuliah: ");
            String kode = bil.nextLine();

            System.out.print("Masukkan nama mata kuliah: ");
            String namaMatkul = bil.nextLine();

            System.out.print("Masukkan nilai angka: ");
            int nilaiAngka = bil.nextInt();
            bil.nextLine();
            daftarMatkul.add(new MataKuliah(kode, namaMatkul, nilaiAngka));

            System.out.println("Apakah Anda ingin menambahkan mata kuliah lagi? (ya/tidak)");
            String input = bil.nextLine();

            if (!input.equalsIgnoreCase("ya")) {
                break;
            }
        }

        System.out.println("\nKHS:");
        System.out.println("Name: " + mahasiswa.nama);
        System.out.println("NIM: " + mahasiswa.nim);
        System.out.printf("%-10s %-30s %-7s\n", "Kode", "Mata Kuliah", "Grade");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < daftarMatkul.size(); i++) {
            System.out.printf("%-10s %-30s %-10s\n", daftarMatkul.get(i).kode, daftarMatkul.get(i).namaMatkul, daftarMatkul.get(i).hurufNilai);
        }
    }
}
