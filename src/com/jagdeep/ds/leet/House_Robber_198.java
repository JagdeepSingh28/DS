package com.jagdeep.ds.leet;

public class House_Robber_198 {

    public static void main(String[] args) {
        int[] nums = new int[]{3,1,1,10,0};
        System.out.println(rob_(nums));
    }

    public static int rob_(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];

        for(int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[dp.length - 1];
    }


    public static int rob(int[] nums) {
        return rob(nums, nums.length - 1);
    }
    private static int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    }
}
