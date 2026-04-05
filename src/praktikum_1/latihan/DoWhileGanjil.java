package praktikum_1.latihan;

public class DoWhileGanjil {
    public static void main(String[] args) {
        int i= 1;

        do {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
