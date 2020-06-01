package com.jagdeep.ds.tree;

import com.jagdeep.ds.Utils.Utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class NarryTreeMirror {

    static NTNode root;

    public static void main(String[] arg){
        createSampleTree();
        printLevelOrder(root);
        convertToMirror(root);
        Utils.println("");
        printLevelOrder(root);
    }

    private static void printLevelOrder(NTNode root){
        if (root == null) return;

        Queue<NTNode> queue = new LinkedList();
        queue.add(root);

        while (!queue.isEmpty())
        {
            NTNode currentQueueNode = queue.poll();

            Utils.print(currentQueueNode.key);
            for(NTNode node : currentQueueNode.children)
                queue.add(node);
        }
}

    private static void convertToMirror(NTNode node){
        if(node == null) {
            return;
        }

        for (int i = 0; i < node.children.size(); i++){
            convertToMirror(node.children.get(i));
        }

        Collections.reverse(node.children);
    }

    public static void createSampleTree()
    {
        NTNode n1 = new NTNode(1);
        NTNode n2 = new NTNode(2);
        NTNode n3 = new NTNode(3);
        NTNode n4 = new NTNode(4);

        NTNode n5 = new NTNode(5);
        NTNode n6 = new NTNode(6);
        NTNode n7 = new NTNode(7);
        NTNode n8 = new NTNode(8);
        NTNode n9 = new NTNode(9);

        root = n1;

        root.children.add(n2);
        root.children.add(n3);
        root.children.add(n4);

        n2.children.add(n5);
        n2.children.add(n6);

        n3.children.add(n7);

        n4.children.add(n8);
        n4.children.add(n9);
    }
}
