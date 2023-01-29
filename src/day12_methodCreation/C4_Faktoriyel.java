package day12_methodCreation;

public class C4_Faktoriyel {
    public static void main(String[] args) {
        // verilen bir sayinin 15'den kucuk bir pozitif tamsayi oldugunu kontrol edin
        // kucukse bir method olusturup, faktoryel degerini yazdirin
        // sayi istenen aralikta degilse uyari yazdirin


        int input = 13;

        if (input>0 && input<15 ){
            faktoriyelYazdir(input);
        }
        else {
            System.out.println("Verilen deger 15'ten kucuk ve pozitif olmalidir");
        }
    }



    public static void faktoriyelYazdir(int input) {
        int carpim = 1;

        for (int i = input; i >=1 ; i--) {
            carpim*=i;

        }

        System.out.println("Verilen input icin faktoriyel sonucu "+ carpim);
    }
}
