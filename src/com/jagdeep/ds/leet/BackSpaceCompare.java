package com.jagdeep.ds.leet;

import java.util.Stack;

public class BackSpaceCompare {

    public static void main(String[] args) {

        BackSpaceCompare backSpaceCompare = new BackSpaceCompare();
        System.out.print(backSpaceCompare.backSpaceCompare("y#fo##f","y#f#o##f"));

    }

    private boolean backSpaceCompare(String S, String T){
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(Character c: S.toCharArray()){
            if(c == '#'){
                if(s1.size()>0)
                    s1.pop();
            }
            else
                s1.push(c);
        }

        for(Character c: T.toCharArray()){
            if(c == '#'){
                if(s2.size()>0)
                    s2.pop();
            }
            else
                s2.push(c);
        }

        if(s1.size()!=s2.size())
            return false;

        for (int i = 0; i < s1.size(); i++) {
            if(s1.elementAt(i) != s2.elementAt(i))
                return false;
        }

        return true;
    }
}

