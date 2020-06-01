package com.jagdeep.ds.leet;

public class DecryptString_1309 {

    public static void main(String[] args) {
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }

    public static String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();

        if(s == null)
            return result.toString();

        int len = s.length()-1;

        while(len>=0){
            if(s.charAt(len) == '#'){
                int charInt = Integer.parseInt(s.substring(len-2, len));
                char a = (char) (96 + charInt);
                result.append(a);
                len-=3;
            }else{
                int charInt = Integer.parseInt(s.substring(len, len+1));
                char a = (char) (96 + charInt);
                result.append(a);
                len--;
            }
        }

        return result.reverse().toString();
    }
}
