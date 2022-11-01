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
public class latihan06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("0. Aries");
        System.out.println("1. Taurus");
        System.out.println("2. Gemini");
        System.out.println("3. Cancer");
        System.out.println("4. Leo");
        System.out.println("5. Virgo");
        System.out.println("6. Libra");
        System.out.println("7. Scorpio");
        System.out.println("8. Sagitarius");
        System.out.println("9. Capricorn");
        System.out.println("10. Aquarius");
        System.out.println("11. Pisces");
        System.out.print("Masukan no Zodiak : ");
        int zodiak = input.nextInt();
        switch (zodiak){
            case 0 :
                System.out.println("Aries");
                System.out.println("Jangan terlalu memaksakan diri, tidak semua yang kamu inginkan harus tercapai saat ini. "
                        + "Lakukan dengan gigih tanpa perlu sangat berambisi dan melupakan kepentingan yang lain.");
                break;
            case 1:
                System.out.println("Taurus");
                System.out.println("Sepertinya kamu harus keluar malam ini, nikmati kesendirian. Saatnya kamu istirahat dari pikiran yang jenuh.");
            break;
            case 2:
                System.out.println("Gemini");
                System.out.println("Kamu akan mengalami beberapa masalah dengan pendengaran atau penglihatanmu hari ini. "
                        + "Segera temui dokter jika masalah tersebut sangat serius");
            break;
            case 3:
                System.out.println("Cancer");
                System.out.println("Kamu akan merasakan banyak orang yang merasa marah denganmu. "
                        + "Tenang itu hanya prasangkamu saja. Tetap berpikir rasional pada hari ini.");
            break;
            case 4:
                System.out.println("Leo");
                System.out.println("Menunda-nunda pekerjaan hanya akan menyusahkanmu. "
                        + "Sebaiknya kamu mulai buat jadwal yang efektif. Jangan terburu-buru saat mengerjakan sesuatu.");
            break;
            case 5:
                System.out.println("Virgo");
                System.out.println("Jadikan masalah sebagai pengalaman untuk menghindari suatu saat. "
                        + "Hari ini akan ada banyak yang mengganggu pikiranmu. Tetap tenang dan jangan gegabah");
            break;
            case 6:
                System.out.println("Libra");
                System.out.println("Terlalu berambisi akan suatu hal hanya membuatmu terpuruk. "
                        + "Tidak boleh terburu-buru dan gegabah dalam menentukan sebuah tujuan.");
            break;
            case 7:
                System.out.println("Scorpio");
                System.out.println("Luangkan waktu untuk bersama keluarga hari ini. Jika kamu memiliki adik, "
                        + "ajaklah ia bermain sebentar hari ini. Kamu juga bisa meluangkan waktu minggu ini untuk liburan bersama keluarga.");
            break;
            case 8:
                System.out.println("Sagitarius");
                System.out.println("Kamu akan dipenuhi pertanyaan-pertanyaan atau pikiran buruk sebelum tidur. "
                        + "Minum teh chamomile untuk meredakan stresmu dan membuat pikiran jernih.");
            break;
            case 9:
                System.out.println("Capricorn");
                System.out.println("Mungkin hari ini akan terasa lebih berat dibandingkan hari lainnya. Semua rencanamu tergantung dari hari ini.");
            break;
            case 10:
                System.out.println("Aquarius");
                System.out.println("Kamu akan mengalami banyak tekanan hari ini. Saat ada waktu senggang, "
                        + "istirahat dan tenangkan pikiranmu. Jangan terlalu banyak mengonsumsi makanan manis.");
            break;
            case 11:
                System.out.println("Pisces");
                System.out.println("Hari ini akan lebih cerah dibandingkan hari yang lain. "
                        + "Pertanyaan-pertanyaan yang masih ada akan terjawab. Semua rasa cemasmu hilang.");
            break;
            default:
                System.out.println("error");
        }
                
    }
    
}
