package day8_StringManipulasion;

import java.util.Scanner;

public class C1_StringManipulation {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String girilenGun=scan.next();
        String kullanilacakGun=girilenGun.toUpperCase();

          /*
           string ifadeler case sensitive'dir
           kullanicinin Pazar, PAzar, PazaR, PAZAR ... gibi 32 farkli sekilde yazma ihtimali vardir
           Kullanicinin girdigi degeri direk kalici olarak degistirmek tercih edilmez
           bunun yerine kullanicinin girdigi degeri degistirip yeni bir variable'a atama yapar
           ve kodlarimizda yeni variable'i kullaniriz
           Konsola yazdiracgimiz zaman, istersek kullanicin girdigi orjinal metni yazdiririz
           istersek de bizim cevirdigimiz hali yazabiliriz
         */

        switch (kullanilacakGun){

            case "PAZARTESI":
                System.out.println(girilenGun + " calisma zamani, tatile 5 gun var");
                break;
            case "SALI":
                System.out.println(girilenGun + " calisma zamani, tatile 4 gun var");
                break;
            case "CARSAMBA":
                System.out.println(girilenGun + " calisma zamani, tatile 3 gun var");
                break;
            case "PERSEMBE":
                System.out.println(girilenGun + " calisma zamani, tatile 2 gun var");
                break;
            case "CUMA":
                System.out.println(girilenGun + " calisma zamani, tatile 1 gun var");
                break;
            case "CUMARTESI":
            case "PAZAR":
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis gun ismi");
        }
    }
}
