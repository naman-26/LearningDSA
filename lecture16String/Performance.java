package com.naman.lecture16String;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i=0; i<26; i++){
            char ch = (char)('a' +i);
            series = series + ch; // series +=ch
            // new object is creating every time as strings are immutable.
            // therefore, there is lots of memory wastage.
            // and the time complexity becomes O(N^2)
            //therefore, we can use StringBuilder class
        }


        System.out.println(series);
    }
}
