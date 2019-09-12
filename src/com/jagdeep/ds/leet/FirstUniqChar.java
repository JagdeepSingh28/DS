package com.jagdeep.ds.leet;

import java.util.LinkedHashMap;

public class FirstUniqChar {

    public static void main(String[] args) {
        FirstUniqChar firstUniqChar = new FirstUniqChar();
        String s = "aadadaad";
        System.out.println(firstUniqChar.firstUniqCharIndex(s));
    }

    public int firstUniqCharIndex(String s) {
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
