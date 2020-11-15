package com.jagdeep.ds.leet;

public class _91_decode_ways {

    public static void main(String[] args) {
        System.out.println(numDecodings("1123", 0));
    }

    private static int numDecodings(String s, int index){
        if(index == s.length())
            return 1;
        if(s.charAt(index) == '0')
            return 0;
        if(index == s.length()-1)
            return  1;

        int way1 = numDecodings(s, index+1);
        int way2 = 0;
        if(Integer.parseInt(s.substring(index, index+2))<=26)
            way2 = numDecodings(s, index+2);
        return way1 + way2;
    }

}
