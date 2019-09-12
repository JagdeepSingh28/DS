package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZigZagConversion {

    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
        ZigZagConversion zc = new ZigZagConversion();
//        String s = in.next();
//        int n = in.nextInt();
//        System.out.println(zc.convert(s, n));
        System.out.println(zc.convert("PAYPAALISHIRINGGOODENGINEER", 4));
    }

    public String convert1(String s, int numRows) {
        if (s.length() <= 1 || numRows <= 1) {
            return s;
        }
        int n1 = numRows;
        int n2 = 1;
        int gap1 = (n1 * 2) - 3;
        boolean isUsingGap1 = true;
        int gap2 = (n2 * 2) - 3;
        n1--;
        boolean isUsingGap2 = false;
        n2++;


        char[] sArray = s.toCharArray();
        StringBuilder sBuilder = new StringBuilder();

        int startIndex = 0;


        while (n1 > 0 && n2 <= numRows) {

            int index = startIndex;
            startIndex++;
            isUsingGap1 = true;
            isUsingGap2 = false;


            while (index < sArray.length) {

                if (isUsingGap1) {
                    isUsingGap2 = true;
                    isUsingGap1 = false;
                    if (gap1 > 0) {
                        sBuilder.append(sArray[index]);
                        index += gap1 + 1;
                    }
                } else if (isUsingGap2) {
                    isUsingGap2 = false;
                    isUsingGap1 = true;
                    if (gap2 > 0) {
                        sBuilder.append(sArray[index]);
                        index += gap2 + 1;
                    }
                }
            }

            gap1 = (n1 * 2) - 3;
            gap2 = (n2 * 2) - 3;
            n1--;
            n2++;

        }

        int gap = (numRows * 2) - 3;
        while (startIndex < sArray.length) {
            sBuilder.append(sArray[startIndex]);
            startIndex += gap + 1;
        }

        return sBuilder.toString();
    }

    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

}
