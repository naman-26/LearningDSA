package com.naman.lecture31OOP.oop3.inheritance;

public class Box {
    double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("I am in box class");
    }

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old .w;
    }

    public  void information() {
        System.out.println("Running the box");
    }
}
