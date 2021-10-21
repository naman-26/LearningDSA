package com.naman.lecture20BitsManipulation;

// https://leetcode.com/problems/single-number-ii/

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        int a =2;
        System.out.println(~a);
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        // bit manipulation

        // This problem can be translated to:
        //      For every bit position, we cancel any 3-time 1 and 3-time 0 to a 0
        //      Then we need to find equations that fits this: (assume we apply 3 1s)
        //               Zero 1      First 1     Second 1    Third 1
        // seenOnce        0            1           0           0
        // seenTwice       0            0           1           0

        int seenOnce = 0;
        int seenTwice = 0;

        for(int num: nums) {
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }

        return seenOnce;
    }
}
