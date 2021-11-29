package com.naman.lecture32LinkedList.Part2;

// https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/

public class KAltReverse {
    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }


        // skip the first nodes
        ListNode current = head;
        ListNode prev = null;

        while (current != null){

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


            if (last != null){
                last.next = prev;
            }else {
                head = prev;
            }

            newEnd.next = current;

            // skip the k nodes
            for (int i =0; i < k && current != null; i++){
                prev = current;
                current= current.next;
            }

        }


        return head;
    }
}
