package practice.nighttime08;

public class KumandaRunner {

    public static void main(String[] args) {

        Kumanda tv = new Kumanda(11.5,7,9.8);
        tv.gucDugmesi();
        System.out.println(tv.kanalDegistirme("B"));//B
        System.out.println(tv.sesArtırma());//11
        System.out.println(tv.sesAzaltma());//10

    }//main


}
