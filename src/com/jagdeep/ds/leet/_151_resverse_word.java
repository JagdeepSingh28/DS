package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _151_resverse_word {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is  blue"));
    }

    public static String reverseWords_(String s) {
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

    public static String reverseWords__(String s) {
        Stack<String> st = new Stack<>();
        String temp = "";
        String ans  = "";

        for(int i =0; i <s.length(); i++){
            if(s.charAt(i) == ' '){
                if(temp.length() > 0)
                    st.push(temp);
                temp = "";
            }else
                temp = temp + s.charAt(i);
        }

        ans = ans + temp;

        ans = st.pop();

        while(!st.isEmpty()){
            ans = ans + " " + st.pop();
        }

//        if(ans.length() != 0 && ans.charAt(0) == ' ')
//            ans =  ans.substring(1);

        return ans;
    }

    public static String reverseWords(String s) {
        String result = new String();
        int i = 0;
        int n = s.length();

        while(i < n){
            while(i < n && s.charAt(i) == ' ')
                i++;
            if(i >= n)
                break;
            int j = i + 1;
            while(j < n && s.charAt(j) != ' ')
                j++;
            String sub = s.substring(i, j);
            if(result.length() == 0)
                result = sub;
            else
                result = sub + " " + result;
            i = j+1;
        }
        return result;
    }
}
