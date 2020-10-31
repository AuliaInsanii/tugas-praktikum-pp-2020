import java.util.Scanner; //Done

public class Praktikum3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai x = ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai y = ");
        int y = input.nextInt();

        for (int i = 1; i <= y; i++) {
            if (i % x == 1) {
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}
