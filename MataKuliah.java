package Tugas3;

public class MataKuliah {
    String kode;
    String namaMatkul;
    int angkaNilai;
    String hurufNilai;

    public MataKuliah(String kode, String namaMatkul, int angkaNilai) {
        this.kode = kode;
        this.namaMatkul = namaMatkul;
        this.angkaNilai = angkaNilai;

        if (angkaNilai >= 85) {
        this.hurufNilai = "A";
        } else if (angkaNilai >= 70) {
        this.hurufNilai = "B";
        } else if (angkaNilai >= 55) {
            this.hurufNilai = "C";
        } else if (angkaNilai >= 40) {
            this.hurufNilai = "D";
        } else {
            this.hurufNilai = "E";
        }
    }
}