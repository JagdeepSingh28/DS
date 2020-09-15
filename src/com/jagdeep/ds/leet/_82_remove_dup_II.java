package com.jagdeep.ds.leet;

public class _82_remove_dup_II {

    public static void main(String[] args) {
        _82_remove_dup_II remove_dup_ii = new _82_remove_dup_II();
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3};
        int len = remove_dup_ii.removeDuplicates(nums, nums.length, 2);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        return i;
    }

    int removeDuplicates(int A[], int n, int k) {

        if (n <= k) return n;

        int i = 1, j = 1;
        int cnt = 1;
        while (j < n) {
            if (A[j] != A[j-1]) {
                cnt = 1;
                A[i++] = A[j];
            }
            else {
                if (cnt < k) {
                    A[i++] = A[j];
                    cnt++;
                }
            }
            ++j;
        }
        return i;
    }
}
