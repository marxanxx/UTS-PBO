/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Latihan8 {
    public static void main(String[] args) {
        String nama1, nama2;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Nama Lengkap Anda : ");
        nama1 = inputan.nextLine();
        System.out.println("Halo... "+nama1+", ini adalah penggunaan nextLine()");
        System.out.print("Masukkan Nama Lengkap Anda : ");
        nama2 = inputan.next();
        System.out.println("Halo... "+nama2+", Ini adalah penggunaan next()");
    }   
}
