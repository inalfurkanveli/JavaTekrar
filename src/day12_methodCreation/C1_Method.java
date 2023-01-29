package day12_methodCreation;

import day11_forLoop.C12_methodCreation;

public class C1_Method {
    public static void main(String[] args) {
        /*
        method'lar bazen cok basit islemleri, bazen de kompleks islemleri yapabilir
        biz o islemleri nasil yapabiliriz diye dusunmek yerine hazir method'u kullanmayi tercih ederiz
        bizden sonra kodu inceleyecek kisilere de hazir method isimlerinde ne yapmak istedigimizi
        kolayca anlayabilirler
        ayrica kodu her yazdigimizda yapabilecegimiz muhtemel hatalardan kurtulmus oluruz
         */
        String str= "Java'da yolu yariladik";

        str.isEmpty(); // boolean sonuc dondu ama kullanmadik
        // method'un dondurdugu sonucu ya kullanirsiniz ya da yazdirmak istersiniz

        System.out.println(str.isEmpty()); // false

        // ya da donen sonucu ileride kullanacaksak atama yapariz

        String buyukHarfStr = str.toUpperCase();

        C12_methodCreation.faktoryelyazdir(7); // 7! = 5040
    }
}
