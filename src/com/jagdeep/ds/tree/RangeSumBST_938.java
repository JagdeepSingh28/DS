package com.jagdeep.ds.tree;

import java.util.ArrayList;
import java.util.Collections;

public class RangeSumBST_938 {

    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

    public static void main(String[] args) {

        TreeNode n1   = new TreeNode(10);
        TreeNode n2   = new TreeNode(5);
        TreeNode n3   = new TreeNode(15);
        TreeNode n4   = new TreeNode(3);
        TreeNode n5   = new TreeNode(7);
        TreeNode n7   = new TreeNode(18);

        n1.left  = n2;
        n1.right = n3;

        n2.left  = n4;

        n2.right = n5;

        n3.right = n7;

        RangeSumBST_938 rangeSumBST_938 = new RangeSumBST_938();
        System.out.println(rangeSumBST_938.rangeSumBST(n1, 7, 15));
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;

        ArrayList<Integer> sum = new ArrayList<>();
        ArrayList<Integer> result =  rangeSumBSTHelper(root, L,  R, sum);
        return result.stream().mapToInt(a -> a).sum();
    }

//                 10
//            5           15
//        3       7    n      18

    public ArrayList<Integer> rangeSumBSTHelper(TreeNode root, int L, int R, ArrayList<Integer> sum) {
        if(root == null)
            return (ArrayList<Integer>) Collections.EMPTY_LIST;

        if(root.val <= R && root.val >= L)
            sum.add(root.val);

        if(root.left != null)
            rangeSumBSTHelper(root.left, L, R, sum);

        if(root.right != null)
            rangeSumBSTHelper(root.right, L, R, sum);

        return sum;

    }
}
