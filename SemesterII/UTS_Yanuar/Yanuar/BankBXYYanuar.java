public class BankBXYYanuar {
    NasabahYanuar[] nasabahArrayYanuar;
    int sizeYanuar;
    int topYanuar;
    
    public BankBXYYanuar(int jumlahNasabahYanuar) {
        sizeYanuar = jumlahNasabahYanuar;
        nasabahArrayYanuar = new NasabahYanuar[sizeYanuar];
        topYanuar = -1;
    }
        
    public boolean cekKosongYanuar() {
        if (topYanuar == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean cekPenuhYanuar() {
        if (topYanuar == sizeYanuar - 1){
            return true;
        } else {
            return false;
        }
    }
    
    public void tambahNasabahYanuar(NasabahYanuar NshYanuar) {
        if (!cekPenuhYanuar()) {
            topYanuar++;
            nasabahArrayYanuar[topYanuar] = NshYanuar;
            System.out.println("Nasabah " + NshYanuar.namaYanuar + " berhasil menambahkan ke rekening");
        } else {
            System.out.println("maaf data sudah penuh");
        }
    }
    
    public void tampilkanDataNasabahYanuar() {
        if (!cekKosongYanuar()) {
            System.out.println("Menampilkan Data Nasabah: ");
            for (int i = topYanuar; i >= 0; i--) {
                System.out.printf("menampilkan data %s : dengan nama %s nik %s umur : %s  Saldo : %.2f\n",
                nasabahArrayYanuar[i].norekYanuar, nasabahArrayYanuar[i].namaYanuar, nasabahArrayYanuar[i].nikYanuar, nasabahArrayYanuar[i].umurYanuar, nasabahArrayYanuar[i].saldoYanuar);
            }
        } else {
            System.out.println("NasabahKosong.");
        }
    }

    public NasabahYanuar cariNasabahYanuar(String keywordYanuar) {
        int lowYanuar = topYanuar;
        int highYanuar = topYanuar;
    
        while (lowYanuar <= highYanuar) {
            int midYanuar = lowYanuar + (highYanuar - lowYanuar) / 2;
            int resultYanuar = nasabahArrayYanuar[midYanuar].namaYanuar.compareToIgnoreCase(keywordYanuar);
    
            if (resultYanuar == 0) {
                return nasabahArrayYanuar[midYanuar];
            }
    
            if (resultYanuar < 0) {
                lowYanuar = midYanuar + 1;
            } else {
                highYanuar = midYanuar - 1;
            }
        }
    
        System.out.println("Nasabah dengan nama '" + keywordYanuar + "' tidak ditemukan.");
        return null;
    }
           
    public void urutkanDataNasabahYanuar() {
        for (int i = 0; i < topYanuar; i++) {
            int minIndexYanuar = i;
            for (int j = i + 1; j <= topYanuar; j++) {
                if (nasabahArrayYanuar[j].umurYanuar < nasabahArrayYanuar[minIndexYanuar].umurYanuar) {
                    minIndexYanuar = j;
                }
            }

            NasabahYanuar tempYanuar = nasabahArrayYanuar[minIndexYanuar];
            nasabahArrayYanuar[minIndexYanuar] = nasabahArrayYanuar[i];
            nasabahArrayYanuar[i] = tempYanuar;
        }

        System.out.println("\nData Nasabah setelah diurutkan berdasarkan umur:");
        tampilkanDataNasabahYanuar();
    }
}
