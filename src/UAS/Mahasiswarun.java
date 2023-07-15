/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UAS;

/**
 *
 * @author Administrator
 */
public class Mahasiswarun {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Alfisni", "C2083207024", "Pendidikan Teknologi Informasi", 3.75f);
        mahasiswa.tampilInformasi();
        
        mahasiswa.ubahNama("Alfiani Chantika");
        mahasiswa.tampilInformasi();
    }
}