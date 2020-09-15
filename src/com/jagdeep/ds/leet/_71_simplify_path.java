package com.jagdeep.ds.leet;

import java.util.*;

public class _71_simplify_path {

    public static void main(String[] args) {
        _71_simplify_path simplify_path = new _71_simplify_path();
//        simplify_path.simplifyPath("//a/../../b/../c//.//");
        simplify_path.simplifyPath("/a//b////c/d//././/..");
    }


    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        for(String s: path.split("/")){
            if(s.equals("..") )
                stack.poll();
            else if(!s.equals("") && !s.equals("."))
                stack.push(s);
        }
        StringBuilder sb = new StringBuilder();
        if(stack.size() == 0) return "/";
        while(stack.size() != 0)
            sb.append("/").append(stack.pollLast());
        return sb.toString();
    }
}
