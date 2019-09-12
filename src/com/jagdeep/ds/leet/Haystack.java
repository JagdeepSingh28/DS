package com.jagdeep.ds.leet;

public class Haystack {
    public static void main(String[] args) {
        Haystack haystack = new Haystack();
        System.out.println(haystack.strStr("mississippi", "issip"));  // output : 2
    }

    public int strStr(String haystack, String needle) {
        int index = -1;
        if(needle.length()>haystack.length() && needle.length()!=0)
            return index;
        if((needle.length()==0 && haystack.length()==0)||needle.length()==0)
            return 0;
        boolean resultFound = false;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i) == needle.charAt(j)){
                    if(index == -1)
                        index = i;

                    if(index != -1 && j==needle.length()-1)
                        resultFound = true;

                    if(i<haystack.length()-1)
                    i++;
                }else{
                    break;
                }
            }
        }

        if(resultFound)
            return index;
        else
            return -1;
    }
}
