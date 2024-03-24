package Tugas6;

public class Hotel28 {
    String nama;
    String kota;
    int harga ;
    Byte bintang;

    Hotel28(String n, String k, int h, Byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil (){
        System.out.println("Nama = "+nama);
        System.out.println("Kota = "+kota);
        System.out.println("harga ="+harga);
        System.out.println("Bintang ="+bintang);
    }
}
