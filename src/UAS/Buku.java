/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

/**
 *
 * @author Administrator
 */
public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int tahunTerbit, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    public void tambahHalaman(int nilaiTambahan) {
        jumlahHalaman += nilaiTambahan;
    }

    public void tampilInformasi() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }
}