/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_inputdarikeyboard;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class Bab3_Lthn5_Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Bilangan Pertama"));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Bilangan Kedua"));
        int hasil1 = (nilai1+nilai2)*(nilai2+nilai1);
        int hasil2 = nilai1/4*nilai2;
        System.out.println("=====HASILNYA=====");
        System.out.println("Hasil dari("+nilai1+"+"+nilai2+")*("+nilai2+"+"+nilai1+")= "+hasil1);
        System.out.println("Hasil dari ("+nilai1+"/"+nilai2+") = "+hasil2);
        
    }
    
}
