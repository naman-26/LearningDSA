package com.naman.lecture23RecursionArrayQ;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,10,3,5};
        System.out.println(isStorted(arr,0));
    }

    static boolean isStorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && isStorted(arr, index+1);
    }
}
