package day2_veriablesScanner;

import java.util.Scanner;

public class C7_scanner {
      /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        asagidaki formmatta yazdirin.
		Isminiz : John
		Soyisminiz : Doe
		Yasiniz : 44
		Kaydiniz basariyla tamamlanmistir.
         */
      public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);

          System.out.println("Lütfen isminizi giriniz: ");
          String isim=scan.nextLine();
          System.out.println("Lütfen soyisminizi giriniz: ");
          String soyIsim= scan.nextLine();
          System.out.println("Lütfen yasinizi giriniz: ");
          int yas=scan.nextInt();

          System.out.println("İsminiz : "+ isim
         +                  "\nSoyisminiz: "+ soyIsim +
                            "\nYasiniz: "+ yas+
                            "\nKaydiniz basariyla olsumustur.");
      }

}
