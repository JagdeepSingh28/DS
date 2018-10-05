package com.jagdeep.ds.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeCheck {

    void traverseString(String s){
        ArrayList<String> finalList = new ArrayList<>();

        int n = s.length();

        for(int i =0; i<= n; i++){
            for (int j = i+1; j <= n; j++) {
                if(isPalindrome(s.substring(i,j)))
                    finalList.add(s.substring(i,j));
            }
        }
        finalList.forEach(System.out::println);
    }

    boolean isPalindrome(String s){
        if(s.length()<2)
            return false;

        int start = 0;
        int end = s.length()-1;


        char[] chars = s.toCharArray();

        while(start<end){
            if(chars[start] == chars[end]){
                start++;
                end--;
            }else
                return false;
        }
        return true;
    }

    public static void main(String[] arg){
        PalindromeCheck p = new PalindromeCheck();
        p.traverseString("abbaeae");



        String s = "dewdw";
        char c = 'd';
        s.contains("dew");
        s.indexOf(c);


    }
}
