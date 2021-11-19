package com.naman.lecture31OOP.oop3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
    }



    // IMP points
    // we cannot override a method with final keyword.
    // final keyword can be also used to prevent inheritance


}
