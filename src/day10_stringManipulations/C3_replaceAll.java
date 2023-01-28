package day10_stringManipulations;

public class C3_replaceAll {
    public static void main(String[] args) {
        // bu metindeki sayilardan kurtulun
        String str= "J6a1va 566G1uz6,z1e6l-d61ir1";
        System.out.println(str.replace("6","").
                                replace("1","")
                .replace("5","")); // Java Guz,zel-dir


         /*
           replace() zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar
           eger genellemeyi butun sayilari, butun space'leri, butun ozel karakterleri
           gibi genisletmek istersek replace() yerine replaceAll() kullaniriz
           Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlamistir
           \\d : butun digit'ler
         */

       // str= "Ja7va,; og436ren,./dikce guzelle=-098siyor";

        //System.out.println(str.replaceAll("\\d", ""));

        str=str.replaceAll("\\d","");
        System.out.println(str);
        str=str.replace(" ","5");

        str=str.replaceAll("\\W",""); // Java5Guzeldir

        str=str.replace("5"," ");

        System.out.println(str);

        // buradaki harf sayisini bulun
        String input3="Ali Can, Merve Star, Mark Tom";

        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length()); // 22

         /*

Regular Expression	Açıklaması
            \d	0 ile 9 arasında herhangi bir rakam
            \D	0 ile 9 arasındaki rakamlar haricindeki karakter Kısaca : [^0-9]
            \s	Whitespace karakter, Kısaca: [ \t\n\x0b\r\f]
            \S	Whitespace karakter haricindeki bir karakter, Kısaca: [^\s]
            \w	Word karakter, Kısaca [a-zA-Z_0-9] Yani küçük harf, büyük harf veya rakam dan bir tanesi
            \W	Word karakter harici  bir karakter. Yani küçük harf, büyük harf veya rakam harici bir karakter [^\w]
            \S+	Birden fazla white space karakter harici karakterler
          */


    }
}
