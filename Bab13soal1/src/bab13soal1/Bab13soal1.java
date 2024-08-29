/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab13soal1;

/**
 *
 * @author Sheva
 */
public class Bab13soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculatorsederhana objek = new Calculatorsederhana();
        
        // Menampilkan hasil operasi
        System.out.println("Hasil Pertambahan : " + objek.tambah(10, 20));
        System.out.println("Hasil Pertambahan (3angka) : " + objek.tambah(10, 20, 30));
        System.out.println("Hasil Pengurangan : " + objek.pengurangan(10, 20));
        System.out.println("Hasil Perkalian : " + objek.perkalian(10, 20));
        System.out.println("Hasil Pembagian : " + objek.pembagian(10, 20));
    }
    
}
