package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;

public class Resverse_word_151 {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> strList = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }else{
                if(!sb.toString().equals("")){
                    strList.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            }
        }
        return "";
    }
}
