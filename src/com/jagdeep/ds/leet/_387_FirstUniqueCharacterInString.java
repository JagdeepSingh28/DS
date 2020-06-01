package com.jagdeep.ds.leet;

import java.util.LinkedHashMap;

public class _387_FirstUniqueCharacterInString {


    public static void main(String[] args) {

        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar2(String s) {
        int[] firstOccurrences = new int[26];
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            count[index] = count[index] + 1;
            if(count[index] == 1) {
                firstOccurrences[index] = i;
            }
        }
        int firstFirstOccurrence = -1;
        for(int i = 0; i < count.length; i++) {
            if(count[i] == 1) {
                if(firstFirstOccurrence == -1 || firstFirstOccurrence > firstOccurrences[i]) {
                    firstFirstOccurrence = firstOccurrences[i];
                }
            }
        }
        return firstFirstOccurrence;
    }

    public static int firstUniqChar(String s) {
        if(s==null && s.length()==0)
            return -1;

        LinkedHashMap<Character,Integer> characterHashMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(characterHashMap.containsKey(s.charAt(i)))
                characterHashMap.put(s.charAt(i),-1);
            else
                characterHashMap.put(s.charAt(i),i);
        }

        for (char c : characterHashMap.keySet()) {
            if(characterHashMap.get(c)>-1)
                return characterHashMap.get(c);
        }
        return -1;
    }
}
