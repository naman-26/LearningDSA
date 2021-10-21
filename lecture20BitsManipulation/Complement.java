package com.naman.lecture20BitsManipulation;

// https://leetcode.com/problems/number-complement/submissions/

public class Complement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    static int findComplement(int num) {
        int x=num,y=0;
        while(x!=0)
        {
            x=x>>1;
            y=y<<1;
            y=y+1;

        }

        // a ^ 1 = ~a
        return num^y;
    }
}
