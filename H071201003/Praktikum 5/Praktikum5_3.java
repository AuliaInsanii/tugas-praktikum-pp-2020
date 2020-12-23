import java.util.Scanner;//done

public class Praktikum5_3 {
    static void myDay(int a){
        int tahun, bulan;
        tahun = a / 365;
        a -= (365 * tahun);
        bulan = a / 30;
        a -= (30 * bulan);
        System.out.printf("%d tahun\n%d bulan\n%d hari", tahun, bulan, a);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Hari :");
        int hari = scan.nextInt();
        myDay(hari);
        
    }   
}
