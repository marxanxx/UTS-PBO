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
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int belanja = 0;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Total Belanjaan : Rp ");
        belanja = scan.nextInt();
        if (belanja > 100000){
            System.out.println("Selamat anda mendapatkan diskon!");
        }
        System.out.println("Terima kasih...");
    }
    
}
