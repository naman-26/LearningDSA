package com.naman.lecture32LinkedList.Part2;

// https://leetcode.com/problems/rotate-list/

public class RotateList {

    // Naman's first try
    // without recursion
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null || head.next == null || k==0){
            return head;
        }

        int size = size(head);

        // reduce the repetition of rotation
        k =  k % size ;

        for (int i=0; i<k;i++){
            ListNode tailPrev = head;
            while (tailPrev.next.next != null){
                tailPrev = tailPrev.next;
            }

            // swap
            ListNode temp = head;
            head = tailPrev.next;
            tailPrev.next = null;
            head.next = temp;

        }

        return head;
    }

    public int size(ListNode head){
        ListNode temp = head;
        int size = 0;

        while (temp != null){
            temp = temp.next;
            size++;
        }

        return size;
    }

    // kunal's method
    // FaceBook, Twitter, Google: https://leetcode.com/problems/rotate-list/
    public ListNode rotateRight2(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

}
