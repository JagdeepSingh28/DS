package com.jagdeep.ds.leet;

public class _115_distinct_subsequence {
    public static void main(String[] args) {
        System.out.println(numDistinct("cbabadbacab", "abb"));
    }

    public static int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[m][n];
        if(t.charAt(0) == s.charAt(0))
            dp[0][0] = 1;

        for (int i = 1; i < n; i++) {
            if(t.charAt(0) == s.charAt(i))
               dp[0][i] = dp[0][i-1] + 1;
            else
                dp[0][i] = dp[0][i-1];
        }

        for (int i = 1; i < m; i++) {
            if(t.charAt(i) == s.charAt(0))
                dp[0][i] =  1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
                }else
                    dp[i][j] = dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
