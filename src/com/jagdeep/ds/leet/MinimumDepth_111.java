package com.jagdeep.ds.leet;

public class MinimumDepth_111 {
    public static class TreeNode {
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
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        mindepth(root);
    }

    public static int mindepth(TreeNode root){
        if(root == null)
            return 0;
        int left = mindepth(root.left);
        int right = mindepth(root.right);

        if(left==0)
            return right+1;
        if(right==0)
            return left+1;

        return Math.min(right,left) +1;
    }

}
