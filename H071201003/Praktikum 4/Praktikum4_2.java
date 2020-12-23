import java.util.Scanner; 

public class Praktikum4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int[][] matriksA = new int[i][j];
        int[][] matriksB = new int[j][k];
        int[][] hasil = new int[i][k];

        System.out.println("Input Matriks A");
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                matriksA[x][y] = scan.nextInt();
            }
        }
        System.out.println("Input Matriks B");
        for (int x = 0; x < j; x++) {
            for (int y = 0; y < k; y++) {
                matriksB[x][y] = scan.nextInt();
            }
        }

        for (int x = 0; x < hasil.length; x++) {
            for (int y = 0; y <= matriksA.length; y++) { // matriksA.length == baris matriksA == 3
                for (int z = 0; z < matriksA[0].length; z++) { // matriksA[0].length == kolom matriksA == 2
                    hasil[x][y] += (matriksA[x][z] * matriksB[z][y]);
                }
            }
        }

        System.out.println("Hasil Perkalian Matriks :");
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < k; y++) {
                System.out.print(hasil[x][y] + " ");
            }
            System.out.println();
        }




        /*int[][] a = new int[][]{
            {1,2},
            {2,6},
            {4,3}
      };
           
      int[][] b = new int[][]{
            {7,5,6,3},
            {1,2,2,4}
      };
     
      System.out.println("Cetak Matriks A");
      for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                  System.out.print( a[i][j]+" ");    
            }
            System.out.println(" ");
      }
     
      System.out.println("Cetak Matriks B");
      for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                  System.out.print( b[i][j]+" ");    
            }
            System.out.println(" ");
      }
     
      int[][] c = new int[3][4];
      System.out.println("Hasil Perkalian Matriks A * Matriks B");
      for(int i=0; i<3; i++){
      for(int j=0; j<4; j++){
      for(int k=0; k<2; k++){
            c[i][j]+=a[i][k]*b[k][j];
      }
      System.out.print(c[i][j]+" ");
      }
      System.out.println(" ");
      }*/
    }
}
