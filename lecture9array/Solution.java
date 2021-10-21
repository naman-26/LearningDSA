package com.naman.lecture9array;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        int[] nums={0,2,1,-3};
        System.out.println(threeSumClosest(nums,1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans= nums[0]+nums[nums.length-2]+nums[nums.length-1];

        for(int i=0; i< nums.length-2; i++){
            int j= nums.length-1;
            while (j > 1) {
                if(Math.abs((nums[i]+nums[j]+nums[j-1])-target) < Math.abs(ans-target)){
                    // possible ans
                    ans=nums[i]+nums[j]+nums[j-1];
                }
                j--;
            }
        }

        return ans;
    }
}