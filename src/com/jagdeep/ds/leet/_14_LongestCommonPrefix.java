package com.jagdeep.ds.leet;

public class _14_LongestCommonPrefix {

    public static void main(String[] args){
        String[] strArr = {"java2blogWithBigString","javaworld","javabean","javatemp"};
        String longestPrefix = getLongestCommonPrefix(strArr);
        System.out.println("Longest Prefix : "+longestPrefix);
    }

    private static String getLongestCommonPrefix(String[] strArr) {
        if(strArr.length == 0)
            return "";

        int minStringLength = getMinimumStringLength(strArr);
        char[] initialString = strArr[0].toCharArray();

        for (int i = 1; i < strArr.length; i++) {
            int j;
            for (j = 0; j < minStringLength; j++) {
                if(initialString[j] != strArr[i].charAt(j))
                    break;
            }
            if(j < minStringLength){
                minStringLength = j;
            }
        }
        return strArr[0].substring(0,minStringLength);
    }

    private static int getMinimumStringLength(String[] strArr) {
        int minLength = strArr[0].length();
        for (int i = 1; i < strArr.length; i++) {
            if(strArr[i].length() < minLength)
                minLength = strArr[i].length();
        }
        return minLength;
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }


}
