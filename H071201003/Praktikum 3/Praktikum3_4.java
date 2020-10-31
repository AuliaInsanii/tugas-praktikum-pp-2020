import java.util.Scanner; // Done

public class Praktikum3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan harga barang = ");
        int hargaBarang = input.nextInt();
        System.out.print("Masukkan nilai uang yang dibayar = ");
        int banyakUang = input.nextInt();
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;
        

        int n = banyakUang - hargaBarang;
        while (n >= 100000) {
            n -= 100000;
            a++;
        } while (n>=50000) {
            n -= 50000;
            b++;
        } while (n>=20000) {
            n -= 20000;
            c++;
        }  while (n>=10000) {
            n -= 10000;
            d++;
        }  while (n>=5000) {
            n -= 5000;
            e++;
        }  while (n>=2000) {
            n -= 2000;
            f++;
        }  while (n>=1000) {
            n -= 1000;
            g++;
        }  

        
        System.out.println(a + " uang Rp. 100.000 ");
        System.out.println(b + " uang Rp. 50.000 ");
        System.out.println(c + " uang Rp. 20.000 ");
        System.out.println(d + " uang Rp. 10.000 ");
        System.out.println(e + " uang Rp. 5.000 ");
        System.out.println(f + " uang Rp. 2.000 ");
        System.out.println(g + " uang Rp. 1.000 ");
    }
}