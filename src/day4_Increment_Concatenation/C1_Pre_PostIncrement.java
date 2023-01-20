package day4_Increment_Concatenation;

public class C1_Pre_PostIncrement {
    public static void main(String[] args) {
        int sayi=20;
        // sayıyı 3 arttırın

        sayi=sayi+3;
        sayi+=3;

        sayi++;
        sayi++;
        sayi++;


        System.out.println(sayi); // 29
        // sayiyi 2 azaltin

        sayi=sayi-2;
        sayi-=2;

        sayi--;
        sayi--;

        System.out.println(sayi); // 23

        sayi=10;

        // sayinin degerini önce 1 azaltın sonra yazdirin
        sayi--;
        System.out.println(sayi); // 9

        sayi=10;
        // sayiyi önce yazdirin sonra 1 azaltin
        System.out.println(sayi);
        sayi--;

        sayi=10;
        System.out.println(sayi++);
        // Java ayni satirda iki islem oldugunda siralama yapar
        // eger ++ variable'dan sonra ise arttırma islemini sonra yapar
        // bu durumda önce yazdırma, sonra artirma islemi yapar.


        System.out.println(sayi);


        sayi=10;
        System.out.println(++sayi); // 11
        // ++ variable'dan önce ise artirma islemini önce yapar
        // bu durumda java önce artirma sonra yazdirma islemi yapar.


        System.out.println(sayi++);
        System.out.println(sayi);




    }
}
