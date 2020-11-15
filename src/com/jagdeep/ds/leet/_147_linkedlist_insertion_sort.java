package com.jagdeep.ds.leet;

public class _147_linkedlist_insertion_sort {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return ""+val;
        }
    }

    public static void main(String[] args) {
//        4->2->1->3
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode listNode = insertionSortList(l1);
    }

    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;

        while (head != null) {
            ListNode temp = head.next;

        /* Before insert, the prev is at the last node of the sorted list.
           Only the last node's value is larger than the current inserting node
           should we move the temp back to the head*/
            if (prev.val >= head.val) prev = dummy;

            while (prev.next != null && prev.next.val < head.val) {
                prev = prev.next;
            }

            head.next = prev.next;
            prev.next = head;
            // prev = dummy; // Don't set prev to the head of the list after insert
            head = temp;
        }
        return dummy.next;
    }
}
