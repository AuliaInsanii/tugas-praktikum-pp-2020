import java.util.Scanner; //Done

public class Praktikum3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();
        int a = 0, b = 1;
        
        for (int i=1; i<=n; ++i) {
            System.out.print(a + " ");
            a += b;
            b = a - b;
        }
    }
}
