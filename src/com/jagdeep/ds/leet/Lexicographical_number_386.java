package com.jagdeep.ds.leet;

import com.jagdeep.ds.Utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lexicographical_number_386 {
    public static void main(String[] args) {
        Utils.print(Arrays.toString(lexicalOrder(13).toArray()));
    }

    public static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList();
        int i = 1;
        while (true) {
            result.add(i);
            if (i * 10 <= n) {
                i *= 10;
            } else {
                while (i % 10 == 9 || i == n) {
                    i /= 10;
                }
                if (i == 0) {
                    return result;
                }
                i++;
            }
        }
    }
}
