package com.jagdeep.ds.linkedlist;

public class MyLinkedList {
	
	Node head;
	Node tail;
	int  size=0;
	final static int ORDERED = -1;
	
	public void addNode(int data,int position){
		
		Node node = new Node(data);
		
		//initially node is blank
		if(head == null && tail == null){
			head = node;
			tail = node;
			size++;
		}else if(position == ORDERED){
			tail.nextNode = node;
			tail=node;
			node.nextNode = null;
			size++;
		}else{
			// If it reaches here that means list is not empty 
			// and should have one node
			
			//insertion in the begining
			if(position == 1){
				node.nextNode = head;
				head = node;
				return;
			}
			Node nodeToFind = findNodeAtPosition(position);
			if(nodeToFind!=null){
				node.nextNode = nodeToFind.nextNode;
				nodeToFind.nextNode = node;
			}	
		}
	}
	
	public boolean deleteAtPosition(int position){
		
		if(size>0){
			
			if(position == 1){
				head = head.nextNode; 
				return true;
			}else if(position<size){
				findNodeAtPosition(position).nextNode = findNodeAtPosition(position).nextNode.nextNode;
				return true;
			}else{
				System.out.println("Position doesn't exist");
			}
		}else{
			System.out.println("Linked List is Empty");
		}
		
		return false;
	}
	
	public boolean deleteNode(Node node){
		return deleteNode(node.data);
	}
	
	public boolean deleteNode(int data){
		
		Node nodeToDelete = new Node(data);
		
		if(size>0){
			Node node = head;
			//if head needs to be deleted
			if(node.data == data){
				head = node.nextNode; 
				return true;	
			}
			
			int i =1;
			while(node!=null){
				if(node.data == nodeToDelete.data){
					findNodeAtPosition(i).nextNode = node.nextNode;
					return true;
				}
				else{
					node = node.nextNode;
				}
				i++;
			}
		}else{
			System.out.println("Linked List is Empty");
		}
		return false;
	}
	   
	//Utility Methods
	
	public Node findNodeAtPosition(int position){
		
		if(size>0){
			Node node = head;
				int i = 1;
			while(node!=null){
				if(i == position-1)
					return node;
				else{
					node = node.nextNode;
					i++;
				}
			}
		}else{
			System.out.println("Linked List is Empty");
		}
		return null;
	}
	
	public void traverseLinkedList(){
		
		if(size>0){
			Node node = head;
				System.out.println(node.data);
			while(node.nextNode!=null){
				node = node.nextNode;
				System.out.println(node.data);
			}
		}else{
			System.out.println("Linked List is Empty");
		}
	}
	
}
