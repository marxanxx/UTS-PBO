/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang,luas,keliling;
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling Persegi");
        System.out.print("Pilihan : ");
        int inputan = input.nextInt();
        switch (inputan){
            case 1:
                System.out.print("Masukkan panjang sisi persegi : ");
                panjang=input.nextInt();
                System.out.println("Luas Persegi adalah : "+panjang*panjang);
                break;
           case 2:
                System.out.print("Masukkan panjang sisi persegi : ");
                panjang=input.nextInt();
                System.out.println("Keliling Persegi adalah : "+4*panjang);
                break;
           default:
               System.out.println("Sistem Error");
        }
            
        
    }
    
}
