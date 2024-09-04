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
        
        System.out.println("");
        
        SptRomawi.Bahan("kulit binatang");
        SptRomawi.Warna("coklat");
        SptRomawi.Ukuran(30);
        SptRomawi.cetakStatus();
        
        System.out.println("");
       
        SptModeren.Bahan("kain");
        SptModeren.TambahMerek("Adidas");
        SptModeren.Ukuran(34);
        SptModeren.Warna("biru");
        SptModeren.cetakStatus();
        
        System.out.println("");
        
        SptRoda.Bahan("Upper");
        SptRoda.Warna("putih");
        SptRoda.Ukuran(34);
        SptRoda.TambahMerek("Rollerblade");
        SptRoda.setRoda("Roda");
        SptRoda.cetakStatus();
        
    }
}
