package com.naman.lecture11BinarySearch;

public class SplitArrayQ {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(splitArray(arr,1));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end= 0;

        for (int i = 0; i <= nums.length -1; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain max it
            end +=nums[i]; // sum of all elements
        }

        // binary search
        while(start < end){
            // try for the middle as potential ans
            int mid = start + (end-start)/2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum+num > mid){
                    // you cannot add this in this subarray, make a new one
                    // say you add this num in new subarray, then sum =num
                    sum = num;
                    pieces++;
                }else{
                    sum +=num;
                }
            }

            if(pieces > m){
                start=mid+1;
            }else{
                end=mid;
            }
        }

        return start; // here start==end
    }
}
