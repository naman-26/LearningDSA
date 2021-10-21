package com.naman.lecture27RecursionSubsetSubsequenceStringPart1;

// Print a String without 'a'.

public class SkipACharacter {
    public static void main(String[] args) {
        String s = "abcaaaadaf";
        System.out.println(skipA(s, "", 0));
        System.out.println(skip(s));
    }

    static String skipA(String s1, String s2, int index ){
        if( index == s1.length()){
            return s2;
        }

        if(s1.charAt(index) == 'a' || s1.charAt(index) == 'A'){
            return skipA(s1, s2, index+1);
        }else {
            return skipA(s1, s2+s1.charAt(index), index+1 );
        }
    }

    static String skip(String s){
        if(s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if (ch == 'a'){
            return skip(s.substring(1));
        }else {
            return ch + skip(s.substring(1));
        }
    }
}
