package AlgoritmaBruteForcedanDivide;
import java.util.Scanner;
public class MainPangkat128 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("===============================");
    System.out.println("Masukan jumlah elemen yang dihitung :");
    int elemen = sc.nextInt();

    Pangkat128[] png = new Pangkat128[elemen];
    for(int i=0; i< elemen; i++){
        System.out.println("Masukan nilai yang hendak di");
        int iNilai = sc.nextInt();

        System.out.println("Masukkan nilai pemenang:");
        int iPangkat = sc.nextInt();
        png[i] = new Pangkat128(iNilai, iPangkat);
    }
    System.out.println("HASIL PANGKAT - BRUTE FORCE");
    for(int i=0; i < elemen; i++){
    System.out.println("Hasil dari "
    + png[i].nilai+ " pangkat "
    + png[i].pangkat+ " adalah "
    + png[i].pangkatBF());
    }
    System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
    for(int  i=0; i< elemen; i++){
        System.out.println
        ("Hasil dari"
        + png[i].nilai + " pangkat "
        + png[i].pangkat + " adalah "
        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));

    }
}
}
