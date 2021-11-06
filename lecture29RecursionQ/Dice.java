package com.naman.lecture29RecursionQ;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        diceSum("", 4);
        System.out.println(diceSumReturn("", 4));
        diceSumFace("",4,9);
    }

    static void diceSum(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i<= 6 && i<= target; i++){
            diceSum(p + i, target-i);
        }


    }

    static ArrayList<String> diceSumReturn(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i<= 6 && i<= target; i++){
            list.addAll(diceSumReturn(p + i, target-i));
        }

        return list;


    }


    static void diceSumFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i<= face && i<= target; i++){
            diceSumFace(p + i, target-i , face);
        }


    }
}
