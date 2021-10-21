package com.naman.lecture16String;

// https://leetcode.com/problems/longest-palindromic-substring/

public class LargestPalindorm {
    public static void main(String[] args) {
        String s= "babad";
        System.out.println(longestPalindrome(s));
        System.out.println(s.substring(1,4));

    }

    static String longestPalindrome(String s) {
        int start=0;
        int maxLength=1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean check ;

                // Check palindrome
                check = palindorme(s,i,j);

                // Palindrome
                if (check && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLength);

    }

    static boolean palindorme(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
