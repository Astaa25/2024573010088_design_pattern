package praktikum_3.bagian_5.antarmuka;

public interface Bergerak {
    void bergerak();

    default void berhenti() {
        System.out.println("Berhenti bergerak.");
    }

    static void info() {
        System.out.println("Ini adalah Interface Bergerak.");
    }
}
