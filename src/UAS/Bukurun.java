/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UAS;

/**
 *
 * @author Administrator
 */
public class Bukurun {
    public static void main(String[] args) {
        Buku buku = new Buku("Tenggelamnya Kapal Van Der Wijck", "Abdul Malik Karim Amrullah", 1938, 224);
        buku.tampilInformasi();
        
        buku.tambahHalaman(55);
        buku.tampilInformasi();
    }
    }