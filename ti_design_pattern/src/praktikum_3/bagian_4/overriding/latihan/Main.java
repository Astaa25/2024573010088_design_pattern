package praktikum_3.bagian_4.overriding.latihan;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd1 = new Persegi(4);
        BangunDatar bd2 = new Lingkaran(7);

        System.out.println("Luas Persegi: " + bd1.hitungLuas());
        System.out.println("Luas Lingkaran: " + bd2.hitungLuas());
    }
}