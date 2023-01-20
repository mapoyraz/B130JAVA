package day03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Kullanicidan iki sayi alip dört işlem yapan ve işlemlerin sonuçlarını ekrana yazdıran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("İki sayı giriniz");

        double fisrtNumber = input.nextDouble();

        double secoundNumber = input.nextDouble();

        System.out.println(fisrtNumber+secoundNumber);
        System.out.println(fisrtNumber - secoundNumber);
        System.out.println(fisrtNumber * secoundNumber);
        System.out.println(fisrtNumber / secoundNumber);

    }
}
