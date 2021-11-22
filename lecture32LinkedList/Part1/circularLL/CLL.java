package com.naman.lecture32LinkedList.Part1.circularLL;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);

        if (head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }


    public void delete(int val){
        Node temp = head;

        if (temp == null){
            return;
        }

        if (temp.value == val){
            head = head.next;
            tail.next = head;
            return;
        }


        do {
            if (temp.next == tail){
                if (temp.next.value == val){
                    temp.next = head;
                    tail = temp;
                    return;
                }
            }

            if (temp.next.value == val){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }while (temp != head);
    }

    public void display(){
        Node temp = head;

        if (head == null){
            System.out.println("Empty List");
            return;
        }

        while (temp != tail){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.print(temp.value);
        System.out.println();
    }

    private class Node{

         int value;
         Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
