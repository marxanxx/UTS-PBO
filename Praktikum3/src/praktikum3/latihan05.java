package praktikum3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class latihan05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan rata-rata angka : ");
        int angka =input.nextInt();
        if (angka >= 0 && angka <=44){
            System.out.println("E");
        }else if(angka >=45 && angka <= 54){
            System.out.println("D");
        }else if(angka >=55 && angka <= 64){
            System.out.println("C");
        }else if(angka >=65 && angka <= 79){
            System.out.println("B");
        }else if(angka >=80 && angka <= 100){
            System.out.println("A");
        }else{
            System.out.println("Silahkan masukkan kembali rata-rata angka!");
        }
    }
    
}
