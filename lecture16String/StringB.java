package com.naman.lecture16String;

public class StringB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        // here, builder is mutable, and its value can be changed.

        for (int i=0; i<26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);



    }
}
