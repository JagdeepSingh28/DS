package com.jagdeep.ds.leet;

public class Intersection_of_Two_Linked_Lists_160 {

    static ListNode head1, head2;

    static class ListNode {

        int data;
        ListNode next;

        ListNode(int d)
        {
            data = d;
            next = null;
        }
    }

    /**
     * intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5]
     * @param args
     */
    public static void main(String[] args) {
        Intersection_of_Two_Linked_Lists_160 list = new Intersection_of_Two_Linked_Lists_160();

        // creating first linked list
        list.head1 = new ListNode(3);
        list.head1.next = new ListNode(6);
        list.head1.next.next = new ListNode(9);
        list.head1.next.next.next = new ListNode(15);
        list.head1.next.next.next.next = new ListNode(30);

        // creating second linked list
        list.head2 = new ListNode(10);
        list.head2.next = new ListNode(15);
        list.head2.next.next = new ListNode(30);

        System.out.println("The node of intersection is " + list.getIntersectionNode(list.head1, list.head2));

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            p =  (p != null) ? p.next : headB;
            q =  (q != null) ? q.next : headA;
        }
        return p;
    }

}
