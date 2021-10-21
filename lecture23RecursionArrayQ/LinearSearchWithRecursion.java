package com.naman.lecture23RecursionArrayQ;

import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {22,6,3,12,6,2};
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(linearS(arr,6,0));
        findAllIndex(arr,6, 0 );
        System.out.println(list);
        System.out.println(findAllIndex(arr, 6, 0, list1));
        System.out.println(findAllIndex2(arr, 6, 0));
    }

    static int linearS(int[] arr, int target, int start){
        if(start == arr.length){
            return -1;
        }

        //base condition
        if(arr[start]== target){
            return start;
        }

        return linearS(arr, target, start+1);
    }

    static ArrayList<Integer> list= new ArrayList<>();
    static void  findAllIndex(int[] arr, int target, int start){
        if(start == arr.length){
            return;
        }

        if(arr[start]== target){
            list.add(start);
        }

        findAllIndex(arr, target, start+1);
    }

    // returning a ArrayList
    static ArrayList findAllIndex(int[] arr, int target, int start, ArrayList<Integer> list) {
        if (start == arr.length) {
            return list;
        }

        if (arr[start] == target) {
            list.add(start);
        }

        return findAllIndex(arr, target, start + 1, list);

    }

    // It is not an optimised method as it create a new array list again and again
    static ArrayList findAllIndex2(int[] arr, int target, int start) {
        ArrayList<Integer> list = new ArrayList<>();

        if (start == arr.length) {
            return list;
        }

        if (arr[start] == target) {
            list.add(start);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, start + 1);

        list.addAll(ansFromBelowCalls);

        return list;

    }
}
