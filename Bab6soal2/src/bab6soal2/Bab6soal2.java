/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab6soal2;

/**
 *
 * @author Sheva
 */
import java.util.Scanner;

public class Bab6soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Membuat objek Scanner untuk mengambil input dari user
        Scanner scanner = new Scanner(System.in);
        
        // Mengambil input NIM
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        
        // Mengambil input NAMA
        System.out.print("NAMA : ");
        String nama = scanner.nextLine();
        
        // Mengambil input NILAI
        System.out.print("NILAI : ");
        int nilai = scanner.nextInt();
        
        // Menentukan Grade dari nilai
        String grade;
        if (nilai >= 85 && nilai <= 100) {
            grade = "A";
            
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else if (nilai >= 0) {
            grade = "E";
        } else {
            grade = "Nilai tidak valid";
        }
        
        
        String Keterangan;
        if (nilai >= 85 && nilai <=100) {
            Keterangan = "LULUS";
            
        } else if (nilai >= 75) {
            Keterangan = "LULUS";
        } else if (nilai >= 60) {
            Keterangan = "MASIH BISA LULUS";
        } else if (nilai >= 50) {
            Keterangan = "SEMANGAT BUAT TINGKATIN LAGI";
        } else if (nilai >= 0) {
            Keterangan = "SULIT";
        } else {
            Keterangan = "COBA LAGI";
        }
        
        System.out.println("NIM   : " + nim);
        System.out.println("NAMA  : " + nama);
        System.out.println("NILAI : " + nilai);
        System.out.println("GRADE : " + grade);
        System.out.println("KETERANGAN  : " + Keterangan);
        
        // Menutup scanner
        scanner.close();
        
        
                
                
                }
    }
    

