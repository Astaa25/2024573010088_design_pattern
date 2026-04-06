package praktikum_2.latihan.latihan_5;

public class Main {
    public static void main(String[] args) {
        // menggunakan default constructor
        Barang barang1 = new Barang();

        // menggunakan parameterized constructor
        Barang barang2 = new Barang("Laptop", 7500000);

        barang1.tampilkanInfo();
        System.out.println();
        barang2.tampilkanInfo();
    }
}
