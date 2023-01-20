package day16multidimensionalarrays;

public class Md05 {

    public static void main(String[] args) {


        int a [][] = {{3,5}, {5,6}, {6,7}};

        int carpim =1;

        for (int[] w : a){

            for(int k : w) {

                carpim = carpim*k;


            }

        }

        System.out.println(carpim);













    }
}
