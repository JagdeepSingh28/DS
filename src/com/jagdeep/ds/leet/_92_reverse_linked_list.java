package com.jagdeep.ds.leet;

public class _92_reverse_linked_list {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    public static void main(String[] args) {
        _92_reverse_linked_list reverse_linked_list = new _92_reverse_linked_list();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode listNode = reverse_linked_list.reverseBetween(l1, 2, 4);
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null){
            return head;
        }

        int counter = 1;
        ListNode curr = head;
        while(head.next != null){
            if(m == counter)
                head.next = reverseList(head,n-m);
            else
                head = head.next;
            counter++;
        }

        return curr;
    }

    private ListNode reverseList(ListNode head, int n){
        ListNode prev = null;
        ListNode curr = head;
        int count = 0;

        while(curr != null && count<=n){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
            count++;
        }

        return prev;
    }
}
