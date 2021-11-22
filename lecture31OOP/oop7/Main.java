package com.naman.lecture31OOP.oop7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(22);
        list2.add(45);
        list2.add(2);

        System.out.println(list2);


        // vectors are almost same as ArrayList, vectors are synchronised where as ArrayList are unsynchronised
        // therefore Vectors are slow
        List<Integer> list3 = new Vector<>();
        list3.add(32);
        list3.add(48);
        list3.add(21);

        System.out.println(list3);
    }
}
