package com.naman.lecture28PermutationRecursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutations("", "abc");

        System.out.println(permutationsCount("", "abc"));

        System.out.println(permutationsReturn("", "abc"));
    }

    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i=0; i<= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }

    }

    static ArrayList<String> permutationsReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i=0; i<= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsReturn(f + ch + s, up.substring(1)));


        }

        return ans;

    }

    static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count =0;

        for (int i=0; i<= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }

        return count;

    }
}
