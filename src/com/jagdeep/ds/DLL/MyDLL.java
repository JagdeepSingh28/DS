package com.jagdeep.ds.DLL;

public class MyDLL {

	DLLNode head;
	DLLNode tail;
	int size=0;
	
	public void addNodeInDLL(int data){
		
		DLLNode dllNode = new DLLNode(data);
		
		//Checking for empty List
		if(head==null && tail==null){
			head = dllNode;
			tail = dllNode;
			size++;
		}else{
			tail.nextNode 		= dllNode;
			dllNode.prevNode	=tail;
			tail=dllNode;
			size++;
		}
	}
	
	public void addDLLNodeAtPosition(int position,int data){
		
		DLLNode dllNode = new DLLNode(data);
		if(head==null && tail==null){
			System.out.println("Empty DLL!");
		}else{
			if(position>size)
				System.out.println("Position Out of DLL");
			else{
			DLLNode tempDLL = head;
			for (int i = 1; i <= size; i++) {
				if(i == position){
					dllNode.nextNode = tempDLL.nextNode;
					tempDLL.nextNode = dllNode;
					size++;
					break;
				}
				tempDLL = tempDLL.nextNode; // position at 3
			}
			}
		}
		
	}
	
	public void traverseDLL(){
		if(size>0){
			DLLNode tempDLL = head;
			System.out.println(tempDLL.data);
			for (int i = 1; i < size; i++) {
				tempDLL = tempDLL.nextNode;
				if(tempDLL!=null)
				System.out.println(tempDLL.data);
			}
		}else{
			System.out.println("DLL size cant be less then zero");
		}
	}
	
}
