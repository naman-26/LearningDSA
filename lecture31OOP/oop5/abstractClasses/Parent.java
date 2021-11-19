package com.naman.lecture31OOP.oop5.abstractClasses;

public abstract class Parent {
    int age;

    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 2222222;
    }

    static void hello(){
        System.out.println("Hey ");
    }

    void normal(){
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
