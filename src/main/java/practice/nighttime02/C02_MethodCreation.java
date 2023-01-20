package practice.nighttime02;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //protokol tribunu == vip ==static
        //Dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz

        System.out.println("Dikdortgenin Alani : "+dikdortgenAlani(10, 5));

        System.out.println("Dikdortgenin Cevresi : "+dikdortgeninCevresi(12, 45));

        kareninAlani(25);
    }//main

    /*
            Access      static    datatype methodismi( parametreler)
            modifier
     */

    public     static       int dikdortgenAlani(int a,int b){
        return a*b;//carpmanin sonucunu kulaniciya verdim
    }//methodBody

    //Dikdortgenin cevresini hesaplayan kodu yaziniz ve kullaniniz

    public static int dikdortgeninCevresi(int a,int b){
        return 2*(a+b);
    }//methodBody
    //Karenin alanini hesaplata kodu yaziniz
    public static void kareninAlani(int a){
        System.out.println("Karenin Alani : "+(a*a));
    }

    public static class C01_Scanner {

        /*

        TechProEd spor salonu icin kullanicidan isim; soyisim; yas;
        kilo;boy;salona devam edecegi ay suresi bilgilerini alip aylik 20 $
        olarak toplam ucreti yazdiriniz

     */
        public static void main(String[] args) {

            Scanner input =new Scanner(System.in);

            System.out.println("TechProEd Spor Salonuna Hoşgeldiniz..");
            System.out.println("Lütfen isiminizi giriniz");

            String isim=input.nextLine();

            System.out.println("Lütfen yasinizi giriniz.");

            byte yaş=input.nextByte();

            System.out.println("lütfen kilonuzu giriniz");

            double kilo=input.nextDouble();

            System.out.println("lütfen boyunuz girinizi.");

            double boy=input.nextDouble();

            int aylik_Ucret= 20;

            System.out.println("aylıkücret"+aylik_Ucret+"$");

            System.out.println("lütfen kaç ay devam edeceginizi giriniz..");

            int aylik=input.nextInt();

            int toplam_tutar = aylik_Ucret*aylik;

            System.out.println("toplam tutar = " + toplam_tutar+"$");

            System.out.println("tamIsım ="+isim+ "\nYaşınız ="+yaş+"\nKilo = "+kilo+"\nBoy ="+boy+"\nÖdemeniz gereken tutar =" +toplam_tutar+"$");



        }
    }
}//class
