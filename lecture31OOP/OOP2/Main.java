package com.naman.lecture31OOP.OOP2;

public class Main {
    public static void main(String[] args) {
        Human naman = new Human(20, "Naman", 20000, false);
        Human aman = new Human(30, "Aman", 10000, true);
        Human rahul = new Human(22,"Rahul",20000,false);


        System.out.println(Human.population);
        System.out.println(Human.population);

        // error
//        greeting();


        Main funnn = new Main();
        funnn.fun2();

    }

    // not dependent on object
    static void fun(){
        // error
        // we can not use this because fun class requires an instance
        // but the function you are using it in does not depend on instance
//        greeting();



        // you can not access non-static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting(){

        // allowed
        fun();


        System.out.println("Hello world");
    }

    void fun2(){
        // allowed
        greeting();
    }

}
