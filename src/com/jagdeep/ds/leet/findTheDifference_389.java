package com.jagdeep.ds.leet;

public class findTheDifference_389 {

    public static void main(String[] args) {
        System.out.print(findTheDifference("abcd","cdbae"));
    }

    public static char findTheDifference(String s, String t) {
        int asciiS = 0;
        int asciiT = 0;
        for(char c: s.toCharArray()){
            asciiS += c;
        }

        for(char c: t.toCharArray()){
            asciiT += c;
        }

        return (char) Math.abs(asciiS-asciiT);
    }
}
