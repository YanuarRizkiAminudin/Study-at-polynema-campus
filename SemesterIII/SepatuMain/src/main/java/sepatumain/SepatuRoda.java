/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepatumain;

/**
 *
 * @author Yanuar Rizki
 */
public class SepatuRoda extends SepatuModeren {
    
    private String Roda;
    
    public void setRoda(String newValue)
    {
        Roda = newValue;
    }
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("tipeSuspensi :" + Roda);
    }
    public void putar()
    {
        System.out.println("Bergelinding");
    }
    
}