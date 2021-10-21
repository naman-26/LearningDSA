package com.naman.lecture10LinearSearch;
import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/


public class IntersectionOfArray2 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result= intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));

    }

     static int[] intersect(int[] nums1, int[] nums2) {
         ArrayList<Integer> arr = new ArrayList<>();

         Arrays.sort(nums1);
         Arrays.sort(nums2);

         int i=0;
         int j=0;
         while(i<nums1.length && j<nums2.length)
         {
             if(nums1[i]==nums2[j])
             {
                 arr.add(nums1[i]);
                 i++;
                 j++;
             }
             else if(nums1[i]<nums2[j])
                 i++;
             else
                 j++;
         }


         //converting arraylist to arr[]
         int[] result = new int[arr.size()];
         for(i = 0; i< result.length; i++){
             result[i]=arr.get(i);
         }

         return result;
     }
}
