package com.jagdeep.ds.leet;

public class OddEvenLinkedList_328 {

  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  public static void main(String[] args) {
      ListNode l1 = new ListNode(2);
      ListNode l2 = new ListNode(1);
      l1.next = l2;
      ListNode l3 = new ListNode(3);
      l2.next = l3;
      ListNode l4 = new ListNode(5);
      l3.next = l4;
      ListNode l5 = new ListNode(6);
      l4.next = l5;
      ListNode l6 = new ListNode(4);
      l5.next = l6;
      ListNode l7 = new ListNode(7);
      l6.next = l7;

      oddEvenList(l1);
  }
//    Input: 2->1->3->5->6->4->7->NULL
//    Output: 2->3->6->7->1->5->4->NULL

    public static ListNode oddEvenList(ListNode head) {
        ListNode pOdd = new ListNode(0);
        ListNode pEven = new ListNode(0);
        ListNode p = head;
        ListNode p1 = pOdd;
        ListNode p2 = pEven;
        if (head == null || head.next == null) {
            return head;
        }
        while (p != null) {
            pOdd.next = p;
            pOdd = pOdd.next;
            if (p.next != null) {
                pEven.next = p.next;
                pEven = pEven.next;
                p = p.next.next;
            } else {
                pEven.next = null;
                break;
            }
        }
        pOdd.next = p2.next;
        return p1.next;
    }
}
