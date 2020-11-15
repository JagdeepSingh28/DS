package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;

public class _113_path_sum_II {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        _113_path_sum_II sum = new _113_path_sum_II();
        sum.pathSum(root,22);

    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList();
        helper(result, root, sum, new ArrayList<Integer>());
        return result;

    }

    public void helper(List<List<Integer>> result,TreeNode root,int sum, List<Integer> sub){
        if(root == null)
            return;
        sub.add(root.val);
        if(root.left == null && root.right == null && sum-root.val == 0){
            result.add(new ArrayList(sub));
        }

        if(root.left!=null){
            helper(result, root.left, sum- root.val, sub);
            sub.remove(sub.size()-1);
        }

        if(root.right!=null) {
            helper(result, root.right, sum- root.val, sub);
            sub.remove(sub.size()-1);
        }
    }
}
