package com.jagdeep.ds.leet;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        String s = "acxvb";
        String t = "acjde";
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram(s,t));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;

        HashMap<Character,Integer> anaHashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            anaHashMap.put(s.charAt(i), anaHashMap.getOrDefault(s.charAt(i),0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            anaHashMap.put(t.charAt(i), anaHashMap.getOrDefault(t.charAt(i),0)-1);
        }


        for (Map.Entry<Character, Integer> entries : anaHashMap.entrySet()) {
            if(entries.getValue()>0)
                return false;
        }
        return true;
    }
}

