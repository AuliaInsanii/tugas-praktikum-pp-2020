import java.util.Scanner; //Done

public class Praktikum5_1 {
    public static int carifpb(int x, int y){
        return (y == 0) ? x : carifpb(y, x % y);
     }

     public static void main(String[] args) {
         System.out.println("Masukkan bilangan 1");
         Scanner scan = new Scanner(System.in);
         int x= scan.nextInt();
         System.out.println("Masukkan bilangan 2");
         int y = scan.nextInt();
         int hasil;

         hasil = carifpb(x, y);
         System.out.print("FPB dari " + x + " dan " + y + " = " + hasil);
         
     }

     /*public static void main(String[] args) {
        String masuk;
        int x, y, hasil;
       
        masuk = JOptionPane.showInputDialog("Masukkan Bilangan 1");
        x = Integer.parseInt(masuk);
       
        masuk = JOptionPane.showInputDialog("Masukkan Bilangan 2");
        y = Integer.parseInt(masuk);
       
        hasil = carifpb(x, y);
       
        JOptionPane.showMessageDialog(null,
        "FPB dari " + Integer.toString(x) +  " dan " + 
        Integer.toString(y) + " adalah " + Integer.toString(hasil)
        );
       }*/
}
