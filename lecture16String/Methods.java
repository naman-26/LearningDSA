package com.naman.lecture16String;

import com.naman.lecture9array.Array;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Naman Agrawal, Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());

        System.out.println(name.indexOf('a'));

        System.out.println(name.lastIndexOf('a'));


        System.out.println(Arrays.toString(name.split(" ")));

        System.out.println(name.indexOf("Naman"));

        System.out.println(name.substring(1,4));

    }
}
