package pbo_variabeltipedata;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //buat variabel
        int a = 12;
        int b = 8;
        int c = 5;
        //hitung
        int hasil1 = a + b - c;
        int hasil2 = a * b / c;
        int hasil3 = a + b * c;
        int hasil4 = a + b / c;
        int hasil5 = (a + b) * c;
        int hasil6 = (a - b) * c;
        //print
        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println(hasil4);
        System.out.println(hasil5);
        System.out.println(hasil6);
    }
    
}
