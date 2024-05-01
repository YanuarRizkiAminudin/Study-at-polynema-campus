package Tugas;
import java.util.Scanner;
public class QueueMain28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Kapasitas Queue: ");
        int jumlah = sc.nextInt();
        Queue28 antri = new Queue28(jumlah);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    int noHP = sc.nextInt();
                    Pembeli28 pembeliBaru = new Pembeli28(nama, noHP);
                    antri.enqueue(pembeliBaru);
                    break;
                case 2:
                    Pembeli28 pembeliKeluar = antri.dequeue();
                    if (pembeliKeluar != null) {
                        System.out.println("Antrian yang keluar: " 
                        + pembeliKeluar.nama + ", No HP: " + pembeliKeluar.noHP);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    System.out.print("Nama Pembeli: ");
                    String namaCari = sc.nextLine();
                    antri.peekPosition(namaCari);
                    break;
                case 6:
                    antri.daftarPembeli();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3|| pilih == 4 || pilih == 5 || pilih == 6);
    }
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antri pembeli baru");
        System.out.println("2. Panggil pembeli");
        System.out.println("3. Cek pembeli paling depan");
        System.out.println("4. Cek pembeli paling belakang");
        System.out.println("5. Cek posisi pembeli");
        System.out.println("6. Daftar seluruh pembeli");
        System.out.println("--------------------------");
    }
}