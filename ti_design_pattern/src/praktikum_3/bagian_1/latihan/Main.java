package praktikum_3.bagian_1.latihan;

import praktikum_3.bagian_1.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Buku bk1 =  new Buku();
        bk1.judul = "Praktikum Design Pattern";
        bk1.penulis = "Abrar Astafaraiz";
        bk1.tahunTerbit = 2026;

        bk1.displayInfo();
    }
}
