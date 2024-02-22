import java.util.Scanner;

public class NilaiSemester_29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mataKuliah = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        int[] bobotSks = {3, 4, 3, 3, 3, 3, 3, 3};

        double[] nilaiAngka = new double[mataKuliah.length];
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
        }

        // Konversi 
        konversiKualifikasi(nilaiAngka, mataKuliah, bobotSks);

        double ip = hitungIP(nilaiAngka, bobotSks);
        System.out.println("\nIP Semester: " + ip);
    }

    private static void konversiKualifikasi(double[] nilaiAngka, String[] mataKuliah, int[] bobotSks) {
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("=============================================================================");
        System.out.printf(" %-37s  %-15s  %-15s  %-15s \n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Kualifikasi");
        System.out.println("=============================================================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilaiHuruf(nilaiAngka[i]);
            String kualifikasi = konversiKualifikasi(nilaiAngka[i]);
            double bobotNilai = nilaiAngka[i] * bobotSks[i];
            System.out.printf(" %-37s  %-15.2f  %-15s  %-15s \n", mataKuliah[i], nilaiAngka[i], nilaiHuruf, kualifikasi);
        }

        System.out.println("=============================================================================");
    }

    private static String konversiNilaiHuruf(double nilaiAngka) {
        // Implementasi konversi 
        if (nilaiAngka >= 85.00) {
            return "A";
        } else if (nilaiAngka >= 75.00) {
            return "B";
        } else if (nilaiAngka >= 65.00) {
            return "C";
        } else if (nilaiAngka >= 55.00) {
            return "D";
        } else {
            return "E";
        }
    }

    private static String konversiKualifikasi(double nilaiAngka) {
        // Implementasi konversi 
        if (nilaiAngka >= 80.00) {
            return "Sangat Baik";
        } else if (nilaiAngka >= 73.00) {
            return "Lebih dari Baik";
        } else if (nilaiAngka >= 65.00) {
            return "Baik";
        } else if (nilaiAngka >= 60.00) {
            return "Lebih dari Cukup";
        } else if (nilaiAngka >= 50.00) {
            return "Cukup";
        } else if (nilaiAngka >= 39.00) {
            return "Kurang";
        } else {
            return "Gagal";
        }
    }

    private static double hitungIP(double[] nilaiAngka, int[] bobotSks) {
        double totalBobot = 0;
        int totalSks = 0;

        for (int i = 0; i < nilaiAngka.length; i++) {
            totalBobot += nilaiAngka[i] * bobotSks[i];
            totalSks += bobotSks[i];
        }

        return totalBobot / totalSks / 25;
    }
}
