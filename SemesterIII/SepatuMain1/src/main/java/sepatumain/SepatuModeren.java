/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepatumain;

/**
 *
 * @author Yanuar Rizki
 */
public class SepatuModeren extends SepatuRomawi{
    private String Bahan;
    private String Merek;
    private int Ukuran;
    private String Warna;
    
    public void Bahan(String newValue)
    {    
        Bahan = newValue;
    }
    public void Warna(String newValue)
    {
        Warna = newValue;
    }
    public void Ukuran(int increment)
    {
        Ukuran = Ukuran +  increment;
    }
    public void TambahMerek(String increment)
    {
        Merek = Merek + increment;
    }
    public void cetakStatus()
    {
        System.out.println("bahan" + Bahan);
        System.out.println("merek" + Merek);
        System.out.println("ukuran"+ Ukuran);
        System.out.println("warna" + Warna);
    }
}