package praktikum_3.bagian_5.latihan;

interface Berenang {
    void berenang();
}

abstract class HewanAir {
    String nama;

    abstract void makan();
}

class Ikan extends HewanAir implements Berenang {

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang.");
    }

    @Override
    void makan() {
        System.out.println(nama + " sedang makan di air.");
    }
}

public class Main {
    public static void main(String[] args) {
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Nemo";

        ikan.makan();
        ikan.berenang();
    }
}