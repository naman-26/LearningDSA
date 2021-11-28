package com.naman.lecture32LinkedList.Part2;

// https://leetcode.com/problems/reorder-list/

public class Reorder {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }

        ListNode mid = middleNode(head);

        ListNode headSecond = reverseList(mid);
        ListNode headFirst = head;

        // rearrange
        while ( headFirst != null && headSecond != null){
            //swap
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            // second swap
            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        // next of tail to null
        if (headFirst != null){
            headFirst.next = null;
        }
    }

    // https://leetcode.com/problems/middle-of-the-linked-list/submissions/
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    // https://leetcode.com/problems/reverse-linked-list/submissions/
    // google, apple, amazon, microsoft
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}
