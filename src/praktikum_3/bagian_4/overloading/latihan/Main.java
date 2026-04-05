package praktikum_3.bagian_4.overloading.latihan;

public class Main {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();

        System.out.println("Hasil 1: " + mtk.tambah(12, 10));
        System.out.println("Hasil 2: " + mtk.tambah(5, 15, 17));
        System.out.println("Hasil 3: " + mtk.tambah(4.5, 7.5));
    }
}
