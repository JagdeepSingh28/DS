package com.jagdeep.ds.tree;

import com.jagdeep.ds.Utils;

import java.util.ArrayList;
import java.util.List;

public class PrintLeftView {

    static TNode root;

    public static void main(String[] arg){
        createTree();
        ArrayList<Integer> l = new ArrayList<>();
        printLeftView(l,root,0);
        for (int i: l)
            Utils.print(i);
    }

    private static void printLeftView(ArrayList<Integer> l,TNode node,int i) {
        if(node == null)
            return;
        if(i==l.size())
            l.add(node.key);
        printLeftView(l,node.left,i+1);
        printLeftView(l,node.right,i+1);
    }

    private static void createTree() {
        root = new TNode(1);
        root.left  = new TNode(2);
        root.right  = new TNode(3);
        root.left.left  = new TNode(4);
        root.left.right  = new TNode(5);
        root.right.left  = new TNode(6);
        root.right.left.right  = new TNode(9);
//        root.left.left.right  = new TNode(8);
//        root.left.left.right.right  = new TNode(10);

    }
}
