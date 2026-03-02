package modul_1.Latihan;

public class WhileGanjil {
    public static void main(String[] args) {
        int i= 1;

        while (i <= 20) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
