package praktikum_1.latihan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataDiri {
    public static void main(String[] args) {
        String nama = "Abrar Astafaraiz";
        String tempatLahir = "Langsa";
        LocalDate TglLahir = LocalDate.of(2006,12,1);
        String GolonganDarah = "AB";
        int umur = 20;
        double tinggi = 1.75;
        char JenisKelamin = 'L';
        String Agama = "Islam";
        String Pekerjaan = "Mahasiswa";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Nama Lengkap : " + nama);
        System.out.println("TempatLahir : " + tempatLahir);
        System.out.println("Tanggal Lahir : " + TglLahir.format(format));
        System.out.println("Golongan Darah : " + GolonganDarah);
        System.out.println("Umur: "  + umur);
        System.out.println("Tinggi Badan: "  + tinggi);
        System.out.println("JenisKelamin: " + JenisKelamin);
        System.out.println("Agama : " + Agama);
        System.out.println("Pekerjaan : " + Pekerjaan);

    }
}
