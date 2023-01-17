package day2_veriablesScanner;

public class C3_Non_primitiveDataTypes {
    public static void main(String[] args) {

        String str= "Java candir";
        int sayi=10;


        /*
        primitive data türlerinin hazir methodlari yoktur.
        Ancak non-primitive data turlerinin onceden hazirlanmis
        bizim kullanabilecegimiz methodlari olur.
         */

        System.out.println(sayi); // 10
        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str); // Java candir.
        System.out.println(str.toUpperCase()); // JAVA CANDİR

        System.out.println(str); // Java candir

        System.out.println(str.isEmpty());// false

        // String bir ifade de yapılan degisikliklerin kalıcı olmasinin istiyorsak
        // onu yeni bir String variable'a  atama yaparak degisiklik kalıcı hale gelir.
    }
}
