import java.util.Scanner;

public class NilaiAkhirMahasiswa_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         
        System.out.println("=======================");
        //inisialisasi
        double tugas, kuis, uts, uas;

        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();
        System.out.println("=======================");
        System.out.println("=======================");
        
        //konversi 
        String hasil = hitungNilaiAkhir(tugas, kuis, uts, uas);
        
        System.out.println(hasil);                
    }

    // Deklarasi 
    public static String hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {
        

        if (!isValidNilai(tugas) || !isValidNilai(kuis) || !isValidNilai(uts) || !isValidNilai(uas)) {
            return "Nilai tidak valid\n" +"=======================\n" +"=======================";               
        }
       
        // Inisialisasi 
        double nilaiAngka = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;

        StringBuilder hasil = new StringBuilder();
        hasil .append(nilaiAngka).append("\n");
        
        // Inisialisasi dan pemilihan menggunakan if else 
        String nilaiHuruf;
        String kualifikasi;
        if (nilaiAngka >= 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAngka >= 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAngka >= 65) {
            nilaiHuruf = "B";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAngka >= 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAngka >= 50) {
            nilaiHuruf = "C";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAngka >= 39) {
            nilaiHuruf = "D+";
            kualifikasi = "Sangat Baik";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Sangat Baik";
        }

        hasil.append(nilaiHuruf).append("\n");
        hasil.append("=======================\n");
        hasil.append("=======================\n");
        hasil.append(kualifikasi);
        return hasil.toString();      
    }
    
    // Deklarasi 
    public static boolean isValidNilai(double nilai) {
        return nilai >= 0 && nilai <= 100; 
    }
}
