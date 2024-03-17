package BruteForceDivideConquer;
import java.util.Scanner;

class MainFaktorial28{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("------------------");
        System.out.println("Masukan jumlah elemen");
        int iJml = sc.nextInt();

        Faktorial128[] fk = new Faktorial128[10];
        for(int i=0; i < iJml; i++){
            fk[i] = new Faktorial128();
            System.out.println("masukan nilai data ke-" +(i+1)+":");
            int iNilai = sc.nextInt(); 
            fk[i].nilai =  iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for(int i=0; i < iJml; i++){
            System.out.println
            ("Hasil penghitungan faktorial menggunakan Brute Force adalah "
            + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i=0; i < iJml; i++){
            System.out.println("Hasil penghitungan faktorial mengguankan Divide and Conquer adalah "
            + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}