package praktikum_3.bagian_4.overloading.latihan;

public class Main {
    public static void main(String[] args) {
        Matematika mtk1 = new Matematika();

        System.out.println("Hasil 1: " + mtk1.tambah(5, 10));
        System.out.println("Hasil 2: " + mtk1.tambah(5, 10, 15));
        System.out.println("Hasil 3: " + mtk1.tambah(3.5, 2.5));
    }
}
