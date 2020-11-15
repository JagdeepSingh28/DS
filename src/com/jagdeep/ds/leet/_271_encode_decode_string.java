package com.jagdeep.ds.leet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _271_encode_decode_string {
    public static void main(String[] args) {
        _271_encode_decode_string o = new _271_encode_decode_string();
        System.out.println(
//                o.decode(
                        o.encode(Arrays.asList("hello","world")
//                        )
                ));
    }

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        int numOfStr = strs.size();
        List<Integer> lengths = new LinkedList<Integer>();
        for (String s:strs) {
            lengths.add(s.length());
        }
        String result = numOfStr + "";
        for (Integer i:lengths) {
            result +=":" + i;
        }
        result += ":";
        for (String s:strs) {
            result +=s;
        }
        return result;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new LinkedList<String>();
        int i = 0;
        int numOfStr = 0;
        while (s.charAt(i) != ':') {
            numOfStr = numOfStr * 10 + (s.charAt(i) - '0');
            i ++;
        }
        List<Integer> lengths = new LinkedList<Integer>();
        i ++;
        for (int j = 0; j < numOfStr; j ++) {
            int leng = 0;
            while (s.charAt(i) != ':') {
                leng = leng * 10 + (s.charAt(i) - '0');
                i ++;
            }
            lengths.add(leng);
            i ++;
        }
        for (Integer l:lengths) {
            String tmp = "";
            for (int j = 0; j < l; j ++) {
                tmp +=s.charAt(i);
                i ++;
            }
            result.add(tmp);
        }
        return result;
    }
}
