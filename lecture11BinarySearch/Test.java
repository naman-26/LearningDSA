package com.naman.lecture11BinarySearch;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(bestMatch(nums, 9));

    }

    static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int[] diff= new int[nums1.length];
        int index=-1;
        int maxDiff= 0;
        long sum =0;


        for(int i=0; i<nums1.length; i++){
            diff[i]= Math.abs(nums1[i]-nums2[i]);

            if(maxDiff < diff[i]){
                maxDiff= diff[i];
                index=i;
            }
        }
        System.out.println(maxDiff);
        if(maxDiff==0){
            return 0;
        }

        Arrays.sort(nums1);
        diff[index] = bestMatch(nums1,nums2[index]);
        System.out.println(diff[index]);

        for(int i=0; i<nums1.length; i++){
            sum += diff[i];

        }

        return (int)sum;
    }

    static int bestMatch(int[] nums, int number){
        int start =0;
        int end = nums.length-1;
        int ans=Integer.MAX_VALUE ;
        int small=-1, big=-1;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(nums[mid]==number){
                return 0;
            }else if( nums[mid] < number ){
                small=mid;
                start=mid+1;

            }else{
                end=mid-1;
            }
        }

        if(small!=-1){
            ans= Math.abs(nums[small]-number);
        }

        if(big!=-1){
            ans= Math.min(ans, Math.abs(nums[big]-number));
        }
        return ans;
    }
}
