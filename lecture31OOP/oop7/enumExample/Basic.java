package com.naman.lecture31OOP.oop7.enumExample;


// we can not create objects of enum, they have fixed group of objects
public class Basic {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // by default - public, static and final
        // since its final, we can not create enums
        // type is Week


        Week() {
            System.out.println("Constructor called for: " + this);
        }

        @Override
        public void hello() {
            System.out.println("heyyyyyyyyyyyyyy");
        }




        // this is not public ore protected, only private or default
        // Why? we do not want to create new objects
        // this is not the enum concept, thats why



        // internally : public static final Week Monday = new Week();

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        week.hello();

        for (Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(week);

        System.out.println(week.ordinal());

        System.out.println(Week.valueOf("Tuesday"));
    }
}
