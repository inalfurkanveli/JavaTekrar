package day2_veriablesScanner;

import java.util.Scanner;

public class C5_Scanner {
    public static void main(String[] args) {

        // kullanicidan ismini alıp hepsini büyük harfle yazdırın.
        // Kullanicidan deger almak icin 3 islem yapmak gereklidir.
        //1. adim Scanner objesi olusturmak

        Scanner scan=new Scanner(System.in);
        //2.adım: Kullanıcıya ne istedigimizi belirtecegimz bir uyarı mesajı
        System.out.println("İsminizi giriniz.");
        //3.adım Kullanicinin girecegi degeri kaydedeceginiz bir variable olusturun
        // scan objesi ile ilgili methodu kullanarak kullanıcının girdigi degeri
        // olusturdugunuz variable atayin.

        String girilenIsim= scan.nextLine();

        // Artık Kullanıcının girdigi deger girilenIsim variable'inda kayitli


        System.out.println(girilenIsim.toUpperCase());


    }
}
