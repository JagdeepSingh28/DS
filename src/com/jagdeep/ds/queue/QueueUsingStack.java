package com.jagdeep.ds.queue;

public class QueueUsingStack {
	
	public static void main(String[] args) {
		
		QueueByStack qStack = new QueueByStack();
		
				
		qStack.push(10);
		qStack.push(20);
		qStack.push(30);
		qStack.push(40);
		qStack.push(50);
		
		System.out.println(qStack.pop() + "");
		System.out.println(qStack.pop() + "");
		System.out.println(qStack.pop() + "");
		System.out.println(qStack.pop() + "");
		System.out.println(qStack.pop() + "");
		
	}

}
