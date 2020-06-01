package com.jagdeep.ds.tree;

import com.jagdeep.ds.Utils.Utils;

/**
 * Print all nodes who don't have any siblings
 */
public class NoSiblingsNode {

    static TNode root;

    public static void main(String[] arg) {
        createATree();
        printNoSiblingNodes(root);  // output should be 6,8,5,7
    }

    private static void printNoSiblingNodes(TNode node) {
        if(node == null)
            return;

        if(node.left == null && node.right == null)
            return;

        if(node.left == null && node.right != null){
            Utils.print(node.right.key);
            printNoSiblingNodes(node.right);
        }else if(node.right == null && node.left!= null){
            Utils.print(node.left.key);
            printNoSiblingNodes(node.left);
        }else{
            printNoSiblingNodes(node.left);
            printNoSiblingNodes(node.right);
        }
    }

    private static void createATree() {
        root = new TNode(0);
        root.left = new TNode(1);
        root.right = new TNode(2);
        root.left.left = new TNode(3);
        root.left.right = new TNode(4);
        root.left.left.right = new TNode(6);
        root.left.left.right.right = new TNode(8);
        root.right.left = new TNode(5);
        root.right.left.right = new TNode(7);
    }
}
