package com.naman.lecture16String;

// https://leetcode.com/problems/implement-strstr/

public class IndexOfFunction {
    public static void main(String[] args) {
        String h = "hello";
        String n = "ll";
        System.out.println(strStr(h,n));
    }

    static int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int i =0;
        while(i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(needle.equals(haystack.substring(i, i + needle.length()))){
                    return i;
                }
                i++;
            }else{
                i++;
            }
        }

        return -1;
    }
}
