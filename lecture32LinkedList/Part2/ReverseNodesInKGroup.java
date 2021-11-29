package com.naman.lecture32LinkedList.Part2;

// https://leetcode.com/problems/reverse-nodes-in-k-group/

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }

        int sizeAfterKGroup = size(head);

        // skip the first nodes
        ListNode current = head;
        ListNode prev = null;

        while (true){

            // do not reverse the rest of nodes
            if (k > sizeAfterKGroup){
                break;
            }

            ListNode last = prev;
            ListNode newEnd = current;

            // reverse till k
            ListNode next = current.next;
            for (int i = 0; current != null && i< k; i++){
                current.next = prev;
                prev = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
            }

            sizeAfterKGroup -= k;


            if (last != null){
                last.next = prev;
            }else {
                head = prev;
            }

            newEnd.next = current;

            if (current == null){
                break;
            }

            prev = newEnd;
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
}
