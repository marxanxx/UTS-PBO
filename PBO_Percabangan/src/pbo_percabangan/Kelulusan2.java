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
public class Kelulusan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        //nama
        System.out.print("Masukan nama = ");
        String nama = scan.nextLine();
       
        // jenis kelamin
        System.out.print("Jenis kelamin = ");
        String jenis_kelamin = scan.nextLine();
        
        // tinggi badan
        System.out.print("tinggi badan = ");
        int tinggi_badan = scan.nextInt();
        
        if (jenis_kelamin.equals("laki-laki")&& tinggi_badan >= 171 && tinggi_badan <=230){
            System.out.println("Selamat anda lulus");
        }
        else if (jenis_kelamin.equals("perempuan")&& tinggi_badan >=161 && tinggi_badan <=210){
            System.out.println("Selamat anda lulus");
        }
        else{
            System.out.println("Anda gagal");
        }
    }
    
}
