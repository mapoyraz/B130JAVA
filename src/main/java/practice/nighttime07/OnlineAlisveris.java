package practice.nighttime07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlisveris {

    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlari = new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        /*
         * Basit bir online alisveris programi yaziniz.
         *
         * 1. Adim : "urunListesi"nden urun sectir ve kac adet istedigini sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme" ekle.
         * 4. Adim : Alisveris bitince online sitenin kurulusGunu ise ucret alma;
         *   degilse toplam odemesi gereken tutari goster.

         * */

        urunListesi.add("ayakkabı : urun kodu : 1");
        urunListesi.add("canta : urun kodu : 2");
        urunListesi.add("saat : urun kodu : 3");
        urunListesi.add("bilezik : urun kodu : 4");
        urunListesi.add("toka : urun kodu : 5");


        urunFiyatlari.add(10.0);
        urunFiyatlari.add(20.0);
        urunFiyatlari.add(30.0);
        urunFiyatlari.add(40.0);
        urunFiyatlari.add(50.0);

        System.out.println("urunListesi = " + urunListesi);

        System.out.println("urunFiyatlari = " + urunFiyatlari);

        musteriSecim();

    }//main

    private static void musteriSecim() {
        System.out.println("Lutfen sectiginiz urunun kodunu giriniz");
        int secim =input.nextInt();
        System.out.println("Sectiginiz urunden kac adet alacaksınız?");

        int adet = input.nextInt();

        double urunTutari= adet*urunFiyatlari.get(secim-1);//get methodu indexle çalıştığı için secim-1 yaptık yoksa 1 sonraki ürün gelir.

            toplamOdeme+=urunTutari;
        System.out.println("Alışverişe Devam etmek için : 1 \nOdeme için : 2 tuşuna basınız. ");

        int devamMi= input.nextInt();

        if(devamMi==1){
            musteriSecim();//recursiveMethod
        }else{
            odeme();
        }

    }//musteriSecim

    private static void odeme() {
        LocalDate kurulusGunu = LocalDate.of(2023,01,12);

        LocalDate date=LocalDate.now();
        if (date.isEqual(kurulusGunu)){
            System.out.println("Bugün bizim acilis yil dönümümüz Borcunuz yoktur");


        }else {
            System.out.println("Yine bekleriz Odemeniz gereken tutar: " + toplamOdeme + "$");
        }

    }
}//class
