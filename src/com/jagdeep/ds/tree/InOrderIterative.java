package com.jagdeep.ds.tree;

import java.util.Stack;

public class InOrderIterative {

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
        root.right.right = new TreeNode(1);
		root.right.left.right = new TreeNode(2);
    }
     
    /**
     * Method for printing iterative pre-order traversal 
     * of a binary tree.
     */
    public void iterativeInorder() {
    	if (root == null)
                return;
          
            Stack<TreeNode> s = new Stack<TreeNode>();
            TreeNode curr = root;
     
            // traverse the tree
            while (curr != null || s.size() > 0)
            {
                /* Reach the left most Node of the
                curr Node */
                while (curr !=  null)
                {
                    /* place pointer to a tree node on
                       the stack before traversing
                      the node's left subtree */
                    s.push(curr);
                    curr = curr.left;
                }
     
                /* Current must be NULL at this point */
                curr = s.pop();
     
                System.out.print(curr.data + " ");
                /* we have visited the node and its
                   left subtree.  Now, it's right
                   subtree's turn */
                curr = curr.right;
            }   
    }
 
    /**
     * Method for testing the algorithm.
     * 
     * @param args
     */
    public static void main(String args[]) {
    	InOrderIterative tree = new InOrderIterative();
        tree.createTree();
        tree.iterativeInorder();
    }
}
