package com.jagdeep.ds.leet;

public class _238 {

    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        //每个数的值为原数组前面数字的积
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        //再乘以每个数后面的数字
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
