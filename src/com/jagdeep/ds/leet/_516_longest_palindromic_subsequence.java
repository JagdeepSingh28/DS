package com.jagdeep.ds.leet;

public class _516_longest_palindromic_subsequence {
    public static void main(String[] args) {
        System.out.println(longest_palindromic_subsequence("ab"));
    }

    public static int longest_palindromic_subsequence(String s){
        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length()-1; i >=0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] +2;
                }else
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[0][s.length()-1];
    }
}
