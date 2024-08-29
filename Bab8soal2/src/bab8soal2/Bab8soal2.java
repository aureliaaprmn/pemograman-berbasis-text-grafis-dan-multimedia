/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8soal2;

/**
 *
 * @author Sheva
 */
import java.util.Scanner;
public class Bab8soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = myInput.nextInt();
        
        System.out.print("Tahun Awal ?: ");
        int tahunAwal = myInput.nextInt();
        
        System.out.println("Hasil nya :");
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
        }
    }
    
}
