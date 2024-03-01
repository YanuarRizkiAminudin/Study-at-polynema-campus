import java.util.Scanner;

public class mahasiswaPolinema { 
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        mahasiswa[] ms = new mahasiswa[3];

        for (int i = 0; i < 3; i++){
        System.out.println("Masukkan data mahasiswa ke -" + (i + 1));
        System.out.print("Masukkan nama :");
        String nm=input.next();
        System.out.print("Masukkan nim :");
        long n=input.nextLong();
        System.out.print("Masukkan jenis Kelamin :");
        char kl=input.next().charAt(0);
        System.out.print("Masukkan IPK :");
        double ip=input.nextDouble();
        ms[i] =  new mahasiswa(nm, n, kl, ip);
        }

        System.out.println("");
        for (int i = 0; i < 3; i++){
            System.out.println("Data mahasiswa ke-"+ (i + 1));
            System.out.println("Nama: " + ms[i].nama);
            System.out.println("NIM :" + ms[i].nim);
            System.out.println("Jenis kelamin " + ms[i].kelamin);
            System.out.println("Nilai IPK :" + ms[i].ipk);
        }
        System.out.println("");
        mahasiswa.printRataIPK(ms);
        mahasiswa.printIPKTerbesar(ms);
    }
}
