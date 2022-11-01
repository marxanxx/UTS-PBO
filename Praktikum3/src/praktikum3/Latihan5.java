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
public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = (int)(Math.random()*10), b = (int)(Math.random()*10),hasil=a+b;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Berapakah hasil dari "+a+ " dan "+b+" ? ");
        int jawaban = scan.nextInt();
        if (jawaban == hasil){
            System.out.println("Selamat, Jawaban anda benar");
        }else{
            System.out.println("Maaf, Jawaban yang benar adalah "+hasil);
        }
    }
    
}
