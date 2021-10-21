package com.naman.lecture27RecursionSubsetSubsequenceStringPart1;

public class SkipAString {
    public static void main(String[] args) {
        System.out.println(skip("I Love apple pie"));
    }

    static String skip(String s){
        if (s.isEmpty()){
            return "";
        }


        if(s.startsWith("apple")){
            return skip(s.substring(5));
        }else {
            return s.charAt(0) + skip(s.substring(1));
        }
    }
}
