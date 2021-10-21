package com.naman.lecture11BinarySearch;

public class RBSForDuplicateNumber {
    public static void main(String[] args) {
        int[] arr ={1,1,3};
        System.out.println(pivotElementWithDuplication(arr));
    }

    static int pivotElementWithDuplication(int[] nums){
        int start = 0;
        int end = nums.length -1 ;

        //for single value array
        if(end==0){
            return end;
        }
        while(start<=end){

            int mid = start + (end-start)/2;

            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }

            if (mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplictes
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                //skip the duplicates
                //Note: what if these elements at the start and end were the pivot??
                //check if start is pivot

                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;

                // check weather end is pivot
                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(nums[start] < nums[mid] || (nums[mid]== nums[start] && nums[mid] > nums[end])){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
