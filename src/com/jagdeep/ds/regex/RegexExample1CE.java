package com.jagdeep.ds.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1CE {

    private static final String PASSWORD_PATTERN_3_IDENTICAL = ".*([a-zA-Z0-9\\s~`!@#$%^&*)(\\]\"\\[_+=|\\\\}{:;?/><,.])\\1\\1\\1.*";

    public static void main(String[] arg) {
        System.out.println(isValidPassword(""));
    }

    public static boolean isValidPassword(String password) {
        Pattern pattern;
        Matcher matcher;

        password = "Samsung@@@@aa1";
//        final String PASSWORD_PATTERN = "^(?=\\S+$).{6,20}$";
        final String PASSWORD_PATTERN = PASSWORD_PATTERN_3_IDENTICAL;

        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();
    }

}