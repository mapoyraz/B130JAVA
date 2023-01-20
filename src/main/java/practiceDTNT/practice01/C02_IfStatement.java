package practiceDTNT.practice01;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        /*
          Kullanicidan alacaginiz iki sayiyi yine kullaniciya
          sectireceginiz dort islemden biri ile isleme koyupyazdiriniz
         */


        Scanner input= new Scanner(System.in);






        System.out.println("lütfen iki tam sayı giriniz.");

        double num1= input.nextDouble();
        double num2= input.nextDouble();

        System.out.println("Lutfen\ntoplama yapmak icin 1\ncikarma yapmak icin 2" +
                "\ncarpma yapmak icin 3\nbölme yapmak icin 4\nsayısını giriniz");//kullaniciya secmesi için menu olusturdum

        int islem = input.nextInt();

        if (islem==1) {

            System.out.println("Toplama isleminin sonucu:" + num1+ "+" +num2+ "=" +(num1+num2) );
        } else if (islem==2) {
            System.out.println("Cikarma isleminin sonucu:" + num1+ "-" +num2+ "=" +(num1-num2) );
        } else if (islem==3) {
            System.out.println("Carpma isleminin sonucu:" + num1+ "*" +num2+ "=" +(num1*num2));

        } else if (islem==4) {
            System.out.println("Bölme isleminin sonucu:" + num1+ "/" +num2+ "=" +(num1/num2));

        }else
            System.out.println("Hatalı seçim yaptınız tekrar deneyiniz..0");



    }
}
