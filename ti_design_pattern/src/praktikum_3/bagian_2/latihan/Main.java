package praktikum_3.bagian_2.latihan;

import praktikum_3.bagian_2.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Motor mtr1 =  new Motor();
        mtr1.setMerk("N-Max");
        mtr1.setTahun(2026);

        System.out.println("Nama : "+mtr1.getMerk());
        System.out.println("Umur : "+mtr1.getTahun());
    }
}