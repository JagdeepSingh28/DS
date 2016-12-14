package com.jagdeep.ds.DLL;

public class DLLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDLL myDLL = new MyDLL();
		myDLL.addNodeInDLL(10);
		myDLL.addNodeInDLL(20);
		myDLL.addNodeInDLL(25);
		myDLL.addNodeInDLL(30);
		myDLL.addNodeInDLL(50);
		
		myDLL.traverseDLL();
		myDLL.addDLLNodeAtPosition(4, 99);
	}

}
