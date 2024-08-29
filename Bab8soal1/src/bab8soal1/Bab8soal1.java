/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8soal1;

/**
 *
 * @author Sheva
 */
import java.util.Scanner;
public class Bab8soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        
        System.out.print( "Nilai Awal ?: ");
        int nilaiAwal = myInput.nextInt();
        
        System.out.print( "Nilai Awal ?: ");
        int nilaiAkhir = myInput.nextInt();
                
        System.out.println("Hasilnya :");
        int j = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(j + ". " + i);
            j++;
        }
    
    }
    
}
