package com.naman.lecture16String;

public class ValidPrantheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s){
        int i=1;
        StringBuilder str = new StringBuilder(s);

        while(str.length()>1){
            if((str.charAt(i) == ')' && str.charAt(i-1) == '(') || (str.charAt(i) == '}' && str.charAt(i-1) == '{') || (str.charAt(i) == ']' && str.charAt(i-1) == '[')){
                str.deleteCharAt(i);
                str.deleteCharAt(i-1);
                i=1;
            }else{
                i++;
            }
        }

        if(str.length()==0){
            return true;
        }

        return false;
    }
}
