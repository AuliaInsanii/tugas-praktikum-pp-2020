import java.util.InputMismatchException;
import java.util.Scanner;

public class Praktikum2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;
        int positif = 0, negatif = 0, genap = 0, ganjil = 0;
        System.out.print("Masukkan nilai : ");

        try {
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            e = input.nextInt();

            if (a > 0) {
                positif++;
            } else if (a < 0) {
                negatif++;
            }
            if (a % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            if (b > 0) {
                positif++;
            } else if (b < 0) {
                negatif++;
            }
            if (b % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            if (c > 0) {
                positif++;
            } else if (c < 0) {
                negatif++;
            }
            if (c % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            if (d > 0) {
                positif++;
            } else if (d < 0) {
                negatif++;
            }
            if (d % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            if (e > 0) {
                positif++;
            } else if (e < 0) {
                negatif++;
            }
            if (e % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            System.out.println(positif + " angka positif ");
            System.out.println(negatif + " angka negatif ");
            System.out.println(genap + " angka genap ");
            System.out.println(ganjil + " angka genap ");
        } catch (Exception exception) {
            System.out.println(" Inputan Tidak Valid ");
        }
    }
}
