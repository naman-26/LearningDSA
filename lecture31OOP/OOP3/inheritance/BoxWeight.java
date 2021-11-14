package com.naman.lecture31OOP.OOP3.inheritance;

public class BoxWeight extends Box {
    double weight;


    public BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        // super() is used to initialise values present in the parent class
        this.weight = weight;
    }
}
