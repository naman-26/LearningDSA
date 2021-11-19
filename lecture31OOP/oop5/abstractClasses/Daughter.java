package com.naman.lecture31OOP.oop5.abstractClasses;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Footballer");
    }

    @Override
    void partner() {
        System.out.println("I love N, his age is 20");
    }
}
