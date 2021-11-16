package com.naman.lecture31OOP.OOP3.inheritance;


public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7, 8.9);
        Box box2 = new Box(box1);

        System.out.println(box1.l + " " + box1.h + " " + box1.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);


        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(1,2,3,40);

        System.out.println(box3.l + " " + box3.h + " " + box3.w + " " + box3.weight);


        Box box5 = new BoxWeight(2,3,4,8);

        System.out.println(box5.h + " " + ((BoxWeight) box5).weight);



        BoxPrice box6 = new BoxPrice();



        Box box7 = new Box();
        //warning
        box7.greeting();

        // correct way
        // as greeting is static method
        Box.greeting();

    }



    // IMP point
    //static method cam\n be inherited but cannot be overridden
}
