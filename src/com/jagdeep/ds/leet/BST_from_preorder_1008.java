package com.jagdeep.ds.leet;

public class BST_from_preorder_1008 {

    public static void main(String[] args) {
        BST_from_preorder_1008 bst = new BST_from_preorder_1008();
//        bst.bstFromPreorder(new int[]{8,5,1,7,10,12});
        bst.bstFromPreorder(new int[]{8,12,10,7,1,5});
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode res = new TreeNode(preorder[0]);
        if(preorder.length == 1){
            return res;
        }
        for(int i = 1; i < preorder.length; i++){
            setNode(res,preorder[i]);
        }
        return res;
    }

    public void setNode(TreeNode node, int val){
        if(node.val < val){
            if(node.right == null){
                node.right = new TreeNode(val);
            }else{
                setNode(node.right,val);
            }
        }else {
            if(node.left == null){
                node.left = new TreeNode(val);
            }else{
                setNode(node.left,val);
            }
        }
    }

}
