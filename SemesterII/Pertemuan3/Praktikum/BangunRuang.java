import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kerucut[] kerucut = new Kerucut[1];
        LimasSegiEmpatSamaSisi[] limasSegiEmpat = new LimasSegiEmpatSamaSisi[2];
        Bola [] bola = new Bola[3];

        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJariKerucut = input.nextDouble();
        System.out.print("Masukkan sisi miring kerucut: ");
        double sisiMiringKerucut = input.nextDouble();

        kerucut[0] = new Kerucut(jariJariKerucut, sisiMiringKerucut);

        System.out.print("Masukkan panjang sisi alas limas segi empat sama sisi: ");
        double panjangSisiAlasLimas = input.nextDouble();
        System.out.print("Masukkan tinggi limas segi empat sama sisi: ");
        double tinggiLimas = input.nextDouble();

        limasSegiEmpat[1] = new LimasSegiEmpatSamaSisi(panjangSisiAlasLimas, tinggiLimas);

        System.out.print("Masukkan jari-jari bola: ");
        double jariJariBola = input.nextDouble();
        System.out.println(); 

        bola[2] = new  Bola(jariJariBola);

        kerucut[0] = new Kerucut(jariJariKerucut, sisiMiringKerucut);
        System.out.println("Kerucut : "); 
        System.out.println("Luas Permukaan: " + kerucut[0].hitungLuasPermukaan());
        System.out.println("Volume: " + kerucut[0].hitungVolume());
        System.out.println(); 

        limasSegiEmpat[1] = new LimasSegiEmpatSamaSisi(panjangSisiAlasLimas, tinggiLimas);
        System.out.println("LimasSegiEmpat : "); 
        System.out.println("Luas Permuakan: " + limasSegiEmpat[1].hitungLuasPermukaan());
        System.out.println("Volume: " + limasSegiEmpat[1].hitungVolume());
        System.out.println(); 

        bola[2] = new Bola(jariJariBola);
        System.out.println("bola"); 
        System.out.println("Luas Permukaan: " + bola[2].hitungLuasPermukaan());
        System.out.println("Volume " + bola[2].hitungVolume());
        System.out.println(); 
         }
    }
