/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal2;

/**
 *
 * @author Sheva
 */
import java.util.Scanner;
public class Bab9soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        
        System.out.print("Masukan bilangan awal : ");
        int nilaiAwal = myInput.nextInt();
        
        System.out.print("Masukan bilangan akhir : ");
        int nilaiAkhir = myInput.nextInt();
        
        System.out.println("Hasil deret bilangan : ");
        
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.print(i);
            if (i + 5 <= nilaiAkhir) {
                System.out.print(", ");
            }
        }
    }
    
}
