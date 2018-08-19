package com.jagdeep.ds.tree;

public class InsertionBST {

	private TreeNode root;
    
    class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
 
        public TreeNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data+"";
        }
    }
 
    /**
     * Method creates a sample tree
     *                5
     *          4           6
     *      3       7   8       
     * 
     */
//    public void createTree() {
//        root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(6);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(7);
//        root.right.left = new TreeNode(8);
//        root.right.left.right = new TreeNode(2);
//        root.right.right = new TreeNode(1);
//    }

    private TreeNode insert(TreeNode node, int key){
        if (node == null){ // base case
            node = new TreeNode(key);
        }

        if (key < node.data){ // insert key into left sub-tree
            node.left = insert(node.left, key);
        } else if (key > node.data){ // insert key into right sub-tree
            node.right = insert(node.right, key);
        }

        return node;
    }

    public void insert(int key){
        root = insert(this.root, key);
        return;
    }

    /**
     * Method for testing the algorithm.
     * 
     * @param args
     */
    public static void main(String args[]) {
    	InsertionBST tree = new InsertionBST();
        tree.insert(0);
        tree.insert(5);
        tree.insert(1);
        tree.insert(2);
        tree.insert(4);
    }
}
