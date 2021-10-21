package com.naman.lecture11BinarySearch;

public class RBS {
    public static void main(String[] args) {
        int[] arr ={5,1,2};
        System.out.println(pivotElement(arr));
    }

    static int pivotElement(int[] nums){
        int start = 0;
        int end = nums.length -1 ;

        while(start<=end){

            int mid = start + (end-start)/2;
            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }

            if (mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            if(nums[mid]>=nums[start]){
                start=mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
    }
}
