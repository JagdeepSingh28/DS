package com.jagdeep.ds.leet;

public class MergeList_21 {

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(6);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

//        mergeTwoLists(head1, head2);
    }

//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(-1);
//        ListNode head = dummy;
//        while(l1.next != null || l2.next != null){
//            if(l1.val > l2.val){
//
//            }
//        }
//    }
}
