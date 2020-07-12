package com.jagdeep.ds.leet;

public class LongestCommonSubsequence_1143 {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde",  "ace"));
    }

    public static int longestCommonSubsequence(String a, String b) {
        int[][] res = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (i == 0 || j == 0) {
                    res[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    res[i][j] = 1 + res[i - 1][j - 1];
                } else {
                    res[i][j] = Math.max(res[i - 1][j], res[i][j - 1]);
                }
            }
        }
        return res[res.length - 1][res[0].length - 1];
    }
}

