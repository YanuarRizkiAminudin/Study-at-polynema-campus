package SumArraydenganAlgoritmaBruteForceAndCongkuer;
import java.util.Scanner;

public class MainSum128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.println("Masukan jumlah perusahaan : ");
        int numCompanies = sc.nextInt();
        System.out.println("Masukan jumlah bulan : ");
        int numMonths = sc.nextInt();

        double[][] profits = new double[numCompanies][numMonths];

        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            for (int j = 0; j < numMonths; j++) {
                System.out.println("Masukkan keuntungan untuk bulan ke-" + (j + 1) + " :");
                profits[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < numCompanies; i++) {
            Sum128 sm = new Sum128(numMonths);
            double totalBF = sm.totalBF(profits[i]);
            double totalDC = sm.totalDC(profits[i], 0, numMonths - 1);
            System.out.println("==============================================");
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + numMonths + " bulan adalah = " + totalBF);
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + numMonths + " bulan adalah = " + totalDC);
        }
    }
}
