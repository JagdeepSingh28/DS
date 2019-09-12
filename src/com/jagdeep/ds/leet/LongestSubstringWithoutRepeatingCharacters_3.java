package com.jagdeep.ds.leet;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public static void main(String[] args) {
        String input = "aab";

        LongestSubstringWithoutRepeatingCharacters_3 longestSubstringWithoutRepeatingCharacters_3 = new LongestSubstringWithoutRepeatingCharacters_3();
        System.out.println(longestSubstringWithoutRepeatingCharacters_3.lengthOfLongestSubstring(input));
    }

    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxCount = 0;

        if(null == s || s.length() == 0)
            return 0;

//        if(s.trim().equals(""))
//            return 1;

        HashSet<Character> characterHashSet = new HashSet<>();

        for (Character character : s.toCharArray()) {
            if (!characterHashSet.contains(character)){
                characterHashSet.add(character);
                j++;
            }else{
                characterHashSet.clear();
                characterHashSet.add(character);
                maxCount = j-i>maxCount?j-i:maxCount;
                if(j<s.length()-1){
//                    j = j+1;
                    i = j;
                    j++;
                }
            }
        }

        if(maxCount == 0 && j>i)
            return j-i;

        return maxCount;
    }

}
