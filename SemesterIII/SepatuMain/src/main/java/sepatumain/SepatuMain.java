/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sepatumain;

/**
 *
 * @author Yanuar Rizki
 */
public class SepatuMain {
    
    public static void main(String[] args) {
        
        SepatuRomawi SptRomawi = new SepatuRomawi();
        SepatuModeren SptModeren =  new SepatuModeren();
        SepatuRoda SptRoda = new SepatuRoda();
        Kacamata KcMata = new Kacamata();
        Tas Tas = new Tas();
        
        System.out.println("");
        
        SptRomawi.Bahan("kulit binatang");
        SptRomawi.Warna("coklat");
        SptRomawi.Ukuran(30);
        SptRomawi.AlasKaki();
        SptRomawi.cetakStatus();
        
        System.out.println("");
       
        SptModeren.Bahan("kain");
        SptModeren.Merek("Adidas");
        SptModeren.Ukuran(34);
        SptModeren.Warna("biru");
        SptModeren.AlasKaki();
        SptModeren.cetakStatus();
        
        System.out.println("");
        
        SptRoda.Bahan( "Upper");
        SptRoda.Warna("putih");
        SptRoda.Ukuran(37);
        SptRoda.Merek("Rollerblade");
        SptRoda.setRoda("Roda");
        SptRoda.putar();
        SptRoda.cetakStatus();
        
        System.out.println("");
       
        KcMata.Bahan("Plastik");
        KcMata.Merek("Ray-Ban");
        KcMata.UkuranMinus(3);
        KcMata.Warna("Hitam");
        KcMata.Meperjelas();
        KcMata.cetakStatus();
        
        System.out.println("");
       
        Tas.Bahan("kain");
        Tas.Merek("Asus");
        Tas.Ukuran(35);
        Tas.Warna("hitam");
        Tas.Simpan();
        Tas.cetakStatus();   
    }
}