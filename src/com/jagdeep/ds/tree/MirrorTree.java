package com.jagdeep.ds.tree;

import com.jagdeep.ds.Utils;

public class MirrorTree {

    private static TNode root;

    public static void main(String[] arg){
        createTree();
        inOrderTree(root);
        createMirrorOfTree(root);
        Utils.println("");
        inOrderTree(root);
    }

    private static void createMirrorOfTree(TNode node) {
        if(node == null)
            return;

        createMirrorOfTree(node.left);
        createMirrorOfTree(node.right);

        TNode temp;
        temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    private static void inOrderTree(TNode node) {
        if(node == null)
            return;

        inOrderTree(node.left);
        Utils.print(node.key);
        inOrderTree(node.right);
    }

    private static void createTree() {
        root = new TNode(1);
        root.left  = new TNode(2);
        root.right  = new TNode(3);
        root.right.left  = new TNode(4);
        root.right.right  = new TNode(5);
//        root.right.right  = new TNode(6);
//        root.right.right.left  = new TNode(7);
//        root.right.right.right  = new TNode(8);

    }
}
