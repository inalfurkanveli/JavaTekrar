package day12_methodCreation;

import java.util.Scanner;

public class C5_HesapMakinesi {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi ve istedigi islemi alin (+ / * -)
        // bir method olusturup sayilara istenen islemi uygulayip
        // sonucu bize dondurun.
        // kullanici islemi yanlis secmisse 0 dondurun

        Scanner scan=new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz ");
        int sayi1=scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz ");
        int sayi2= scan.nextInt();

        System.out.println("Lutfen yaptirmak istediginiz islemi seciniz : + , - , * , / ");
        char islem=scan.next().charAt(0);

        hesapMakinesi(12,15,islem);

    }
    public  static int hesapMakinesi(int sayi1 , int sayi2 , char islem){
        switch (islem){
            case '+' :
                return  sayi1+sayi2;
            case '-' :
                return  sayi1-sayi2;
            case '*' :
                return  sayi1*sayi2;
            case '/' :
                return  sayi1/sayi2;
            default:
                return 0;
        }

    }
}
