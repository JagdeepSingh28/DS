package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;

public class _163_missing_range {

    public static void main(String[] args) {
        System.out.println(findMissingRanges(new int[]{0, 1, 3, 50, 75}, 2, 99));
    }

    public static  List<String> findMissingRanges(int[] nums, int lower, int upper) {
        final List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            res.add(rangeString(lower, upper));
            return res;
        }
        int nextMissing = lower;
        for (int num : nums) {
            if (nextMissing == num - 1) {
                res.add(rangeString(nextMissing, nextMissing));
            } else if (nextMissing < num) {
                res.add(rangeString(nextMissing, num - 1));
            }
            if (num == Integer.MAX_VALUE) return res; // Avoid Integer out of range
            nextMissing = num + 1;
        }
        if (nextMissing == upper) {
            res.add(rangeString(nextMissing, nextMissing));
        } else if (nextMissing < upper) {
            res.add(rangeString(nextMissing, upper));
        }
        return res;
    }

    private static String rangeString(final int lower, final int upper) {
        if (lower == upper) {
            return Integer.toString(lower);
        } else {
            return lower + "->" + upper;
        }
    }
}
