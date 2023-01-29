package day12_methodCreation;

public class C7_TerseCevirme {
    public static void main(String[] args) {

        // Verilen bir stringi terse cevirip o halini bize donduren bir method
        // yaziniz

        metiniTersCevir("Java Candir");

        System.out.println(metiniTersCevir("Java'yi seviyorum"));
    }

    public static String metiniTersCevir(String str) {
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
         tersStr+= str.charAt(i);
        }

        return tersStr;
    }
}
