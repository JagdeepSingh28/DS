package com.jagdeep.ds.leet;

public class Detect_capital_520 {

    public static void main(String[] args) {
        detectCapitalUse("UsA");
    }

    public static boolean detectCapitalUse(String word) {
        int cnt = 0;
        for(char c: word.toCharArray())
            if('Z' - c >= 0)
                cnt++;
        return ((cnt==0 || cnt==word.length())
                || (cnt==1 && 'Z' - word.charAt(0)>=0));
    }
}
