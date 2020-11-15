package com.jagdeep.ds.tree;

public class BSTtoGreaterTree {
    public static int sum = 0;
    public void greaterTree(Node root){
        if(root!=null){
            //visit the right node first
            greaterTree(root.right);
            //store the node value in temp
            int temp = root.data;
            //update the sum, sum till previous visited node
            root.data = sum;
            //update the sum for the next node
            sum = sum + temp;
            greaterTree(root.left);
        }else return;
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print("  " + root.data);
            inorder(root.right);
        }
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20	);

        BSTtoGreaterTree b = new BSTtoGreaterTree();
        b.inorder(root);
        System.out.println("");
        b.greaterTree(root);
        System.out.print("Greater Sum Tree: ");
        b.inorder(root);

    }
}

class Node{
    int data;
    Node left;
    Node right;
    public Node (int data){
        this.data = data;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return data + "";
    }
}

