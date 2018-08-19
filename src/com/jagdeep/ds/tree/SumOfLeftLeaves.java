package com.jagdeep.ds.tree;

import com.jagdeep.ds.Utils;

public class SumOfLeftLeaves {

    private static TNode root;
    private static int sum;

    public static void main(String[] arg){
        createTree();
        findSumOfLeftLeaves(root);
        Utils.print(sum);
    }

    private static boolean isLeafNode(TNode leafNode){
        if(leafNode == null)
            return false;

        return leafNode.right == null && leafNode.left == null;

    }

    private static void findSumOfLeftLeaves(TNode node) {
        if(node == null)
            return;

        if(isLeafNode(node.left))
            sum += node.left.key;

        findSumOfLeftLeaves(node.left);
        findSumOfLeftLeaves(node.right);

    }

    private static void createTree() {
        root = new TNode(1);
        root.left  = new TNode(2);
        root.right  = new TNode(3);
        root.left.left  = new TNode(4);
        root.left.right  = new TNode(5);
        root.right.left  = new TNode(6);
        root.right.right  = new TNode(7);
        root.left.left.right  = new TNode(8);
        root.left.left.right.left  = new TNode(9);

    }
}
