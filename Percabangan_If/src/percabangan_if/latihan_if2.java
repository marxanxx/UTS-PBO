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
public class latihan_if2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai1, nilai2,nilai3;
        System.out.print("Masukan nilai1 = ");
        nilai1=input.nextInt();
        
        System.out.print("Masukan nilai2 = ");
        nilai2=input.nextInt();
        
        System.out.print("Masukan nilai3 = ");
        nilai3=input.nextInt();
        
        System.out.println("Kesimpulan : ");
        
        if (nilai1>nilai2 && nilai1>nilai3){
            System.out.println("nilai 1 yang terbesar");
        }else if (nilai2>nilai1 && nilai2>nilai3){
            System.out.println("nilai 2 yang terbesar");
        }else if (nilai3>nilai1 && nilai3>nilai2){
            System.out.println("nilai 3 yang terbesar");
        }else{
            System.out.println("semua nilai sama besarnya");
        }
    }
    
}
