import java.util.Scanner; // Done

public class Praktikum3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai x = ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai y = ");
        int y = input.nextInt();

        for (int i = x < y ? x : y; i <= ((x > y) ? x : y); i++) {
            if (i < 0 && i % 2 == 0) {
                System.out.println(i + " genap negatif ");
            } else if (i < 0 && 1 % 2 == 1) {
                System.out.println(i + " ganjil negatif ");
            } else if (i == 0) {
                System.out.println(i + " nol ");
            } else if (i > 0 && i % 2 == 0) {
                System.out.println(i + " genap positif");
            } else if (i > 0 && 1 % 2 == 1) {
                System.out.println(i + " ganjil positif");
            }
        }
    }
}
