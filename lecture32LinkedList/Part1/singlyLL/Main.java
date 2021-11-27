package com.naman.lecture32LinkedList.Part1.singlyLL;


public class Main {
    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.insertFirst(3);
        list.insertLast(45);
        list.insertLast(88);
        list.insertLast(2);
        list.insertLast(43);

        list.display();

        list.insert(99,2);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.delete(2);
        list.display();

        list.insertLast(45);
        list.insertLast(88);
        list.insertLast(2);
        list.insertLast(43);
        list.display();

        list.insertRec(97,3);
        list.display();
    }
}
