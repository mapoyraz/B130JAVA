package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //  Variable oluşturmak
        //Java cumlesi = Statement
        //Java cumlesi = Statement
        //Java'da eşittir demek "=="
        // Java'da "=" "assignment operator" dir. Sagdaki değeri alır soldaki kutuya koyar.
        //Acces Modifier yazmazsanız "access modifier" "default" demektir.
        //Data Type + Variable Name ==> Variable Declaration
        //
        // Data Type'ini yazınız  Variable ismi yazınız.  Assignment Operator(Atama operatörü) Variable değeri İngilizcedeki nokta gibi.
             int age = 13;

        //Ornek 1: Öğrenci ismi için variable oluşturup değer olarak Ali Can atayınız
        //String'lere verilen değerler çift tırnak içinde olmalidir.
        //String'ler için "default value" "null" dır.

        String  studentName = "Ali Can";

        /*
        Java'da temelde iki temel data tipi var
        1) primitive data (ilkel) type:
             char:  Tek karakterler için kullanılır. A, x, ?, 5
             boolean: boolean'lar sadece iki farklı değer alablir; true(doğru) veya false(yanlış)
             byte: -128 den +127'e kadar tamsayı değerleri için kullanılır. (1 byte)
             short: -32768 ile +32767 arasındaki tam sayılar için kullanılır (2 byte)
             int: -2,147,483,648 ile 2,147 ,483,647 arasındaki tam sayılar için kullanılır (4 byte)
             long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasındaki tam sayılar için kullanılır (8 byte)
              - float - double


         */

        //Ornek 2: char data type'inde ilk ismin ilk harfi olarak bir variable oluşturunuz ve bir değer atayiniz.
        //Note: char data type'inde değerler tek tirnak içinie konulmalıdır.


        char isminILkHarfi = 'A';

        //Ornek 3: boolean data type'inde emeklimisiniz için bir variable oluşturun ve false değerini atayın

        boolean emeklimisin = false;

        //Ornek 4: byte data type'inde öğrenci yaşı için bir variable oluşturunuz ve değer atayınız.

        byte ogrenciYasi = 15;

        //Ornek 5: Site nüfusu için bir variable oluşturup değer atayınız.

        short siteNufusu = 250;

        //ornek 6: Ulke nüfsuları için bir variable oluşturup değer atayınız.

        int turkiyeNufusu = 85000000;

        //ornek 7:insan vucudundaki hücre sayısı için bir variable oluşturup değer atayınız.
        //Note: Bir değer long ise sona "L"(bu tercih edilir) ve "l" konulur.

        long starsInTheGalaxy = 9999999999999L;

        //Eğer long'a atadığınız değer int'lerin aralığında ise sonuna "L" koymaya gerek yok

        long weightOfSun = 1234567;


        //HOCANIN VERDİĞİ KODLAR


        //Variable olusturmak
        //Java cumlesi = Statement
        //Java'da esittir demek "==". Yani Matematik'de "=", Java'dd "=="
        //Java'da "=" "assignment operator" dir. Sagdaki degeri alir soldaki kutuya koyar
        //Access Modifier yazmazsaniz "access modifier" "default" demektir
        //Data Type + Variable Name ==> Variable Declaration
        //Assignment Operator(Atama Operatoru)  + Variable degeri ==> Assignment
        //Eger Variable Declaration yapar, Assignment yapmazsaniz Java kendi degerlerini(default) koyar.
        //Default degerler sayilar icin sifirdir.
        // Data Type'ini yaziniz   Variable ismi yaziniz  Assignment Operator(Atama Operatoru)   Variable degeri   Ingilizce'deki nokta gibi
                int                      age2                     =                                   13                   ;

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String'lere verilen degerler cift tirnak icinde olmalidir.
        //String'ler icin "default value" "null" dir.
        String bla = "Ali Can";

        /*
           Java'da temelde iki tip data vardir;
           1)primitive data type:
                char: Tek karakterler icin kullanilir. A, x, ?, 5
                boolean: boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
                byte: -128 den +127 e kadar tamsayi degerleri icin kullanilir (1 byte)
                short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir (2 byte)
                int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir (4 byte)
                long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir. (8 byte)
                float:
                double:
           2)non-primitive data type

         */

        //Ornek 2: char data type'inda ilk ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        //Note: char data type'inda degerler tek tirnak icine konulmlaidir
        char isminIlkHarf = 'A';

        //Ornek 3: boolean data type'inde emeklimisin icin bir variable olusturun ve false degerini atayin.
        boolean emekliMisin = false;
       //Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte studentAge = 23;

        //Ornek 5: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteN1 = 1200;

        //Ornek 6: Ulke nufuslari icin bir variable olusturup deger atamasi yapiniz
        int countryPopulation = 1864184648;

        //Ornek 7: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note: Bir deger long ise sonuna "L"(Tercih edilir) veya "l" konulur.
        long cellNumberInHumanBody = 87654321356788L;

        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yok
        long weightOefSun = 1234567;


    }

}

