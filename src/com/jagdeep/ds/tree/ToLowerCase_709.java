package com.jagdeep.ds.tree;

public class ToLowerCase_709 {

    public static void main(String[] args) {
        String s = "HellO";
        System.out.println(toLowerCase(s));
    }


    public static String toLowerCase(String str) {
        char[]  c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]>='A' && c[i]<='Z'){
                c[i] = (char) (c[i]+32);
            }
        }

        return new String(c);
    }
}
