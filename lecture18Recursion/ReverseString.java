package com.naman.lecture18Recursion;

import java.util.Arrays;


// https://leetcode.com/problems/reverse-string/


public class ReverseString {
    public static void main(String[] args) {
        char[] s ={'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverseStringRecursion(s,0,s.length-1)));
    }

    static char[] reverseStringRecursion(char[] s, int start, int end){
        if(start>=end){
            return s;
        }

        char temp= s[start];
        s[start]=s[end];
        s[end]=temp;

        return reverseStringRecursion(s,start+1, end-1);
    }
}
