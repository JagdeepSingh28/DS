package com.jagdeep.ds.tree;

public class MyBST {

	TNode rootNode;
	
	MyBST(){
		rootNode = null;
	}
	
	public void insert(int data){
		rootNode = insertItem(rootNode, data);
	}
	
	public TNode insertItem(TNode rootNode, int data){
		
		if(rootNode == null){
			rootNode = new TNode(data);
			return rootNode;
		}
		
		if(data<rootNode.key){
			rootNode.left = insertItem(rootNode.left, data);
		}else if(data>rootNode.key){
			rootNode.right = insertItem(rootNode.right,data);
		}
		
		return rootNode;
	}
	
	/**
	 * IN ORDER
	 */
	public void inOrder(){
		inOrderBST(rootNode);
	}
	
	public void inOrderBST(TNode root){
		if(root != null){
			inOrderBST(root.left);
			System.out.print(root.key);
			inOrderBST(root.right);
		}
	}
	
	/**
	 * PRE ORDER
	 */
	public void preOrder(){
		preOrderBST(rootNode);
	}
	
	public void preOrderBST(TNode root){
		if(root != null){
			System.out.print(root.key);
			preOrderBST(root.left);
			preOrderBST(root.right);
		}
	}
	
	/**
	 * POST ORDER
	 */
	public void postOrder(){
		postOrderBST(rootNode);
	}
	
	public void postOrderBST(TNode root){
		if(root != null){
			postOrderBST(root.left);
			postOrderBST(root.right);
			System.out.print(root.key);
		}
	}
	
	public void serachNode(int data){
		TNode sTNode = searchNodeInBST(rootNode,data);
		if(sTNode == null)
			System.out.println("KEY NOT FOUND");
		else
			System.out.println(sTNode.key + " Is Present ");
	}
	
	public TNode searchNodeInBST(TNode rootNode,int data){
		
		if(rootNode == null || rootNode.key == data){
			return rootNode;
		}else if(data<rootNode.key){
			return searchNodeInBST(rootNode.left,data);
		}else if(data>rootNode.key)
			return searchNodeInBST(rootNode.right,data);
		else 
			return null;
	}
}
