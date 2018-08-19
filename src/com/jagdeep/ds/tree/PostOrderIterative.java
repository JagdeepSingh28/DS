package com.jagdeep.ds.tree;

import java.util.Stack;

public class PostOrderIterative {

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
        root.right.left.right = new TreeNode(2);
        root.right.right = new TreeNode(1);
    }

    /**
     * Method for printing iterative pre-order traversal 
     * of a binary tree.
     */
    public void iterativePostorder() {

        // Create two stacks
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if (root == null)
            return;

        // push root to first stack
        s1.push(root);

        // Run while first stack is not empty
        while (!s1.isEmpty())
        {
            // Pop an item from s1 and push it to s2
            TreeNode temp = s1.pop();
            s2.push(temp);

            // Push left and right children of
            // removed item to s1
            if (temp.left != null)
                s1.push(temp.left);
            if (temp.right != null)
                s1.push(temp.right);
        }

        // Print all elements of second stack
        while (!s2.isEmpty())
        {
            TreeNode temp = s2.pop();
            System.out.print(temp.data + " ");
        }

    }
 
    /**
     * Method for testing the algorithm.
     * 
     * @param args
     */
    public static void main(String args[]) {
    	PostOrderIterative tree = new PostOrderIterative();
        tree.createTree();
        tree.iterativePostorder();
    }
}
