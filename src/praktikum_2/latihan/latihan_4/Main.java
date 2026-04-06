package praktikum_2.latihan.latihan_4;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        // menggunakan setter
        mhs.setNama("Abrar Astafaraiz");
        mhs.setNim("2024573010088");

        // menampilkan dengan getter
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
    }
}
