package pbo_inputdarikeyboard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bab2_Lthn1_penjumlahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        BufferedReader as = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.print("Masukan Bilangan Pertama : ");
            angka1 = Integer.parseInt(as.readLine());
            System.out.print("Masukan Bilangan Kedua : ");
            angka2 = Integer.parseInt(as.readLine());
            hasil = angka1 + angka2;
            
            System.out.println("Maka Hasil Penjumlahan "+angka1+" dan "+angka2+" = "+hasil);
        }catch(IOException ex){
            System.out.println("Error pada saat input data");
           
        }
    }
    
}
