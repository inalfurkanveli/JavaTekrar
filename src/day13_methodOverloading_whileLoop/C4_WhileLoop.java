package day13_methodOverloading_whileLoop;

public class C4_WhileLoop {
    public static void main(String[] args) {
        // 2 basamakli sayilardan 7 ile bolunebilenleri yazdirin

        for (int i = 10; i <100 ; i++) {
            if (i%7==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println("");


        int sayi=10;

        while (sayi<100){
            if (sayi%7==0){
                System.out.print(sayi+ " ");
            }
            sayi++;
        }

        // for loop ile cozulebilen bir problemi illa while loop
        // ile cozmek biraz zahmetli
    }
}
