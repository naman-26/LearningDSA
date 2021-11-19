package com.naman.lecture16String;

// https://leetcode.com/problems/valid-palindrome/submissions/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Human man, a plan, a canal: Panama"));
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start=0;
        int end= s.length()-1;

        while(start<end){
            char charAtLow = s.charAt(start);
            char charAtHigh = s.charAt(end);
            if( !(charAtLow >= 'a' && charAtLow <= 'z' || charAtLow >= '0' && charAtLow <= '9') ){
                start++;
            }else if ( !(charAtHigh >= 'a' && charAtHigh <= 'z' || charAtHigh >= '0' && charAtHigh <= '9') ){
                end--;
            }else if (charAtLow!=charAtHigh){
                return false;
            }else {
                start++;
                end--;
            }
        }

        return true;
    }

}
