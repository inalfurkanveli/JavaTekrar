package day12_methodCreation;

public class C2_MethodOlusturma {
    public static void main(String[] args) {

        // verilen 2 sayiyi carpip sonucunu yazdiran bir method olusturun

        /*
        bir method ancak method call yapildiginda calisir
        method call iicin method adi ve parametrelere uygun argumentler yazilmalidir
        method call icerisinde yazilan variable ve ya degerlere argument denir
         */

        sayilariCarp(7,9);

        // carpYazdir("ali","veli"); argument ve parametreler uyumlu degilse CTE olur

        // cunku biz bu method'da argument olarak int degerler istiyoruz
    }

    private static void sayilariCarp(int sayi1, int sayi2) {
        System.out.println(sayi1*sayi2);

    }
}
