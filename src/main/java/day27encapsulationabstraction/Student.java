package day27encapsulationabstraction;

public class Student {

    private String stdId =  "AC123";
    private double gpa = 3.99;
    private boolean poor = true;

    //Encapsulation yapilmis data'yi okuyabilir miyiz?
    //get method'lar(getter) encapsule edilmis(saklanmıs) data'yi okumamıza yarar.7
    //get method'lar(getter) her zaman "public" olur.
    //get method'lar(getter) retun type'i variable'nin data type'i ile aynı olur.
    //get method'lar(getter) isimleri get + variable name seklinde olur.
    //get method'lar(getter) isimleri  variable boolen ise is + variable name seklinde olur.
    //get method'lar(getter) parametre kullanmazlar.
    public String getStId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }


            //Encapsulation yapilmis data'larin degerini degistirebilir miyiz?

    //set method'lar(setter) encapsule edilmis data'larin degerlerini degistirmemize yarar.
    //set method'lar(setter) her zaman "public" olur.
    //set method'larin(setter) return type'i her zaman void olur.
    //set method'larin(setter) isimleri "set + variable name" seklinde olur.
    //set method'lar(setter) variable ile ayni data type'inde parametre kullanirlar.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStId(String stId) {
        this.stdId = stId;
    }
}
