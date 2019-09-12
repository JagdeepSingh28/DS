package com.jagdeep.ds.leet;

public class Same_Tree_100 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode p_left = new TreeNode(2);
        TreeNode p_right =  new TreeNode(2);

        TreeNode p_left_left =  new TreeNode(3);
        TreeNode p_left_right =  new TreeNode(4);
        TreeNode p_right_left =  new TreeNode(4);
        TreeNode p_right_right =  new TreeNode(3);

        p.left = p_left;
        p.right = p_right;
        p.left.left = p_left_left;
        p.left.right = p_left_right;
        p.right.left = p_right_left;
        p.right.right = p_right_right;

//        TreeNode q = new TreeNode(0);
//        TreeNode q_left = new TreeNode(-8);
//        TreeNode q_right = null;//new TreeNode(3);
//        q.left =  q_left;
//        q.right = q_right;

//        System.out.println(isSameTree(p, q));
//        System.out.println(sumOfLeftLeaves(p));
        System.out.println(isSymmetricHelper(p.left, p.right));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;

        if(p == null || q == null)
            return false;

        if(p.val != q.val)
            return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);

    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null )
            return 0;

        int left = 0;
        if(root.left !=null && root.left.left == null && root.left.right == null)
            left = root.left.val;


        return left + sumOfLeftLeaves(root.left) +  sumOfLeftLeaves(root.right);
    }


    public static boolean isSymmetricHelper(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return true;

        if(root1.val != root2.val)
            return false;

        return isSymmetricHelper(root1.right, root2.left) && isSymmetricHelper(root1.left, root2.right);
    }
}
