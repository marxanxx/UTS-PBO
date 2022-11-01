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
public class Operator_soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variabel
        int n1 = 10;
        int n2 = 15;
        //hitung h1 = soal bagian a h2 = soal bagian b
        int h1 = (n1+n2)*(n2+n1);
        int h2 = (n1%4)*n2;
        //hasil
        System.out.println("h1 = "+h1);
        System.out.println("h2 = "+h2);
    }
    
}
