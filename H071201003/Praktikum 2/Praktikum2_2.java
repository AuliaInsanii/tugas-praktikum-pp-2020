import java.util.Scanner;

public class Praktikum2_2 {
    public static void main(String[] args) {
        String menu, menu2, menu3;
        Scanner input = new Scanner(System.in);
        System.out.println("~ ~ menu ~ ~");
        System.out.println(" 1.Mencari luas bangun datar ");
        System.out.println(" 2.Mencari volume bangun ruang ");
        System.out.println("~ ~ ~ ~ ~ ~");
        System.out.println("Input angka sesuai dengan menu yang diinginkan : ");
        menu = input.nextLine();
        switch (menu) {
            case "1":
                System.out.println("~ ~ Pilih bangun datar ~ ~");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-layang");
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
                menu2 = input.nextLine();
                switch (menu2) {
                    case "1":
                        System.out.print("Input panjang sisi = ");
                        double s = input.nextDouble();
                        double L = s * s;
                        System.out.print("Luas persegi = " + L);
                        break;
                    case "2":
                        System.out.print("Input panjang = ");
                        double panjang = input.nextDouble();
                        System.out.print("Input lebar = ");
                        double lebar = input.nextDouble();
                        L = panjang * lebar;
                        System.out.print("Luas persegi panjang = " + L);
                        break;
                    case "3":
                        System.out.print("Input alas = ");
                        double a = input.nextDouble();
                        System.out.print("Input tinggi = ");
                        double t = input.nextDouble();
                        L = (a * t) / 2;
                        System.out.print("Luas segitiga = " + L);
                        break;
                    case "4":
                        System.out.print("Input jari-jari = ");
                        double r = input.nextDouble();
                        L = 3.14 * r * r;
                        System.out.print("Luas lingkaran = " + L);
                        break;
                    case "5":
                        System.out.print("Input alas = ");
                        a = input.nextDouble();
                        System.out.print("Input tinggi = ");
                        t = input.nextDouble();
                        L = a * t;
                        System.out.print("Luas jajar genjang = " + L);
                        break;
                    case "6":
                        System.out.print("Input sisi a = ");
                        a = input.nextDouble();
                        System.out.print("Input sisi b = ");
                        double b = input.nextDouble();
                        System.out.print("Input tinggi = ");
                        t = input.nextDouble();
                        L = 0.5 * (a + b) * t;
                        System.out.print("Luas trapesium = " + L);
                        break;
                    case "7":
                        System.out.print("Input diagonal 1 = ");
                        double d1 = input.nextDouble();
                        System.out.print("Input diagonal 2 = ");
                        double d2 = input.nextDouble();
                        L = (d1 * d2) / 2;
                        System.out.print("Luas belah ketupat = " + L);
                        break;
                    case "8":
                        System.out.print("Input diagonal 1 = ");
                        d1 = input.nextDouble();
                        System.out.print("Input diagonal 2 = ");
                        d2 = input.nextDouble();
                        L = (d1 * d2) / 2;
                        System.out.print("Luas layang-layang = " + L);
                        break;
                }
                break;
            case "2":
                System.out.println("~ ~ Pilih bangun ruang ~ ~");
                System.out.println("1. kubus");
                System.out.println("2. balok");
                System.out.println("3. kerucut");
                System.out.println("4. prisma");
                System.out.println("5. bola");
                System.out.println("6. limas segitiga");
                System.out.println("7. limas segiempat");
                System.out.println("8. tabung");
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
                System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan : ");
                menu3 = input.nextLine();
                switch (menu3) {
                    case "1":
                        System.out.print("masukkan nilai rusuk :");
                        double r = input.nextDouble();
                        double V = r * r * r;
                        System.out.print("volume kubus = " + V);
                        break;
                    case "2":
                        System.out.print("masukkan nilai panjang = ");
                        double p = input.nextDouble();
                        System.out.print("masukkan nilai lebar = ");
                        double l = input.nextDouble();
                        System.out.print("masukkan nilai tinggi = ");
                        double t = input.nextDouble();
                        V = p * l * t;
                        System.out.print("volume balok = " + V);
                        break;
                    case "3":
                        System.out.print("masukkan nilai jari-jari alas = ");
                        r = input.nextDouble();
                        System.out.print("masukkan nilai tinggi = ");
                        t = input.nextDouble();
                        V = (3.14 * r * r * t) / 3;
                        System.out.print("volume kerucut = " + V);
                        break;
                    case "4":
                        System.out.print("masukkan nilai luas alas = ");
                        Double luasAlas = input.nextDouble();
                        System.out.print("masukkan nilai tinggi = ");
                        t = input.nextDouble();
                        V = luasAlas * t;
                        System.out.print("volume prisma = " + V);
                        break;
                    case "5":
                        System.out.print("masukkan nilai jari-jari = ");
                        r = input.nextDouble();
                        V = (4.0 / 3.0) * 3.14 * r * r * r;
                        System.out.print("volume bola = " + V);
                        break;
                    case "6":
                        System.out.print("masukkan nilai luas alas = ");
                        luasAlas = input.nextDouble();
                        System.out.print("masukkan nilai tinggi = ");
                        t = input.nextDouble();
                        V = (luasAlas * t) / 3;
                        System.out.print("volume limas segitiga = " + V);
                        break;
                    case "7":
                        System.out.print("masukkan nilai luas alas = ");
                        luasAlas = input.nextDouble();
                        System.out.print("masukkan nilai tinggi = ");
                        t = input.nextDouble();
                        V = (luasAlas * t) / 3;
                        System.out.print("volume limas segiempat = " + V);
                        break;
                    case "8":
                        System.out.print("masukkan nilai jari-jari alas tabung = ");
                        r = input.nextDouble();
                        System.out.print("masukkan nilai tinggi = ");
                        t = input.nextDouble();
                        V = 3.14 * r * r * t;
                        System.out.print("volume tabung = " + V);
                        break;
                }
                break;
        }
    }
}
