package day2_veriablesScanner;

import java.util.Scanner;

public class C6_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan karesinin almak istediginiz sayıyı girmesini isteyin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen karesini almak istedginiz sayiyi giriniz.");

        double girilenSayi=scan.nextDouble();

        System.out.println("Girilen sayinin karesi : "+ (girilenSayi*girilenSayi));

    }
}
