package day03scanner;

import java.util.Scanner;

public class Scanner_Tekrar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen tasinizi giriniz...");

        byte age = input.nextByte();
        System.out.println(age);

        System.out.println("Ilk isminizi giriniz...");

        String firstName = input.next();

        System.out.println("Soy isminizi giriniz...");

        String lastName = input.next();

        System.out.println(firstName + " " +  lastName);

        System.out.println("Lutfen adresinizi giriniz..");

        //nextLine() methodu kullanicidan cok kelimeli String almak için kullanilir.
        String address = input.nextLine();

        System.out.println(address);

        System.out.println("Ikı sayi giriniz");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

        System.out.println("Dikdörtgenin kisa kenar uzunluğunu giriniz..");

        float shortSide = input.nextFloat();

        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz");

        float longSide = input.nextFloat();

        System.out.println("Alan = " + (shortSide * longSide));

        System.out.println("Cevre= "+ (2*shortSide + 2*longSide));

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz



    }

}
