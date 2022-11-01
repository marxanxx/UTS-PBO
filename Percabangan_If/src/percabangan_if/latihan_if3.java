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
public class latihan_if3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nohari;
        System.out.print("Masukan No Hari : ");
        nohari = input.nextInt();
                switch(nohari){
            case 1 :
                System.out.println("Hari ke- "+nohari+" adalah Senin");
                break;
            case 2 :
                System.out.println("Hari ke- "+nohari+" adalah Selasa");
                break;
            case 3 :
                System.out.println("Hari ke- "+nohari+" adalah Rabu");
                break;
            case 4 :
                System.out.println("Hari ke- "+nohari+" adalah Kamis");
                break;
            case 5 :
                System.out.println("Hari ke- "+nohari+" adalah Jum'at");
                break;
            case 6 :
                System.out.println("Hari ke- "+nohari+" adalah Sabtu");
                break;
            case 7 :
                System.out.println("Hari ke- "+nohari+" adalah Minggu");
                break;
            default :
                System.out.println("Tidak ada hari ke- "+nohari);
        }
    }
    
}
