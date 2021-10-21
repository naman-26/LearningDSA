package com.naman.lecture27RecursionSubsetSubsequenceStringPart1;


import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subSeq1("", "abc"));
        subSeqAscii("","ab");
        System.out.println(subSeqAscii1("","abc"));
    }

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch , up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeq1(String p, String up){
        if( up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeq1(p+ch, up.substring(1));
        ArrayList<String> right = subSeq1(p , up.substring(1));

        left.addAll(right);

        return left;
    }

    static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeqAscii(p + ch , up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
        subSeqAscii(p, up.substring(1));
    }

    static ArrayList<String> subSeqAscii1(String p, String up){
        if( up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSeqAscii1(p+ch, up.substring(1));
        ArrayList<String> second = subSeqAscii1(p , up.substring(1));
        ArrayList<String> third = subSeqAscii1(p+ (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
