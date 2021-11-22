package com.naman.lecture32LinkedList.Part1.circularLL;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insert(22);
        list.insert(69);
        list.insert(90);
        list.insert(44);
        list.insert(9);
        list.insert(75);

        list.display();

        list.delete(75);
        list.display();
    }
}
