package com.jagdeep.ds.stack;

/**
 * Created by JagdeepSingh on 20-09-2016.
 */
public class MyStack<T> {

    int size;
    Object stack[];
    int top;
    int DEFAULT_CAPACITY = 10;

    MyStack(int size){
        this.size = size;
        stack = new Object[size];
        top = -1;
    }

    public void push(T e) {
        if(!isOverFlow())
            stack[++top] = e;
        else
            System.out.println("Push Not working Anymore");
    }

    public T pop() {
        if(!isEmpty()){
        	int t = top--;
        	return (T)stack[t];
        }
        else
            System.out.println("POP Not working Anymore");
        
        return null;
    }
    
    public T peek(){
    	if(isEmpty())
    		return null;
    	return (T)stack[top];
    }

    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }

    public boolean isOverFlow(){
        if(top == size-1)
            return true;
        return false;
    }

    int getSize(){
        return top+1;
    }

    public void traverseStack(){
        for (int i =0; i<getSize() ; i++) {
            System.out.println(stack[i]);
        }
    }

    /**
     * Checking balance symbols
     */
    public void isValidSymbolBalance(String s){
    	MyStack<Character> myStack = new MyStack<>(s.length());
    	
    	System.out.println("Symbol Entered by the user is"+s);
    	
    	for (int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == '}'){
    			if(!myStack.isEmpty() && myStack.peek() == '{'){
    				myStack.pop();
    			}
    		}
    		else if(s.charAt(i) == ']'){
    			if(!myStack.isEmpty() && myStack.peek() == '['){
    				myStack.pop();
    			}
    		}
    		else if(s.charAt(i) == ')'){
    			if(!myStack.isEmpty() && myStack.peek() == '('){
    				myStack.pop();
    			}
    		}
    		else{
    			myStack.push(s.charAt(i));
    		}
		}	
    	
    	if(myStack.isEmpty())
			System.out.println("The symbol is perfectly balanced");
		else
			System.out.println("The symbol is not balanced");
    }
    
    public void postFixEvaluation(String s){
    	MyStack<Integer> mS = new MyStack<>(s.length());
    	String[] ary = s.split("");
    	
    	System.out.println("Symbol Entered by the user is"+s);
    	
    	for (int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == '+'){
    			int i1 = mS.pop();
    			int i2 = mS.pop();
    			mS.push(i1+i2);
    		}
    		else if(s.charAt(i) == '-'){
    			int i1 = mS.pop();
    			int i2 = mS.pop();
    			mS.push(Math.abs(i1-i2));
    		}
    		else if(s.charAt(i) == '*'){
    			int i1 = mS.pop();
    			int i2 = mS.pop();
    			mS.push(i1*i2);
    		}
    		else if(s.charAt(i) == '/'){
    			int i1 = mS.pop();
    			int i2 = mS.pop();
    			mS.push(i1/i2);
    		}
    		else{
    			mS.push(Integer.parseInt(ary[i]));
    		}
		}	
    	
    	if(!mS.isEmpty() &&  mS.getSize() == 1)
			System.out.println("The Result is" + mS.peek());
		else
			System.out.println("Not able to get the result");
    }


}
