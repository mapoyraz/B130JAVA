package practiceDTNT.practice01;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
            Kullanicidan bir gun alin
            Eger gun cuma ise "Muslumanlar Icın Mubarek Gun"
            Eger gun cumartersi ise "Yahudiler icin Muberek Gun"
            Eger gun pazar ise "Hristiyanlar icin muberek gun" yazdıran kodu olusturunuz.
         */


        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen gun ism giriniz..");

        String gun= input.next().toLowerCase();//kucuk harfe cevirdik.

        if(gun.equals("cuma")){
            System.out.println("Muslumanlar Icın Mubarek Gun");

        } else if (gun.equals("cumartesi")) {

            System.out.println("Yahudiler icin Muberek Gun");

        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin muberek gun");

        }else
            System.out.println("kutsal gun degil");


    }

}
