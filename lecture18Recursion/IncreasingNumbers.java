package com.naman.lecture18Recursion;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1/?category[]=Recursion#

public class IncreasingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> ans = increasingNumbers(2);

        System.out.println(ans);
    }

    static ArrayList<Integer> increasingNumbers(int N ){
        ArrayList<Integer> ans = new ArrayList<>();
        if(N == 1){
            ans.add(0);
        }
        recursion(N, ans, 1, 0);
        return ans;
    }

    static void recursion(int N,  ArrayList<Integer> ans, int start, int num){
        if(N == 0){
            ans.add(num);
            return;
        }

        for (int i = start; i<=9; i++){
            recursion(N-1, ans, i+1, (10*num)+i );
        }
    }
}
