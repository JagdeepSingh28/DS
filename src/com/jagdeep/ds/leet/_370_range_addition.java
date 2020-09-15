package com.jagdeep.ds.leet;

public class _370_range_addition {
    public static void main(String[] args) {
        getModifiedArray(6, new int[][]{{1,4,2}
        ,{2,4,-2}
//        ,{0,2,-2}
        });
    }

    public static int[] getModifiedArray(int length, int[][] updates) {
        int[] ans = new int[length];

        for (int[] update : updates) {
            int start = update[0];
            int end = update[1];
            int inc = update[2];

            ans[start] += inc;
            if (end + 1 < length) {
                ans[end + 1] -= inc;
            }
        }

        for (int i = 1; i < length; i++) {
            ans[i] += ans[i -1];
        }

        return ans;
    }
}
