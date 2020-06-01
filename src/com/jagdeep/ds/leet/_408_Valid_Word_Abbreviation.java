package com.jagdeep.ds.leet;

public class _408_Valid_Word_Abbreviation {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }

    public static boolean backspaceCompare(String S, String T) {
        int n = S.length()-1;
        int m = T.length()-1;

        while(n>0 && m>0){
            boolean temp = false;
            if(S.charAt(n) == '#'){
                n = n-2;
                temp = true;
            }
            if(T.charAt(m) == '#'){
                m = m-2;
                temp = true;
            }

            if(!temp){
                n--;
                m--;
            }
        }

        if(n==0 && m==0)
            return true;

        return false;
    }
}
