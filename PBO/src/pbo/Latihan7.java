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
public class Latihan7 {
    public static void main(String[] args){
        float desimal;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan angka desimal : ");
        desimal = inputan.nextFloat();
        System.out.println("Angka yang diinputkan adalah "+desimal);
    }
}
