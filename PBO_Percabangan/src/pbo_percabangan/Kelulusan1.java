/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_percabangan;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Kelulusan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Buat Scanner
        Scanner inp = new Scanner(System.in); 
        
        // Ambil Nama
        System.out.print("Masukkan nama anda = "); 
        String Nama = inp.next();
        // Ambil NIM
        System.out.print("Masukkan NIM = ");
        String nim = inp.next(); 
        
        // Ambil Nilai 
        System.out.print("Masukkan Nilai = "); 
        int nilai = inp.nextInt();
        if(nilai > 55) { 
            System.out.println("Selamat anda lulus "); } 
        else { 
            System.out.println("Anda tidak lulus "); 
        }
        
        
    }
    
}
