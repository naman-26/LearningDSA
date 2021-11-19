package com.naman.lecture31OOP.oop5.interfaces.extendDemo2;

public class Main implements A, B {

    @Override
    public void fun() {

    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
