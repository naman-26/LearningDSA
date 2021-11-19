package com.naman.lecture31OOP.intoduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        // Wrapper class
        Integer num = 22;
        Integer num2 = 26;

        swap(a,b);
        swapWrapper(num, num2);

        System.out.println( a + " " + b);
        System.out.println( num + " " + num2);

        // a and b value does not change, as the java function are pass by value
        // num and num2 value does not change, due to final keyword in Integer class

        // we can not modify the variable(primitive) with final keyword
        final int bonus = 2;
        // as we cannot modify final keyword variable, so need to initialize while declaring


        // when a non primitive is final, you cannot reassign it, but can change the value
        final A naman = new A("naman agrawal");

        // allowed
        naman.name = "other name";

        // not allowed
        //naman = new Human("new object");

        A obj;
        for (int i =0; i<100000; i++){
            obj = new A("Random name");
        }

    }

    private static void swapWrapper(Integer num, Integer num2) {
        Integer temp = num;
        num = num2;
        num2 = temp;

    }

    private static void swap(int a, int b) {
        int temp = a;
        a =b;
        b = temp;
    }

}

class A {
    final int n = 1;
    String name ;

    public A(String name) {
        System.out.println("Object created");
        this.name = name;
    }


    // in java we do not have destructor, as garbage collection is done by java itself(on its own will)

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
