package praktikum_2.latihan.latihan_3;

public class Main {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank();

        akun.setSaldo(1000000);
        akun.tampilkanSaldo();

        // mencoba akses langsung (akan error)
        // System.out.println(akun.saldo); outputnya bakal gini = saldo has private access in AkunBank.
    }
}
