package praktikum_3.bagian_3;

import praktikum_3.bagian_3.komposisi.Mesin;

class mesin {
    void hidupkan() {
        System.out.println("Mesin menyala.");
    }

    void matikan() {
        System.out.println("Mesin dimatikan.");
    }
}

class kendaraan {
    void bergerak() {
        System.out.println("Kendaraan sedang bergerak.");
    }
}

class Mobil extends kendaraan {
    private Mesin mesin;

    public Mobil() {
        this.mesin = new Mesin();
    }

    void mulai() {
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan.");
    }

    void berhenti() {
        mesin.matikan();
        System.out.println("Mobil berhenti.");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.mulai();
        mobil.bergerak();
        mobil.berhenti();
    }
}
