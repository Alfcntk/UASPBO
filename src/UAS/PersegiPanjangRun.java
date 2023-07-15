/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UAS;

/**
 *
 * @author Administrator
 */
public class PersegiPanjangRun {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(5f, 4f);
        
        float luas = persegiPanjang.hitungLuas();
        float keliling = persegiPanjang.hitungKeliling();
        
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}