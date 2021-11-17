package com.naman.lecture31OOP.OOP4;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(33,"aaa");

        // name is a protected variable
        System.out.println(obj.name);

        // num is private variable
        // therefore use getNum method
        System.out.println(obj.getNum());


        System.out.println(obj instanceof A);
        System.out.println(obj.getClass());
    }
}

class SubSubClass extends SubClass{
    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(35,"bbaaa");

        // name is a protected variable
        System.out.println(obj.name);

        // num is private variable
        // therefore use getNum method
        System.out.println(obj.getNum());
    }

}
