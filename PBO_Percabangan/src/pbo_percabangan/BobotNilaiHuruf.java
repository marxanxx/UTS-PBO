/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_percabangan;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class BobotNilaiHuruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kode = new Scanner (System.in);
        System.out.print("Masukan Huruf : ");
        String grade = kode.nextLine();
        switch(grade){
            case "A" :
                System.out.println("4");
                break;
            case "B" :
                System.out.println("3");
                break;
            case "C" :
                System.out.println("2");
                break;
            case "D" :
                System.out.println("1");
                break;
            case "E" :
                System.out.println("0");
                break;
            default :
                System.out.println("Grade tidak ditemukan");
        }
    }
    
}
