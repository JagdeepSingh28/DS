package com.jagdeep.ds.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyLinkedList myLinkedList = new MyLinkedList();
			
			myLinkedList.addNode(10,MyLinkedList.ORDERED);
			myLinkedList.addNode(15,MyLinkedList.ORDERED);
			myLinkedList.addNode(20,MyLinkedList.ORDERED);
			myLinkedList.addNode(30,MyLinkedList.ORDERED);
			myLinkedList.addNode(50,4);
			
//			myLinkedList.traverseLinkedList();
			
//			myLinkedList.deleteNode(new Node(50));
			myLinkedList.deleteAtPosition(6);
			
			myLinkedList.traverseLinkedList();
	}

}
