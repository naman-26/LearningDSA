package com.naman.lecture32LinkedList.Part1.doublyLinkedList;

public class DLL {

    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        //Empty List
        if ( head != null){
            head.prev = node;
        }

        head = node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);

        if (head == null){
            insertFirst(val);
            return;
        }

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }


    public void insert(int val, int index){
        Node node = new Node(val);

        if (index == 0){
            insertFirst(val);
            return;
        }

        if (index == size-1){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
        }

        node.prev = temp;
        node.next = temp.next;
        (temp.next).prev = node;
        temp.next = node;
        size++;
    }


    public void display(){
        Node temp = head;

        if (head == null){
            System.out.println("Empty Linked List");
            return;
        }

        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public void displayRev(){
        Node temp = head;

        if (head == null){
            System.out.println("Empty List");
            return;
        }

        while (temp.next != null){
            temp = temp.next;
        }

        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }
        System.out.println();

    }



    private class  Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
