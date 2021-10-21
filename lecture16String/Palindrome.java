package com.naman.lecture16String;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Naman";
        System.out.println(checkPalindrome(name));
        System.out.println(checkPalindrome("abba"));
        System.out.println(checkPalindrome("ababab"));
        System.out.println(checkPalindrome(null));
        System.out.println(checkPalindrome(""));

    }

    static boolean checkPalindrome(String a){
        if(a == null || a.length()==0 ){
            return true;
        }

        a=a.toLowerCase();
        int start =0;
        int end = a.length()-1;

        while (end>=start){
            if(a.charAt(start)!= a.charAt(end)){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
