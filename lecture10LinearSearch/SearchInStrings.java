package com.naman.lecture10LinearSearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Naman";
        char target = 'a';
        System.out.println(search(str,target));

        //printing the array : which is a string that is converted to an array
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search(String str, char target){
        if(str.length()==0) {
            return false;
        }

        for (int i =0; i< str.length(); i++){
            if ( target == str.charAt(i))
                return true;
        }

        return false;
    }



    static boolean search2(String str, char target){
        if(str.length()==0) {
            return false;
        }

        //using for each loop
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return false;
            }
        }
        return false;
    }
}
