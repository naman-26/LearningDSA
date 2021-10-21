package com.naman.lecture18Recursion;

// https://leetcode.com/problems/k-th-symbol-in-grammar/submissions/

public class KthSymbolInGrammar {
    public static void main(String[] args) {
        System.out.println(kthGrammar(30 ,434991989));
    }


    // Exceed Memory limit, for n=30
    static int kthGrammar(int n, int k) {
        String s = nthOfTable(n,"0", 1);

        return (s.charAt(k-1) - '0');

    }


    static String nthOfTable(int n, String s, int a){
        if(a == n){
            return s;
        }

        return nthOfTable(n, createString(a+1,s), a+1);
    }

    static String createString(int n, String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if( c == '0'){
                sb.append('0');
                sb.append('1');
            }else{
                sb.append('1');
                sb.append('0');
            }
        }

        return sb.toString();

    }
}
