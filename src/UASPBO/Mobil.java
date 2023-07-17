/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UASPBO;

/**
 *
 * @author Administrator
 */
public class Mobil {
    private String merek;
    private int tahunProduksi;
    private String warna;
    private int kecepatan;

    public Mobil(String merek, int tahunProduksi, String warna, int kecepatan) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void percepat(int nilaiKecepatan) {
        kecepatan += nilaiKecepatan;
    }

    public void tampilInformasi() {
        System.out.println("Informasi Mobil:");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan);
    }
    public static void main(String[] args) {
        UAS.Mobil mobil = new UAS.Mobil("Toyota", 2021, "Merah", 100);
        mobil.tampilInformasi();
        
        mobil.percepat(20);
        mobil.tampilInformasi();
    }
    
}