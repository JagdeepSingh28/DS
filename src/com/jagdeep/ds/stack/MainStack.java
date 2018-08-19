package com.jagdeep.ds.stack;

/**
 * Created by JagdeepSingh on 20-09-2016.
 */
public class MainStack {

    public static void main(String[] arg) {

        MyStack<Character> myStack = new MyStack<Character>(7);

//            myStack.push('[');
//            myStack.push('{');
//            myStack.push('(');
//            myStack.push('a');
//            myStack.push(')');
//            myStack.push('}');
//            myStack.push(']');

            
            
//        myStack.traverseStack();
        
        myStack.postFixEvaluation("123*+5-");

    }

}
