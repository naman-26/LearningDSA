package com.naman.lecture31OOP.oop5.interfaces.extendDemo2;

public interface A {
    //static interface methods should always have a body
    // call by the interface name
    static void greeting(){
        System.out.println("Hey I am a static method");
    }
    void fun();
}
