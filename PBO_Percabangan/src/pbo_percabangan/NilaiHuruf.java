/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_percabangan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NilaiHuruf {

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
        if(nilai >=85 && nilai <= 100) { 
            System.out.println("A");
        } else if(nilai >= 75 && nilai <= 85) { 
            System.out.println("B");
        }  else if(nilai >=65 && nilai <= 75) { 
            System.out.println("C");
        }else if(nilai >= 55 && nilai <= 65) { 
            System.out.println("D");
        }else if(nilai>=0 && nilai <= 55) { 
            System.out.println("E");
        
        } else {
            System.out.println("Error"); 
        }
        }
    }
    

