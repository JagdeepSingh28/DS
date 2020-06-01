package com.jagdeep.ds.leet;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15,17,20};
        int target = 24;
        System.out.println(twoSum2(nums, target));
    }

    public static int twoSum2(int[] nums, int target) {
        // Invalid input or exception
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Sort the Array nums[] to ascending order
        Arrays.sort(nums);

        // Use two pointers
        int count = 0;
        int pl = 0;
        int pr = nums.length - 1;

        while (pl < pr) {
            if (nums[pl] + nums[pr] > target) {

                // Index from pl to pr - 1 will all be counted
                count = count + (pr - pl);
                pr--;
            } else {
                pl++;
            }
        }
        return count;
    }
}
