package com.jagdeep.ds.tree;

import com.jagdeep.ds.Utils.Utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    static TNode root;

    public static void main(String[] arg){

        createTree();
//        printLevelOrderTraversal(root);
        List<List<Integer>> result = new ArrayList<>();
        levelOrderHelper(result, root, 0);
    }

    private static void printLevelOrderTraversal(TNode root) {
        if(root == null)
            return;
        Queue<Object> queue = new LinkedList();

        //Algo to traverse tree in level order
        // Step 1: check if queue is Empty, otherwise print the first element
        // step 2. check for left element, and put it in the Queue
        // Step 3. check for right element, and put it in the Queue

        /**
         * Queue
         *
         * \\\\4\5\6
         *
         */
        queue.add(root);
        while(!queue.isEmpty()){
            // Get the head from the queue
            TNode cNode = (TNode)queue.poll();
            Utils.print(cNode.key);
            if(cNode.left!=null)
                queue.add(cNode.left);
            if(cNode.right!=null)
                queue.add(cNode.right);
        }

        Utils.println("Level Order Traversal is Completed");
    }

    private static void createTree() {
        root = new TNode(1);
        root.left  = new TNode(2);
        root.right  = new TNode(3);
        root.left.left  = new TNode(4);
        root.left.right  = new TNode(5);
        root.right.right  = new TNode(6);
        root.left.right.left  = new TNode(7);
        root.left.right.right  = new TNode(8);

    }

    public static void levelOrderHelper(List<List<Integer>> res, TNode root, int level) {
        if (root == null)
            return;
        List<Integer> curr;
        if (level >= res.size()) {
            curr = new ArrayList<>();
            curr.add(root.key);
            res.add(curr);
        } else {
            curr = res.get(level);
            curr.add(root.key);
            //res.add(curr); // No need to add the curr into the res, because the res.get(index) method does not remove the index element
        }
        levelOrderHelper(res, root.left, level + 1);
        levelOrderHelper(res, root.right, level + 1);
    }
}
