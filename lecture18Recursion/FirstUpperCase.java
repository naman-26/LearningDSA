package com.naman.lecture18Recursion;

// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/

public class FirstUpperCase {
    public static void main(String[] args) {
        String s = "naman";
        System.out.println(firstUpperCase(s,0));
    }

    static char firstUpperCase( String s, int start){
        if(s.charAt(start) >= 'A' && s.charAt(start)<='Z'){
            return s.charAt(start);
        }

        if(start == s.length()-1){
            System.out.println("No upper case letter found");
            return 0;
        }

        return firstUpperCase(s, start+1);
    }

}
