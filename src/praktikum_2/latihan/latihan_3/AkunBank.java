package praktikum_2.latihan.latihan_3;

public class AkunBank {
    private double saldo;

    public void tampilkanSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    // optional: method untuk mengisi saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
