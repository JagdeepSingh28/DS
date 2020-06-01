package com.jagdeep.ds.leet;

public class Height_Checker_1051 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,4,2,1,3};
        heightChecker(arr);
    }

    public static int heightChecker(int[] heights) {
        int[] heightToFreq = new int[101];
        for (int height : heights) {
            heightToFreq[height]++;
        }
        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }
            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }
        return result;
    }
}
