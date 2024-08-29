/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab7soal2;

/**
 *
 * @author Sheva
 */
import java.util.Scanner;

public class Bab7soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nim
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("NAMA: ");
        String nama = scanner.nextLine();
        System.out.print("TAHUN: ");
        int tahun = scanner.nextInt();
        
        // clear the buffer
        scanner.nextLine();
        
        // Input Pilihan Peminatan
        System.out.print("PILIH PEMINATAN (M untuk Matematika, F untuk Fisika): ");
        char peminatan = scanner.nextLine().charAt(0);
        
        // Nested Switch
        switch (tahun) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("\nInformasi Mahasiswa:");
                System.out.println("NIM: " + nim);
                System.out.println("NAMA: " + nama);
                System.out.println("TAHUN: " + tahun);
                
                switch (peminatan) {
                    case 'M':
                        System.out.println("Peminatan: M");
                        // Tambahkan informasi tambahan berdasarkan peminatan 'M'
                        System.out.println("Materi yang akan dipelajari:");
                        System.out.println("1. PEMROGRAMAN MOBILE");
                        System.out.println("2. PEMROGRAMAN JAVA");
                        break;
                    case 'F':
                        System.out.println("Peminatan: F");
                        // Tambahkan informasi tambahan berdasarkan peminatan 'F'
                        System.out.println("Materi yang akan dipelajari:");
                        System.out.println("1. MEKANIKA KLASIK");
                        System.out.println("2. ELEKTROMAGNETIKA");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                        break;
                }
                break;
            default:
                System.out.println("Tahun tidak valid. Harap masukkan tahun antara 1 dan 4.");
                break;
          
        }
        
        // Menutup scanner
        scanner.close();
       
                    
    }
    
}
