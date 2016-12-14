package com.jagdeep.ds.dynamic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 
public class WordBreakProblem {
 
    private static final Set<String> dictionary = new HashSet<String>(Arrays.asList("arrays", "dynamic", "heaps", "IDeserve",
    		"learn", "learning", "linked", "list", "platform", "programming", "stacks", "trees"));
 
    public static boolean hasValidWords(String words) {
         
        // Empty string
        if(words == null || words.length() == 0) {
            return true;
        }
 
        int n = words.length();
        boolean[] validWords = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (dictionary.contains(words.substring(0, i + 1))) {
                validWords[i] = true;
            }
            if (validWords[i] == true && (i == n - 1))
                return true;
            if (validWords[i] == true) {
                for (int j = i + 1; j < n; j++) {
                    if (dictionary.contains(words.substring(i + 1, j + 1))) {
                        validWords[j] = true;
                    }
                    if (j == n - 1 && validWords[j] == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
 
    public static void main(String[] args) {
//        if (hasValidWords("learningstackslist"))
//            System.out.println("true");
//        else
//            System.out.println("false");
    	String s = new String("learningstackslist");
    	Solution solution = new Solution();
    	System.out.println(solution.wordBreak(s, dictionary));
    }
}

    class Solution {
        public boolean wordBreak(String s, Set<String> dict) {
                 return wordBreakHelper(s, dict, 0);
        }
     
        public boolean wordBreakHelper(String s, Set<String> dict, int start){
            if(start == s.length()) 
                return true;
     
            for(String a: dict){
                int len = a.length();
                int end = start+len;
     
                //end index should be <= string length
                if(end > s.length()) 
                    continue;
     
                if(s.substring(start, start+len).equals(a))
                    if(wordBreakHelper(s, dict, start+len))
                        return true;
            }
     
            return false;
        }
    }

    
