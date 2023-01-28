package day10_stringManipulations;

public class C10_forLoop {
    public static void main(String[] args) {
        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin


        int inputBas=15;
        int inputSon=120;

        int toplam=0;
        int sayac=0;
        for (int i = inputBas; i <inputSon ; i+=7) {
            sayac++;
            toplam+=i;
        }

        System.out.println("Sayi adedi "+ sayac + " sayilarin toplami "+ toplam);
    }
}
