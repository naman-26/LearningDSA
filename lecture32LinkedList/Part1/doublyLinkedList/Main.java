package com.naman.lecture32LinkedList.Part1.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(22);
        list.insertFirst(2);
        list.insertFirst(16);
        list.insertFirst(23);
        list.insertFirst(90);
        list.insertFirst(34);
        list.insertFirst(9);
        list.display();

        list.displayRev();

        list.insertLast(48);
        list.insertLast(85);
        list.display();

        list.insert(26,7);
        list.display();
    }
}
