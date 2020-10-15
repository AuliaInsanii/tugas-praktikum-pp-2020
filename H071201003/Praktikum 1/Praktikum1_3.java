import java.util.Scanner;

public class Praktikum1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai h = ");
        int h = input.nextInt();
        System.out.print("masukkan nilai a = ");
        int a = input.nextInt();
        System.out.print("masukkan nilai b = ");
        int b = input.nextInt();

        double sudut1 = Math.tan(Math.toRadians(a))*h;
        double sudut2 = Math.tan(Math.toRadians(b))*h;
        double total = sudut1 - sudut2;

        System.out.printf("Panjang kapal = %.1f m \n", total);

    }
}
