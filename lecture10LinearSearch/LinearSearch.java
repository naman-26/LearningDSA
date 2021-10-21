package com.naman.lecture10LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,199,-12,92,-88};
        int target = 8;
        int ans= lineaarSearch(arr,target);
        System.out.println(ans);
    }

    // search in the array: return the index if found
    //otherwise if the item not found return -1
    static int lineaarSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run for the loop
        for(int i =0; i<arr.length ; i++){
            if(arr[i]==target){
                return i;
            }
        }

        // this line will execute if non of the return statements above have executed
        //hence the target not found
        return -1;
    }
}
