package day12_methodCreation;

public class C3_AsalSayi {
    public static void main(String[] args) {
        // verilen bir sayinin asal olup olmadigini true false olarak donduren
        // bir method olusturun


        // asalSayiMi method'u boolean bir sonuc dondurdugundedn
        // bu methodu calistirdigimizda
        // ya direk yazdirmaliyiz

        // veya method call'un getirecegi sonucu atamak icin bir veriable olusturalim
    asalSayiMi(13);
    boolean asalMiSonucu= asalSayiMi(13);
        System.out.println("13 icin sonuc : "+ asalMiSonucu); // true
    }

    public static boolean asalSayiMi(int input) {

        boolean asalSayiMi=true;
        for (int i = 2; i <input ; i++) {

            if (input%2==0){ // bu sart saglanirsa asal sayi degil
                asalSayiMi=false;
                break;
            }
        }


return asalSayiMi;
    }

}
