package com.jagdeep.ds.leet;

public class _106_bt_from_pre_in_order {
    public static void main(String[] args) {
        _106_bt_from_pre_in_order bt = new _106_bt_from_pre_in_order();
        bt.buildTree(new int[]{9,5,1,7,2,12,8,4,3,11}, new int[]{9,1,2,12,7,5,3,11,4,8});
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return constructTreeFromInPost(inorder, postorder, 0, inorder.length , 0, postorder.length );
    }

    private TreeNode constructTreeFromInPost(int[] inorder, int[] postorder, int i1, int i2, int p1, int p2) {
        if(i1 >= i2 || p1 >= p2) return null;
        TreeNode root = new TreeNode(postorder[p2-1]);
        int it = 0;
        for(int i = i1; i < i2; ++i){
            if(postorder[p2-1] == inorder[i]) {
                it = i;
                break;
            }
        }
        int diff = it - i1;
        root.left = constructTreeFromInPost(inorder, postorder, i1, i1 + diff,  p1, p1+diff);
        root.right = constructTreeFromInPost(inorder, postorder,i1+diff+1, i2, p1+diff, p2-1);

        return root;


    }
}
