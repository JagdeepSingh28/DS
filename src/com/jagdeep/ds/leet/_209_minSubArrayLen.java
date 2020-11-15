package com.jagdeep.ds.leet;

public class _209_minSubArrayLen {

    public static void main(String[] args) {
        _209_minSubArrayLen minSubArrayLen = new _209_minSubArrayLen();
        minSubArrayLen.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
    }

    public int minSubArrayLen(int s, int[] a) {
        if (a == null || a.length == 0)
            return 0;

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < a.length) {
            sum += a[j++];

            while (sum >= s) {
                min = Math.min(min, j - i);
                sum -= a[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}