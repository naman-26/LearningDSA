package com.naman.lecture16String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Naman";
        String b = "Naman";

        String name =new String("Hiii");
        String name1 =new String("Hiii");

        // ==
        System.out.println(a==b);

        System.out.println(name==name1);

        System.out.println(name.equals(name1));

        System.out.println(a.replace("a","z"));
    }

}
