import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int i, j;
        int [][] matriksA = new int[4][4];
        int [][] matriksB = new int[4][4];
        int [][] jumlah = new int[4][4];
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in); 
        // input A
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                    System.out.format("Matriks A (%d,%d): ", i, j);
                    matriksA[i][j] = scan.nextInt();
            }
        }
        System.out.println(" ");
        // input B
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                    System.out.format("Matriks B (%d,%d): ", i, j);
                    matriksB[i][j] = scan.nextInt();
            }
        }
        
        // tampil A
        System.out.print("=========================");
        System.out.println(" \t MATRIKS A");
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                    System.out.format("\t | %s | \t", matriksA[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("=========================");
        // tampil B
        System.out.print("=========================");
        System.out.println(" \t MATRIKS B");
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                    System.out.format("\t | %s | \t", matriksB[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("=========================");
        // proses & hasil
        System.out.print("=========================");
        System.out.println(" \n HASIL A + B");
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                jumlah[a][b] = matriksA[i][j] + matriksB[i][j];
                System.out.format("\t | %s | \t", jumlah[a][b]);
            }
            System.out.println(" ");
        }
  }
}