/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_inputdarikeyboard;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Bab1_Lthn2_Biodata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bio = new Scanner(System.in);
        String nama,jenis_kelamin,alamat;
        int nim;
        System.out.println("Masukan Data Anda");
        System.out.print("Nama : ");
        nama=bio.next();
        System.out.print("NIM : ");
        nim=bio.nextInt();
        System.out.print("Jenis Kelamin : ");
        jenis_kelamin=bio.next();
        System.out.print("Alamat : ");
        alamat=bio.next();
        
        System.out.println("=====DATA DIRI=====");
        System.out.println("Nama            : "+nama);
        System.out.println("NIM             : "+nim);
        System.out.println("Jenis Kelamin   : "+jenis_kelamin);
        System.out.println("Alamat          : "+alamat);
    }
    
}
