package com.jagdeep.ds.strings;

import java.util.HashSet;
import java.util.Set;

public class EncryptedString {

    public static void main(String[] arg){
        String s = "a";

        StringBuffer s1 = new StringBuffer();

//        System.out.println(s.charAt(0)+1 + "");

        char c = 'e';
        int rotation = 2;

        Set<Character> set = new HashSet<Character>(26);

        String F = "hhaacckkekraraannk";

        hackerrankInString(F);

        System.out.println(s.charAt(0));
        System.out.println((c-'a'));
        System.out.println(((c-'a')+rotation));
        System.out.println((((c-'a')+rotation)%26));
        System.out.println((char)('a'+(((c-'a')+rotation)%26)));

        s1.append((char) ('a'+(((c-'a')+rotation)%26)));
    }

    static String hackerrankInString(String s) {
        String h = "hackerrank";

        int index = -1;
        int currentIndex = 0;

        for(Character ch: h.toCharArray()){
            currentIndex = s.indexOf(ch);
            if(currentIndex != -1 && h.contains(ch+"") && currentIndex > index){
                index = currentIndex;
            }else{
                return "NO";
            }
        }

        return "YES";

    }
}
