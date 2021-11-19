package com.naman.lecture31OOP.oop5.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        son.career();

        Daughter daughter = new Daughter(23);
        daughter.career();

    }


    // IMP points
    // We cannot create object of a abstract class directly

    // We can not have a final abstract class
}
