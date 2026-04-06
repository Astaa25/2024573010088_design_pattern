package praktikum_2.latihan.latihan_5;

public class Barang {
    private String namaBarang;
    private double harga;

    // default constructor
    public Barang() {
        namaBarang = "Tidak diketahui";
        harga = 0;
    }

    // parameterized constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
    }
}
