package com.jagdeep.ds.tree;

import com.jagdeep.ds.Utils;

import java.util.ArrayList;

public class PrintLeafPath {

    static TNode root;

    public static void main(String[] arg){
        createTree();
        printRootToLeafPath(root);
    }

    private static void printRootToLeafPath(TNode node) {
        if(node == null)
            return;
        ArrayList<TNode> nodeList = new ArrayList<>();
        printRootToLeafPath(node, nodeList);
    }

    private static void printRootToLeafPath(TNode node, ArrayList<TNode> nodeList){

        nodeList.add(node);
        if(node.left == null && node.right == null) {
            printList(nodeList);
            return;
        }
        printRootToLeafPath(node.left,new ArrayList<>(nodeList));
        printRootToLeafPath(node.right,new ArrayList<>(nodeList));

    }

    private static void printList(ArrayList<TNode> nodeList) {
        for(TNode node:nodeList)
            System.out.print(node.key);
        System.out.println();
    }

    private static void createTree() {
        root = new TNode(1);
        root.left  = new TNode(2);
        root.right  = new TNode(3);
        root.left.left  = new TNode(4);
        root.left.right  = new TNode(5);
        root.right.left  = new TNode(6);
        root.right.right  = new TNode(7);

    }
}
