package practiceDTNT.practice04;

import practiceDTNT.practice04.HesapMakinesi;

public class HesapMakinesiVarargs {

    public static void main(String[] args) {

        HesapMakinesi islem = new HesapMakinesi();

        islem.toplama(3,5,7,96,54,-85);
        islem.cikarma(10,10,0,40);
        islem.carpma(15,63,-8);
        islem.bolme(80,-4);

    }
}