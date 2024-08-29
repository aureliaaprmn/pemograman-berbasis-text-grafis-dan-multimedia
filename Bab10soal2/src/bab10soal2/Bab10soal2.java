/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab10soal2;

/**
 *
 * @author Sheva
 */
public class Bab10soal2 extends aritmatika1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        aritmatika1 aritmatikaku = new aritmatika1();
        int bilangan1 = 10, bilangan2 = 25;
        
        System.out.println("Bilangan 1= " + bilangan1);
        System.out.println("Bilangan 2 = " + bilangan2);
        
        aritmatikaku.setPengurangan(bilangan1, bilangan2);
        System.out.println("Hasil Pengurangan " + aritmatikaku.getAngka());
        
        aritmatikaku.setPerkalian(bilangan1, bilangan2);
        System.out.println("Hasil Perkalian " + aritmatikaku.getAngka());
        
        aritmatikaku.setPembagian(bilangan1, bilangan2);
        System.out.println("Hasil Pembagian " + aritmatikaku.getAngka());
        
        aritmatikaku.setPangkat(bilangan1, bilangan2);
        System.out.println("Hasil Pangkat " + aritmatikaku.getAngka());
        
    }
    
}
