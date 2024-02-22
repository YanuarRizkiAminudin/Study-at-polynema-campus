import java.util.Scanner;

public class royalGarden_29 {
    public static void main(String[] args) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        int[][] penjualanBunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };

        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[] pendapatanMawar = {30000, 40000, 20000, 10000};
        int[] dijualMawar = {3, 4, 2, 1};
        String[] keteranganMawar = {"Mati 2", "Mati 3", "Mati 0", "Mati 1"};
        int[] jumlahStockMawar = {2, 5, 3, 7};

        Scanner input = new Scanner(System.in);

        // untuk memilih jenis bunga
        System.out.println("Pilih jenis bunga yang ingin dilihat datanya:");
        System.out.println("1. Aglonema");
        System.out.println("2. Keladi");
        System.out.println("3. Alocasia");
        System.out.println("4. Mawar");
        System.out.print("Masukkan pilihan (1-4): ");

        int pilihan = input.nextInt();
        
        System.out.println("+-------------------+-------------------------+--------------+--------------+--------------------+");
        System.out.println("|      Cabang       | Pendapatan Mawar        | Dijual       | Keterangan   | Jumlah Stock       |");
        System.out.println("+-------------------+-------------------------+--------------+--------------+--------------------+");

        // untuk menapilkan data dari setiap cabang
        for (int i = 0; i < cabang.length; i++) {
            int pendapatanCabang = penjualanBunga[i][pilihan - 1] * getPriceByIndex(pilihan - 1);
            int stockCabang = penjualanBunga[i][pilihan - 1];

            System.out.printf("| %-17s | %-23d | %-12d | %-12s | %-18d |\n", cabang[i], pendapatanCabang, stockCabang,
                    keteranganMawar[i], jumlahStockMawar[i]);
        }

        // untuk menampilkan total perusahaan
        int totalPendapatan = getTotalPendapatan(penjualanBunga, pilihan);
        int totalStock = getTotalStock(penjualanBunga, pilihan);

        System.out.println("+-------------------+-------------------------+--------------+--------------+--------------------+");
        System.out.printf("|   Total Perusahaan| %-23d | %-12d |              | %-18d |\n", totalPendapatan, dijualMawar[pilihan - 1],
                totalStock);
        System.out.println("+-------------------+-------------------------+--------------+--------------+--------------------+");

        input.close();
    }

    // untuk mendapatkan harga bunga berdasarkan indeks
    public static int getPriceByIndex(int index) {
        switch (index) {
            case 0:
                return 75000; 
            case 1:
                return 50000; 
            case 2:
                return 60000; 
            case 3:
                return 10000; 
            default:
                return 0;
        }
    }

    // untuk mendapatkan total pendapatan berdasarkan jenis bunga
    public static int getTotalPendapatan(int[][] penjualanBunga, int jenisBunga) {
        int totalPendapatan = 0;
        for (int i = 0; i < penjualanBunga.length; i++) {
            totalPendapatan += penjualanBunga[i][jenisBunga - 1] * getPriceByIndex(jenisBunga - 1);
        }
        return totalPendapatan;
    }

    // untuk mendapatkan total stock berdasarkan jenis bunga
    public static int getTotalStock(int[][] penjualanBunga, int jenisBunga) {
        int totalStock = 0;
        for (int i = 0; i < penjualanBunga.length; i++) {
            totalStock += penjualanBunga[i][jenisBunga - 1];
        }
        return totalStock;
    }
}
