package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanıcıdan adresini alınız ve ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adresinizi giriniz");


        //nextLine() methodu kullanicidan cok kelimeli sting almak için kullanılır.
      String address =  input.nextLine();

      System.out.println(address);


    }



}
