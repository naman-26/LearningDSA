package com.naman.lecture31OOP.oop5.abstractClasses;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a artist");
    }

    @Override
    void partner() {
        System.out.println("I love D,her age is 21");
    }
}
