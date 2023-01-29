package day12_methodCreation;

public class C8_Palindrome {
    public static void main(String[] args) {
        // Verilen bir String'in palindrome olup olmadigini yazdirin
        // Palindrome : duz okunusu ile tersten okunusu birbirine ayni olan

        String str= "1234321";

        String tersStr = C7_TerseCevirme.metiniTersCevir(str);

        if (str.equals(tersStr)){
            System.out.println("Verilen metin polindrome");
        }
        else {
            System.out.println("Verilen metin polindrome degildir.");
        }
    }
}
