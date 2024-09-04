/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepatumain;

/**
 *
 * @author Yanuar Rizki
 */
public class Tas {
    private String Bahan;
    private int Ukuran;
    private String Warna;
    private String Merek;
    
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
    public void Merek(String newValue)
    {
        Merek = newValue;
    }
    public void Simpan()
    {
        System.out.println("Menyimpan Barang");
    }
    public void cetakStatus()
    {
        System.out.println("bahan :" + Bahan);
        System.out.println("ukuran :" + Ukuran);
        System.out.println("warna :" + Warna);
    }
}
