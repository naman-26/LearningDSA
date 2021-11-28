package com.naman.lecture32LinkedList.Part1.singlyLL;

public class CustomLL {

    private Node head;
    private Node tail;

    private int size;

    public CustomLL() {
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size +=1;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size += 1;
    }

    public void insert(int val, int index){

        if (index == 0){
            insertFirst(val);
            return;
        }

        if (index == size){
            insertLast(val);
            return;
        }


        Node temp = head;


        for (int i = 1; i< index ; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size +=1;
    }

    // insert using recursion
    public void insertRec(int val, int index){
        head = insertPec(val, index, head);
    }
    private Node insertPec(int value, int index, Node node){
        if (index == 0){
            Node temp = new Node(value);
            temp.next = node;
            size++;
            return temp;
        }

        node.next = insertPec(value,index-1, node.next);

        return node;
    }


    public void deleteFirst(){
        if (head == null){
            System.out.println("Can't delete, Empty List");
            return;
        }

        if (head.next == null){
            System.out.println("Deleted the value: " + head.value +" ,the list is empty now.");
            head = null;
            tail = null;
            size = 0;
            return;
        }

        head = head.next;
        size -= 1;
    }


    public void deleteLast(){

        // Empty list
        if (head == null){
            System.out.println("Can't delete, Empty List");
            return;
        }

        // List with just one element
        if (head.next == null){
            deleteFirst();
            return;
        }

        Node temp = head;

        while (temp.next != tail){
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
    }

    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }

        if (index == size -1){
            deleteLast();
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++){
            temp = temp.next;
        }

//        Node deleteNext = (temp.next).next;
//        temp.next = deleteNext;
        // can also be return as
        temp.next = (temp.next).next;

        size--;
    }


    // recursion reverse
    private void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    // in place reverse of list(Part 2 video)
    // https://leetcode.com/problems/reverse-linked-list/
    public void reverse(){
        if (size < 2){
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if ( next != null){
                next = next.next;
            }
        }

        head = prev;
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

    public int returnIndex(int value){
        Node temp = head;

        for (int i = 0; i < size; i++){
            if (temp.value == value){
                return i;
            }
            temp = temp.next;
        }

        // Value not found
        return -1;
    }

    public Node find(int value){
        Node temp = head;
        while (temp !=null){
            if (temp.value == value){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
