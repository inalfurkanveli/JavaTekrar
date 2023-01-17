package day2_veriablesScanner;

import java.util.Scanner;

public class C9_Scanner {
    public static void main(String[] args) {
        /*
        Soru 7 (Interview)- Kullanicidan iki sayi alip
        ikisinin degerlerini degistirin(swap).
                kullanicinin girdigi degerler
        sayi1= 10  sayi2=20 ise
        siz kod ile bunlarin degerlerini degistirip
        sayi1=20  sayi2=10 yapin

         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 1.sayi ve 2.sayiyi giriniz:");
        int sayi1 = scan.nextInt();
        int sayi2=scan.nextInt();

        int temp;

        //1.adim : sayilardan birini temp degerine atayalım
        //2.adim degeri bos olan sayiyi diger sayinin degerini atayalim
        // 3.adim temp 'teki degeri son boasalttıgımız sayiya atama yapalım

        temp=sayi1;

        sayi1=sayi2;

        sayi2=temp;

        System.out.println("sayilarin degerlerinin yerlerini degistirdim" +
                "\n sayi1'in yeni degeri : "+ sayi1
                +"\nsayi2'nin yeni degeri: "+ sayi2);
    }
}
