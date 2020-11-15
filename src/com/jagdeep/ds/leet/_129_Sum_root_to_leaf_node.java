package com.jagdeep.ds.leet;

public class _129_Sum_root_to_leaf_node {

    static int sum = 0;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(1);

        _129_Sum_root_to_leaf_node to_leaf_node = new _129_Sum_root_to_leaf_node();
        to_leaf_node.sum(root,0);
        System.out.println(sum);
    }

    public void helper(TreeNode root, int currentNum){
        if(root == null)
            return;

        if(root.left == null && root.right == null){
            currentNum = Integer.valueOf(currentNum + "" + root.val);
            sum += currentNum;
        }
        else
            currentNum = Integer.valueOf(currentNum + "" + root.val);

        helper(root.left, currentNum);
        helper(root.right, currentNum);

    }

    public int sum(TreeNode n, int s){
        if (n == null) return 0;
        if (n.right == null && n.left == null)
            return s*10 + n.val;

        return sum(n.left, s*10 + n.val) + sum(n.right, s*10 + n.val);
    }
}
