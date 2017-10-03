package com.jagdeep.ds.tree;

public class TNode {
	int key;
	TNode left;
	TNode right;

	// constructor
	public TNode(int key){
		this.key = key;
		left = right = null;
	}
}
