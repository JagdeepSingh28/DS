package com.jagdeep.ds.leet;

import java.util.HashMap;
import java.util.Map;

public class _138_copy_list_with_random_pointer {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(7);
        Node l2 = new Node(13);
        Node l3 = new Node(11);
        Node l4 = new Node(10);
        Node l5 = new Node(1);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        l1.random = null;
        l2.random = l1;
        l3.random = l5;
        l4.random = l3;
        l5.random = l1;

        _138_copy_list_with_random_pointer list = new _138_copy_list_with_random_pointer();
        Node result = list.copyRandomList(l1);
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<Node, Node>();

        // loop 1. copy all the nodes
        Node node = head;
        while (node != null) {
            map.put(node, new Node(node.val));
            node = node.next;
        }

        // loop 2. assign next and random pointers
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);
    }
}
