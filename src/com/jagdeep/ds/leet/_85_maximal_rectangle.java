package com.jagdeep.ds.leet;

import java.util.Arrays;

public class _85_maximal_rectangle {
    public static void main(String[] args) {
        char[][] rec = new char[][]{
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}};

        System.out.println(maximalRectangle(rec));
    }

    public static int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] height = new int[n];
        // Arrays.fill(left, 0);
        Arrays.fill(right, n);
        // Arrays.fill(height, 0);
        int max = 0;
        for (int i = 0; i < m; i++) {
            // Compute height (can do this from either side).
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }
            // Compute left boundaries (must from left to right).
            int leftBound = 0; // Index of leftmost 1 of current row.
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    left[j] = Math.max(left[j], leftBound);
                } else {
                    left[j] = 0;
                    leftBound = j + 1;
                }
            }
            // Compute right boundaries (must from right to left).
            int rightBound = n; // Index + 1 of rightmost 1 of current row.
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    right[j] = Math.min(right[j], rightBound);
                } else {
                    right[j] = n; // Like reset. Make sure right[j] >= curRight.
                    rightBound = j;
                }
            }
            // Compute the area of rectangle (can do this from either side).
            for (int j = 0; j < n; j++) {
                max = Math.max(max, (right[j] - left[j]) * height[j]);
            }
        }
        return max;
    }


}
