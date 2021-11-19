package com.naman.lecture31OOP.oop6;

import java.net.InterfaceAddress;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i * 2);
        }


        arr.forEach((item) -> {
            System.out.println(item * 3);
        });

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);


        Operation sum = (a,b) -> a+b;
        Operation pro = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;
        Operation div = (a,b) -> a/b;



        LambdaFunction fun1 = new LambdaFunction();
        System.out.println(fun1.op(4,6,sum));
        System.out.println(fun1.op(3,2,pro));
        System.out.println(fun1.op(55,6,sub));
        System.out.println(fun1.op(49,69,div));


    }

    private int op(int a, int b, Operation o){
        return o.operate(a,b);
    }
}

interface Operation {
    int operate(int a, int b);
}
