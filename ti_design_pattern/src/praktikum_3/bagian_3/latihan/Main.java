package praktikum_3.bagian_3.latihan;

// Class Processor
class Processor {
    void jalankan() {
        System.out.println("Processor sedang berjalan");
    }
}

// Class RAM
class RAM {
    void baca() {
        System.out.println("RAM membaca data");
    }

    void tulis() {
        System.out.println("RAM menulis data");
    }
}

// Class Laptop (Composition)
class Laptop {
    private Processor processor;
    private RAM ram;

    // Constructor
    public Laptop() {
        this.processor = new Processor();
        this.ram = new RAM();
    }

    void nyalakanLaptop() {
        processor.jalankan();
        ram.baca();
        ram.tulis();
        System.out.println("Laptop dinyalakan");
    }

    void matikanLaptop() {
        System.out.println("Laptop dimatikan.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.nyalakanLaptop();
        laptop.matikanLaptop();
    }
}