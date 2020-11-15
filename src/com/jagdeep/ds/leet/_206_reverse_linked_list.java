package com.jagdeep.ds.leet;

public class _206_reverse_linked_list {

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
      public int getHash(){
          return this.hashCode();
      }
  }

    public static void main(String[] args) {
        _206_reverse_linked_list reverseLinkedList = new _206_reverse_linked_list();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode listNode = reverseLinkedList.reverseList_(l1);
    }

    public ListNode reverseList_(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = reverseList_(head.next);
        head.next.next = head;
        head.next = null;

        return prev;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = null;

        while(head != null){
            ListNode nextTemp = head.next;
            head.next = newHead;
            newHead = head;
            head = nextTemp;
        }

        return newHead;
    }
}
//1229416514
//2016447921