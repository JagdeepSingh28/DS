package com.jagdeep.ds.tree;

import com.jagdeep.ds.Utils.Utils;

import java.util.Stack;

public class PreOrderIterativeTraversal {

    private static TNode root;

    public static void main(String[] arg){
        createTree();
//        preOrderIterativeTraversal(root);
        inOrderIterativeTraversal(root);
        inOrderBST(root);
    }

    private static void preOrderIterativeTraversal(TNode root) {
        if(root == null)
            return;
        Stack<TNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TNode tNode = stack.pop();
            Utils.print(tNode.key);
            if(tNode.right!=null)
                stack.push(tNode.right);
            if(tNode.left!=null)
                stack.push(tNode.left);
        }
    }

    public static void inOrderBST(TNode root){
        if(root != null){
            inOrderBST(root.left);
            System.out.print(root.key);
            inOrderBST(root.right);
        }
    }

    private static void inOrderIterativeTraversal(TNode root) {
        if(root == null)
            return;
        Stack<TNode> stack = new Stack<>();
        // Enter all left values in the Stack
        stack.push(root);
        while(root.left!=null){
            stack.push(root.left);
            root = root.left;
        }

        while (stack.size() > 0) {

            // visit the top node
            root = stack.pop();
            System.out.print(root.key + " ");
            if (root.right != null) {
                root = root.right;

                // the next node to be visited is the leftmost
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
            }
        }
    }


    private static void createTree() {
        root = new TNode(1);
        root.left  = new TNode(2);
        root.right  = new TNode(3);
        root.left.left  = new TNode(4);
        root.left.right  = new TNode(5);
        root.right.right  = new TNode(6);
        root.left.right.left  = new TNode(7);
        root.left.right.right  = new TNode(8);

    }
}
