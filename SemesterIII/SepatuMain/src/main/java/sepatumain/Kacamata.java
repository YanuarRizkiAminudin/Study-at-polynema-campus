/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepatumain;

/**
 *
 * @author Yanuar Rizki
 */
public class Kacamata {
    private String Bahan;
    private String Merek;
    private int UkuranMinus;
    private String Warna;
    
    public void Bahan(String newValue)
    {    
        Bahan = newValue;
    }
    public void Warna(String newValue)
    {
        Warna = newValue;
    }
    public void UkuranMinus(int increment)
    {
        UkuranMinus = UkuranMinus +  increment;
    }
    public void Merek(String newValue)
    {
        Merek = newValue;
    }
    public void Meperjelas()
    {
        System.out.println("Mengurangi Minus");
    }        
    public void cetakStatus()
    {
        System.out.println("bahan :" + Bahan);
        System.out.println("merek :" + Merek);
        System.out.println("ukuran :" + UkuranMinus);
        System.out.println("warna :" + Warna);
    }
}
