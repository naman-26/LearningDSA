package com.naman.lecture18Recursion;


//https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/


public class LengthOfString {
    public static void main(String[] args) {
        String s = "absd";
        System.out.println(lengthOfString(s));
    }

    static int lengthOfString(String s){
        //base condition
        if(s.equals("")){
            return 0;
        }

        return lengthOfString(s.substring(1)) + 1;
    }
}
