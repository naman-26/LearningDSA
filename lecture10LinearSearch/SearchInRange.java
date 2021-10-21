package com.naman.lecture10LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,-12};
        int target =2;
        System.out.println(searchInRange(arr,target,2,9));
    }

    static int searchInRange(int[] arr, int target, int start, int end ){
        if (arr.length == 0){
            return -1;
        }

        // run for the loop
        for(int i =start; i<= end ; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
