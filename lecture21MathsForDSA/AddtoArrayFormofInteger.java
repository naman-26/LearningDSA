package com.naman.lecture21MathsForDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/submissions/

public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        List<Integer> ans = addToArrayForm(num,34);
        System.out.println( ans );
    }

    static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();

        int e= num.length-1;
        int carry = 0;
        while(e>=0 || k!=0 || carry !=0){
            int A=0;
            if(e>=0){
                A= num[e];
            }

            int B = 0;
            if(k!= 0){
                B = k%10 ;
            }

            ans.add((A+B+carry)%10);
            carry = (A+B+carry)/10;
            e--;
            k = k/10;
        }

        Collections.reverse(ans);
        return ans;
    }
}
