package com.jagdeep.ds.tree;

import com.jagdeep.ds.Utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A binary tree is full if every node is having either no nodes or two nodes.
 */
public class IsBinaryTree {

    private static TNode root;

    public static void main(String[] arg){
        createTree();
        if(root!=null && isBinaryTree(root))
            Utils.print("This is a full binary tree");
        else
            Utils.print("This is not a full Binary tree");
    }

    private static boolean isBinaryTree(TNode node) {
        if(node == null)
            return true;

        Queue<TNode> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            TNode tNode = queue.poll();

            if(tNode.left == null && tNode.right!=null)
                return false;

            if(tNode.right==null && tNode.left !=null)
                return false;

            if(tNode.right != null && tNode.right!=null){
                queue.add(tNode.left);
                queue.add(tNode.right);
            }
        }

        return true;
    }


    private static void createTree() {
        root = new TNode(1);
        root.left  = new TNode(2);
        root.right  = new TNode(3);
        root.left.left  = new TNode(4);
        root.left.right  = new TNode(5);
        root.right.left  = new TNode(6);
//        root.right.right  = new TNode(7);

    }
}
