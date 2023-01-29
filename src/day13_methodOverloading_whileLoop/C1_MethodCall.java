package day13_methodOverloading_whileLoop;

import day12_methodCreation.C3_AsalSayi;
import day12_methodCreation.C7_TerseCevirme;
import day12_methodCreation.C9_Fibonacci;

public class C1_MethodCall {
    public static void main(String[] args) {
        // ilk 15 fibonacci sayisi yazdiralim

        C9_Fibonacci.fibonaccidenSayiYazdir(15);
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        // asagida verilen cumlenin tersini yazdirin
        String str= "bir kere yaparim, yan gelir yatarim";

        String tersStr= C7_TerseCevirme.metiniTersCevir(str);
        System.out.println(tersStr);
        //miratay rileg nay ,mirapay erek rib

        // asagida verilen cumlenin palindrome olup olmadigini yazdirin
        str= "Java candir";

        tersStr= C7_TerseCevirme.metiniTersCevir(str);
        if (str.equals(tersStr)){
            System.out.println("Palindrome");
        }else {
            System.out.println(" Polindrome degil");
        }


        // sayinin asal olup olmadigini kontrol edelim

        int input=125;
        System.out.println(C3_AsalSayi.asalSayiMi(input));
    }
}
