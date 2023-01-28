package day10_stringManipulations;

import java.util.Scanner;

public class C9_forLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Baslangic degeri giriniz");
        int baslangic= sc.nextInt();
        System.out.println("Bitis degeri giriniz ");
        int bitis= sc.nextInt();


        for (int i = baslangic; i <=bitis ; i++) {

            if (i%5==0){
                System.out.print(i+ " ");
            }

        }

    }
}
