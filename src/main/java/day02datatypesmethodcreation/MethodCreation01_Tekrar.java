package day02datatypesmethodcreation;

public class MethodCreation01_Tekrar {

    public static void main(String[] args) {


        int uclusonuc = firstTwoMultiplyThirdAdd(5,6,8);

        System.out.println(uclusonuc);

        double kupSonuc = getCube(5);
        System.out.println(kupSonuc);

        int dikAlan =  dikdortgenalan(5,8);
        System.out.println(dikAlan);

        int dikCevre = dikdortgencevre(5,8);
        System.out.println(dikCevre);

        double daireCvr = dairenincevre(9);
        System.out.println(daireCvr);

        double daireAlan= daireninalani(9);
        System.out.println(daireAlan);

    }
    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
    public static int firstTwoMultiplyThirdAdd (int a ,int b ,int c){ return a*b+c; }



    //Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.


    static double getCube (double a){ return a*a*a;}

    //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    //4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz

    public static int dikdortgenalan (int a,int b){return a*b;}

    public static int dikdortgencevre (int a,int b){return a+b*2;}

    public static double dairenincevre (double a){return 2*Math.PI*a;}

    public static double daireninalani (double a) {return Math.PI*(a*a);}


}
