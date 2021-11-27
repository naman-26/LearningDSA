package com.naman.lecture32LinkedList.Part2;

// https://leetcode.com/problems/linked-list-cycle/

public class CycleQ {

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // find the length of cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    length++;
                    slow = slow.next;
                }while (temp != slow);
                return length;
            }
        }

        return 0;
    }

    // check the presence of cycle in LL
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }

        return false;
    }


    public ListNode detectCycle(ListNode head) {
        int length = 0;

        // check the presence of cycle
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                length = lengthCycle(head);
                break;
            }
        }

        // no cycle present
        if (length == 0){
            return null;
        }

        // find the start
        ListNode f = head;
        ListNode s = head;

        while (length > 0){
            s = s.next;
            length--;
        }

        // keep moving both forward and the will meet and cycle start
        while (f != s){
            s = s.next;
            f = f.next;
        }

        return s;
    }
}
