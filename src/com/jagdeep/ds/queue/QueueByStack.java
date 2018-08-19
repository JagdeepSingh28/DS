package com.jagdeep.ds.queue;

import java.util.Stack;

public class QueueByStack {

	Stack<Integer>  tempStack = new Stack();
	Stack<Integer>	value	  = new Stack();
	
	
	public void push(int x){
		while(!value.isEmpty()){
			tempStack.push(value.pop());
		}
		tempStack.push(x);
		
		while(!tempStack.isEmpty()){
			value.push(tempStack.pop());
		}
	}
	
	public int pop(){
		return value.pop();
	}
	
}
