import java.util.Scanner;

public class MainYanuar {
    public static void main(String[] args) {
        BankBXYYanuar bankYanuar = new BankBXYYanuar(6); 
        Scanner scannerYanuar = new Scanner(System.in);

        while(true){
            System.out.println("\nMenu");
            System.out.println("1. imput data nasabah Baru :");
            System.out.println("2. menampilkan data nasabah :");
            System.out.println("3. mencari data nasabah :");
            System.out.println("4. mengurutkan data nasabah");
            System.out.println("0. Exit");
            System.out.print("memilih menu : ");
            int pemilihanYanuar = scannerYanuar.nextInt();
            scannerYanuar.nextLine();

            switch (pemilihanYanuar) {
                case 1:
                    System.out.print("input norek:");
                    String norekYanuar = scannerYanuar.next();
                    System.out.print("input nama :");
                    String namaYanuar =  scannerYanuar.next();
                    System.out.print("input nik :");
                    String nikYanuar = scannerYanuar.next();
                    System.out.print("input umur :");
                    int umurYanuar = scannerYanuar.nextInt();
                    System.out.print("input saldo :");
                    double saldoYanuar =  scannerYanuar.nextDouble();
                    NasabahYanuar nasabahBaruYanuar = new NasabahYanuar(norekYanuar, namaYanuar, nikYanuar, umurYanuar, saldoYanuar);
                    bankYanuar.tambahNasabahYanuar(nasabahBaruYanuar);
                    break;
                case 2:
                    bankYanuar.tampilkanDataNasabahYanuar();
                    break;
                case 3:
                    System.out.println("temukan nasabah:");
                    String namaDicariYanuar =  scannerYanuar.next();
                    NasabahYanuar hasilNasabahYanuar = bankYanuar.cariNasabahYanuar(namaDicariYanuar);
                    if(hasilNasabahYanuar != null) {
                        System.out.println("nama nasabah : " + namaDicariYanuar + " ditemukan " );
                        System.out.println("Nomor Rekening : "  + hasilNasabahYanuar.norekYanuar + " NIk " + hasilNasabahYanuar.nikYanuar + " Umur " + hasilNasabahYanuar.umurYanuar + " saldo " + hasilNasabahYanuar.saldoYanuar);
                    }else {
                        System.out.println("nama nasaba " + namaDicariYanuar + " tidak ditemukan.");
                    }
                    break;
                case 4:
                    bankYanuar.urutkanDataNasabahYanuar();
                    break;
                case 0:
                    System.out.println("Terimakasih");
                    System.exit(0);
                default:
                    System.out.println("anda anda salah memesuakan menu : ");
                    break;
            }
        }

    }
}
