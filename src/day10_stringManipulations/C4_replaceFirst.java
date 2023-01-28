package day10_stringManipulations;

public class C4_replaceFirst {
    public static void main(String[] args) {
        String str = "Java heyecandir";

        // eger string bir ifade bulunan tum a'lari degilde sadece ilk a'yi degistirmek
        // isterseniz  .replaceFirst() methodunu kullanmalisiniz.


        str=str.replaceFirst("a","A");
        System.out.println(str); // JAva heyecandir
    }
}
