package com.jagdeep.ds.leet;

public class AddBinary_67 {

    public static void main(String[] args) {
        String s1="10110";
        String s2="10";
        System.out.println("Binary addition of s1 and s2 is "+addBinary(s1,s2));
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            result.insert(0,sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            result.insert(0,carry);
        return result.toString();
    }
}
