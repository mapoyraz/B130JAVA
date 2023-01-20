package day27encapsulationabstraction;

public abstract class Courses {

    /*
       1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
    Body'si olmayan method'lara "abstract method"lar denir.

    2)"abstract method"'lar child class'lar tarafindan "override" edilmek zorundadırlar.
     Bu yuzden eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseni
     o method'u  abstract yapmak gerekir.

     3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
     "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

     4)"abstract method" lar siradan class'larin icine yazilamazlar."abstract method"larin icine yazildiklari
     class'lar da abstract olmak zorundadirlar.

     5) "abstract class'larda hem "abstract method"lar hem de "concrete method"lar kullanilabilir.

     6)"concrete class"lar "abstrack class"ların child'i olabilirler.
       "abstrack method"ların override edilme zorunluluğu "concrete class"lar icindir
     */

    public abstract void math();

    public void art(){

        System.out.println("Painting");
    }


    //final methodlar "override" edilemezler, halbuki "abstract method"lar override edilmek icin olusturulurlar
    //Bu celiskidir, bu yüzden Java abstract methodların final olmasina musaade etmez.
   // public final abstract void science();

    //Concrete Classlar final olduğunda Child Class'a sahip olamazlar
    //Ama "Abstract Class"lar için Child Class olmalidir, cunkku Child Class'lar abstract parent class'daki abstract method'lari kullanirlar.
    //Bu yuzden, Java "Abstract Class"larin "final" olmasina musade etmez.


    //"abstract method"lar "private" olmazlar cunku Child Class'lar abstract method'lari kullanirlar,private yapinca kullanima kapali olur.
    //Bu celiskidir, bu yuzden Java abstract method'larin "private" olmasina musaade etmez.

    //"Abstract method"lar static olamazlar çünkü  static method'lar override edilemez, halbuki abstract methodlar override edilmek icin olusturulumustur.

}
