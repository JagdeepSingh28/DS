package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath_257 {


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */


   public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode rootLeft = new TreeNode(2);
        TreeNode rootRight = new TreeNode(3);
        TreeNode rootLeftRight = new TreeNode(5);

        root.left = rootLeft;
        root.right = rootRight;
        root.left.right = rootLeftRight;

        binaryTreePaths(root);
    }

    public static List<String> binaryTreePaths(TreeNode root) {
       List<String> result = new ArrayList<>();

       if(root == null)
           return result;

       dfs(root, "" , result);

       result.forEach(s -> System.out.println(s));


       return result;

   }

    private static void dfs(TreeNode root, String path, List<String> result) {
        path += root.val;
//        path += "->";
        if(root.left == null && root.right == null){
            result.add(path);///.substring(0,path.length()-2));
            return;
        }
        if(root.left != null)
            dfs(root.left, path+"->", result);

        if(root.right != null)
            dfs(root.right, path+"->", result);
    }

}
