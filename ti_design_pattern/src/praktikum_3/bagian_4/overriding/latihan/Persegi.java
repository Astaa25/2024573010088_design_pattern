package praktikum_3.bagian_4.overriding.latihan;

public class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}
