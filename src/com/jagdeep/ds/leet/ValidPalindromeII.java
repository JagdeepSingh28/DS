package com.jagdeep.ds.leet;

public class ValidPalindromeII {

    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }

    public static boolean validPalindrome(String s) {
        boolean oneTimeFlag = true;
        for (int i = 0,j = s.length()-1 ; i < j ; ) {
            if(s.charAt(i) != s.charAt(j) && oneTimeFlag){
                oneTimeFlag = false;
                if(s.charAt(i+1) == s.charAt(j))
                    i++;
                else if(s.charAt(i) == s.charAt(j-1))
                    j--;
            }
                return false;
        }

        return true;
    }
}
