package day3_dataCasting_MatIslemler;

import java.util.Scanner;

public class C3_DataCasting {
    public static void main(String[] args) {
        System.out.println(25/6); // 4
        System.out.println(29/3); // 9

        // JAva vir bolme isleminde 2 int isleme giriyorsa sonucu int olarak verir

        int sayi1=25;
        int sayi2=6;

        System.out.println(sayi1/sayi2); // 4

        double dbl=6;

        System.out.println(sayi1/dbl); // 4.166666666666667

        // kullanicidan 2 tam sayi alin
        // 1.sayiyi 2. sayiya bolup sonucu ondalikli olarak yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bölünecek sayilari giriniz: ");
        int ilkSayi=scanner.nextInt();
        int sonSayi=scanner.nextInt();

        System.out.println("İşlem sonucu : " + ilkSayi/(double)sonSayi);
    }
}
