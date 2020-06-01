package com.jagdeep.ds.leet;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowel_1119 {

    public static void main(String[] args) {
        String s = "leetisacommunityforcoders";
        System.out.println(removeVowels(s));
    }

    public static String removeVowels(String s){
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if(!vowels.contains(c))
                sb.append(c);
        }

        return sb.toString();
    }
}
