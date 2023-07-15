/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UAS;

/**
 *
 * @author Administrator
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2021, "Merah", 100);
        mobil.tampilInformasi();
        
        mobil.percepat(20);
        mobil.tampilInformasi();
    }
}   