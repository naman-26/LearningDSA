package com.naman.lecture15CyclicSort;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class MissingValues {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        //cyclic sort
        int i =0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]){
                //swap
                int temp= nums[i];
                nums[i] = nums[correct];
                nums[correct]= temp;
            }else {
                i++;
            }
        }
        
        // finding missing values
        for ( int index = 0; index< nums.length; index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
}