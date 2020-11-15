package com.jagdeep.ds.leet;

public class _105_bt_from_pre_and_inorder {

    int preIndex;

    public static void main(String[] args) {
        _105_bt_from_pre_and_inorder a = new _105_bt_from_pre_and_inorder();

        TreeNode root = null;
        int[] preorderArray = {2, 4, 7, 3, 8};
        int[] inorderArray = {7, 4, 3, 2, 8};

        root = a.buildTreeFromInOrderPreOrder(preorderArray, inorderArray, 0, inorderArray.length - 1);
    }


    public TreeNode buildTreeFromInOrderPreOrder(int preorderArray[], int inorderArray[], int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode node = createNewNode(preorderArray[preIndex++]);

        if (start == end) {
            return node;
        }

        int inoderIndex = getInorderIndex(node.val, inorderArray, start, end);

        node.left = buildTreeFromInOrderPreOrder(preorderArray, inorderArray, start, inoderIndex - 1);
        node.right = buildTreeFromInOrderPreOrder(preorderArray, inorderArray, inoderIndex + 1, end);

        return node;
    }

    private int getInorderIndex(int val, int in[], int start, int end) {
        for (int i = start; i <= end; i++) {
            if (in[i] == val) {
                return i;
            }
        }

        return -1;
    }

    public TreeNode createNewNode(int val) {
        TreeNode newNode = new TreeNode();
        newNode.val = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

}



