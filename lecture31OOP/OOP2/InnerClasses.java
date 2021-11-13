package com.naman.lecture31OOP.OOP2;

class Test {
    static String name;

    public Test(String name) {
        Test.name = name;
    }
}

class Test2 {
    String name;

    public Test2(String name) {
        this.name = name;
    }
}

public class InnerClasses {

    static class Test1 {
        String name;

        public Test1(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Test a = new Test("naman");
        Test b = new Test("ram");

        System.out.println(a.name);
        System.out.println(b.name);

        Test1 a1 = new Test1("naman");
        Test1 b1 = new Test1("ram");

        System.out.println(a1.name);
        System.out.println(b1.name);

        Test2 a2 = new Test2("naman");
        Test2 b2 = new Test2("ram");

        System.out.println(a2.name);
        System.out.println(b2.name);

    }
}
