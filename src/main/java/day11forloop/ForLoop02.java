package day11forloop;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1 : Verilen bir String'de 'a' character'i hariç tüm character'leri yazdiriniz.
        //            "Madagaskar" ==> Mdgskr

        //1. yol:

        String s = "Madagaskar";

        String t= s.replace("a","");

        System.out.print(t);


        System.out.println();

        //2. yol:

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch!='a'){

                System.out.print(ch);
            }

        }

        System.out.println();

        //3. yol:

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch=='a'){
                continue;//contiunue keyword'u bazi sartlar icin loop'un adimlerini atlamamizi sağlar.

            }
            System.out.print(s.charAt(i));

        }


















    }
}
