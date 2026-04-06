package praktikum_2.bagian_6;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan(){
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku){
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam perpustakaan.");
        } else {
            System.out.println("Daftar Buku: ");
            for (Buku buku : daftarBuku) {
                buku.tampilkanInfo();
            }
        }
    }

    public void cariBuku(String judul){
        boolean ditemukan = false;
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Buku ditemukan: ");
                buku.tampilkanInfo();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
        }
    }
}
