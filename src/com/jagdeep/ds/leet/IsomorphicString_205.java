package com.jagdeep.ds.leet;

public class IsomorphicString_205 {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper","title"));
    }

    public static boolean isIsomorphic ( String s, String t) {
        int [] preIndexOfS =  new  int [ 256 ];
        int [] preIndexOfT =  new  int [ 256 ];
        for ( int i =  0 ; i < s . length (); i++ ) {
            char sc = s . charAt (i);
            char tc = t . charAt (i);
            if(preIndexOfS [sc] != preIndexOfT [tc]) {
                return  false ;
            }
            preIndexOfS [sc] = i +  1 ;
            preIndexOfT [tc] = i +  1 ;
        }
        return  true ;
    }
}
