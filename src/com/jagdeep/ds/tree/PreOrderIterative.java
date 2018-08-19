package com.jagdeep.ds.tree;

import java.util.Stack;

public class PreOrderIterative {

	private TreeNode root;
    
    class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
 
        public TreeNode(int data) {
            this.data = data;
        }
    };
 
    /**
     * Method creates a sample tree
     *                5
     *          4           6
     *      3       7   8       
     * 
     */
    public void createTree() {
        root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(8);
    }
     
    /**
     * Method for printing iterative pre-order traversal 
     * of a binary tree.
     */
    public void iterativePreorder() {
        TreeNode top;
        if (root == null)
            return;
 
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
 
        while (!st.empty()) {
            top = st.pop();
            System.out.print(top.data + " ");
            if (top.right != null)
                st.push(top.right);
            if (top.left != null)
                st.push(top.left);
        }
        
    }
 
    /**
     * Method for testing the algorithm.
     * 
     * @param args
     */
    public static void main(String args[]) {
    	PreOrderIterative tree = new PreOrderIterative();
        tree.createTree();
        tree.iterativePreorder();
    }
}
