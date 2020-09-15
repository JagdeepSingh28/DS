package com.jagdeep.ds.leet;

public class _112_pathSum {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        if(root!=null && root.left == null && root.right == null && (sum-root.val)==0)
            return true;


        return hasPathSum(root.left, sum-root.val) ||
                hasPathSum(root.right, sum-root.val);

    }
}
