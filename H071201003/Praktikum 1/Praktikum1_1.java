import java.util.Scanner;

public class Praktikum1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan waktu (t) = ");
        int t = input.nextInt();
        System.out.print("masukkan kecepatan rata-rata (v) = ");
        int v = input.nextInt();
        double s = v * t;                                                                  // s = jarak
        double bensin = s / 14;
        
        System.out.printf("Bensin yang digunakan = %.3f L \n ", bensin); 
    }
}