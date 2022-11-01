/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan_if;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class latihan_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai1, nilai2;
        System.out.print("Masukan nilai1 = ");
        nilai1=input.nextInt();
        System.out.print("Masukan nilai2 = ");
        nilai2=input.nextInt();
        System.out.println("Kesimpulan : ");
        if (nilai1>nilai2){
            System.out.println("maka "+nilai1+" lebih besar dari "+nilai2);//nilai 2 yang terbesar
        }else{
            System.out.println("maka "+nilai2+" lebih besar dari "+nilai1);//nilai 1 yang terbesar
        }
    }
    
}
