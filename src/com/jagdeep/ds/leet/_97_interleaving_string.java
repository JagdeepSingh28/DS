package com.jagdeep.ds.leet;

public class _97_interleaving_string {

    public static void main(String[] args) {
        isInterleave("abx","mbn","ambbnx");
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length(), len2 = s2.length();
        if(s3.length() != len1 + len2){
            return false;
        }
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;
        for(int i = 1; i <= len1; i++){ //base case, go down
            dp[i][0] = dp[i - 1][0] && (s1.charAt(i - 1) == s3.charAt(i - 1));
        }
        for(int i = 1; i <= len2; i++){  //base case, go right
            dp[0][i] = dp[0][i - 1] && (s2.charAt(i - 1) == s3.charAt(i - 1));
        }
        for(int i = 1; i <= len1; i++){
            for(int j = 1; j <= len2; j++){
                //case 1, special case, up and left has the same character.
                if(s1.charAt(i - 1) == s3.charAt(i + j - 1) && s2.charAt(j - 1) == s3.charAt(i + j - 1)){
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                    //case2, normal case, only from left
                }else if(s1.charAt(i - 1) == s3.charAt(i + j - 1)){
                    dp[i][j] = dp[i - 1][j];
                    //case3, normal case, only from up
                }else if(s2.charAt(j - 1) == s3.charAt(i + j - 1)){
                    dp[i][j] = dp[i][j - 1];
                }
                /*pay attention, no other cases here,think of: s1 = abc, s2 = def, s3 = abcdef,
                while dp[2][1] will be one of "abd,adb, bad, bda, dab, dba", and we try to match "abc" no match!
                Think of this problem as a matrix, we are tring to find out if there is a path from [0,0]  to [len1 - 1, len2 - 1],
                so dp[i][j] == false, only mean dp[i][j] is not on the valid path, does not mean there is no such path exists!
                   a  b  c
                   ☑️ ☑️ ☑️
            d               ☑️
            e               ☑️
            f               ☑️(valid path)
            */
            }
        }
        return dp[len1][len2];
    }
}
