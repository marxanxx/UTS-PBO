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
public class Operator_soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        int h1 = (n1+n2)*(n2+n1);
        int h2 = (n1%4)*n2;
        //perbandingan
        boolean b1 = h1 >= h2;
        boolean b2 = h2 >= h1;
        boolean b3 = (h1%4)==(++h2%5);
        boolean b4 = (b1 ^ b3) && (b2 || b1);
        boolean b5 = b2 || (b3 &&(b2^b1));
        //print
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);
        System.out.println("b4 = "+b4);
        System.out.println("b5 = "+b5);
    }
    
}
