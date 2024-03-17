package AlgoritmaBruteForcedanDivide;

import java.util.Scanner;

public class MainPangkat228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Masukan jumlah elemen yang dihitung :");
        int elemen = sc.nextInt();

        Pangkat228[] png = new Pangkat228[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukan nilai yang hendak dihitung untuk elemen ke-" + (i+1) + ":");
            int iNilai = sc.nextInt();
            System.out.println("Masukkan nilai pangkat untuk elemen ke-" + (i+1) + ":");
            int iPangkat = sc.nextInt();
            png[i] = new Pangkat228(iNilai, iPangkat);
        }

        System.out.println("Pilih metode perhitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " 
                    + png[i].nilai + " pangkat " 
                    + png[i].pangkat + " adalah " 
                    + png[i].pangkatBF());
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " 
                    + png[i].nilai + " pangkat " 
                    + png[i].pangkat + " adalah " 
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
