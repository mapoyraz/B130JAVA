package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1:Time'i formatlayiniz
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//13:40:10.525108


        //hh==> 12 lik saat sistemini kullanir.-Eger 24 luk saat sistemini kullanmak istiyorsaniz  HH==> 24 luk saaat sistemini kullanir.
        // hh kullandiginiz da AM veya PM demelisiniz, bunu demek icin "a" yazmaniz yeterlidir.Yani ;"hh:mm  a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm a");

        System.out.println(dtf.format(myTime));//01-45 PM

    }

}