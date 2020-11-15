package com.jagdeep.ds.leet;

public class _45_jump_game_II {
    public static void main(String[] args) {
//        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jump(new int[]{2, 1, 3, 2, 3, 4, 5, 1, 2, 8}));
//      System.out.println(jump(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    public static int jump(int[] A) {
        int jumps = 0;
        int curEnd = 0;
        int curFarthest = 0;
        for (int i = 0; i < A.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + A[i]);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }

    public static int jump1(int[] nums){
        // If nums.length < 2, means that we do not
        // need to move at all.
        if (nums == null || nums.length < 2) {
            return 0;
        }

        // First set up current region, which is
        // from 0 to nums[0].
        int l = 0;
        int r = nums[0];
        // Since the length of nums is greater than
        // 1, we need at least 1 step.
        int step = 1;

        // We go through all elements in the region.
        while (l <= r) {

            // If the right of current region is greater
            // than nums.length - 1, that means we are done.
            if (r >= nums.length - 1) {
                return step;
            }

            // We should know how far can we reach in current
            // region.
            int max = Integer.MIN_VALUE;
            for (; l <= r; l++) {
                max = Math.max(max, l + nums[l]);
            }

            // If we can reach far more in this round, we update
            // the boundary of current region, and also add a step.
            if (max > r) {
                l = r;
                r = max;
                step++;
            }
        }

        // We can not finish the job.
        return -1;
    }
}
