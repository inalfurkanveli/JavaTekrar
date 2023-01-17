package day2_veriablesScanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
            /*
        Soru 2- Kullanicidan bir double, bir de int sayi alip
        bunlarin toplamini ve carpimini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen double degeri giriniz");
        double sayiDbl= scan.nextDouble();
        System.out.println("Lütfen int degeri giriniz");
        int sayiInt= scan.nextInt();


        System.out.println("Sayilarin toplami : "+ (sayiInt+sayiDbl));
        System.out.println("Sayilarin carpimi : "+ (sayiInt*sayiDbl));
    }
}
