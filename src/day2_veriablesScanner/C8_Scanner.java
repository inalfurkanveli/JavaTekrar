package day2_veriablesScanner;

import java.util.Scanner;

public class C8_Scanner {
    public static void main(String[] args) {
        // dikdörtgenin alanını hesaplayınız.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen dikdörtgenin iki kenar uzunlugunu giriniz.");
        double kenar1= scanner.nextDouble();
        double kenar2=scanner.nextDouble();

        System.out.println("Dikdörtgenin alanı: "+ kenar2*kenar1);
    }
}
