package com.jagdeep.ds.leet;

public class sortedArrayToBST_108 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        sortedArrayToBST_108 sortedArrayToBST_108 = new sortedArrayToBST_108();
        sortedArrayToBST_108.sortedArrayToBST(new int[]{-20, -10, -3,0,5,9,30});
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0, nums.length-1);
    }

    private TreeNode helper(int[] nums, int start, int end) {
        if(start>end)
            return null;

        int mid = start + (end-start)/2;

        TreeNode head = new TreeNode(nums[mid]);

        head.left = helper(nums, start, mid-1);
        head.right = helper(nums, mid+1, end);

        return head;
    }
}
