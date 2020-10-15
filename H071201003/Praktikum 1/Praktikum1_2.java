import java.util.Scanner;

public class Praktikum1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan detik = ");
        int detik = input.nextInt();
        int jam = detik / 3600;
        int menit = detik % 3600 / 60;
        detik = detik % 3600 % 60;
        

        System.out.printf("%02d : %02d : %02d" , jam , menit , detik );
        
    }
}
