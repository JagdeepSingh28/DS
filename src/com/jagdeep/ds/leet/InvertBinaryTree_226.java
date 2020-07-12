package com.jagdeep.ds.leet;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

    @Override
    public String toString() {
        return val+"";
    }
}

public class InvertBinaryTree_226 {
    public static void main(String[] args) {
        invertTree(getTree());
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }

    static TreeNode getTree(){
        TreeNode c1 = new TreeNode(1,null,null);
        TreeNode c2 = new TreeNode(3,null,null);
        TreeNode c3 = new TreeNode(6,null,null);
        TreeNode c4 = new TreeNode(9,null,null);

        TreeNode sc1 = new TreeNode(2,c1,c2);
        TreeNode sc2 = new TreeNode(7,c3,c4);

        TreeNode root = new TreeNode(4,sc1,sc2);

        return root;
    }
}
