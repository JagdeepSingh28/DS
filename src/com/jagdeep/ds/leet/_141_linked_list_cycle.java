package com.jagdeep.ds.leet;

public class _141_linked_list_cycle {

    static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }

        @Override
        public String toString() {
            return val+"";
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(4);

        l1.next = l2; l2.next = l3; l3.next = l4;
        l4.next = l2;

        _141_linked_list_cycle linked_list_cycle = new _141_linked_list_cycle();
        linked_list_cycle.hasCycle(l1);
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
