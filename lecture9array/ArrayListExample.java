package com.naman.lecture9array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(2);

//        list.add(69);
//        list.add(26);
//        list.add(22);
//        list.add(33);

//        System.out.println(list);

        //input
        for (int i = 0; i < 5; ++i) {
            list.add(in.nextInt());
        }
        
        //output
        System.out.println(list);


    }
}
