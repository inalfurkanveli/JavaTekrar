package day10_stringManipulations;

public class C8_forLoop {
    public static void main(String[] args) {
        // 1 den 20 e kadar olan sayilarin toplamini yazdirin


        int toplam=0;

        for (int i = 0; i <20 ; i++) {
            toplam+=i;
        }

        System.out.println(toplam);
    }
}
