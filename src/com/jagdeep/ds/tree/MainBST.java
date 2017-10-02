package com.jagdeep.ds.tree;

import java.util.TreeMap;

public class MainBST {

	public static void main(String[] args) {

		MyBST myBST = new MyBST();
//		myBST.insert(1);
//		myBST.insert(2);
//		myBST.insert(3);
//		myBST.insert(4);
//		myBST.insert(5);
		
		myBST.rootNode = new TNode(1);
		myBST.rootNode.left = new TNode(2);
		myBST.rootNode.right = new TNode(3);
		myBST.rootNode.left.left = new TNode(4);
		myBST.rootNode.left.right = new TNode(5);
		
		System.out.println("IN  ORDER");
		myBST.inOrder();  // ---> OUTPUT 4 2 5 1 3 
		System.out.println("\nPRE ORDER");
		myBST.preOrder(); // ---> OUTPUT 1 2 4 5 3 
		System.out.println("\nPOST ORDER");
		myBST.postOrder(); // --> OUTPUT 4 5 2 3 1
		System.out.println("\n");
		
		
		myBST.serachNode(45);
		myBST.serachNode(100);
		
	}
	
}
