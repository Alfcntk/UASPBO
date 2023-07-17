/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UASPBO;

/**
 *
 * @author Administrator
 */
public class PersegiPanjang {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float hitungLuas() {
        return panjang * lebar;
    }

    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    public static void main(String[] args) {
        UAS.PersegiPanjang persegiPanjang = new UAS.PersegiPanjang(5f, 4f);
        
        float luas = persegiPanjang.hitungLuas();
        float keliling = persegiPanjang.hitungKeliling();
        
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
    }