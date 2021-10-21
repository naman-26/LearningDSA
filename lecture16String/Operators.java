package com.naman.lecture16String;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //adding by ASCII value

        System.out.println("a" + "b"); // concat

        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer(wrapper class) that will call toString()

        System.out.println("Naman" + new ArrayList<>());
        System.out.println("Naman" + new Integer(26));
    }
}
