package com.jagdeep.ds.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

    static String[] passwords = {
            "Test@123",                 //true
            "&$@123",                   //true
            "135790",                   //true
            "111111",                   //false
            "123456",                   //false
            "123&_@",                   //true
            "zxcvbnmlkjhgfdsaqwert123", //false
            "Test@1234",                //false
            "Test@111",                 //true
            "135test",                  //true
            "abcdef",                   //false
            "aaaaaa",                   //false
            "113570",                   //true
            "abc123",                   //true
            "abcdxyz",                   //false
            "abc xyz",                   // false
            "aaaxxx",                     // true
            "111222",                     // true
            "asdfg",                     // false
            "121212",                     // true
    };

    static boolean[] result = {
            true,//"Test@123",
            true,//"&$@123",
            true,//"135790",
            false,//"111111",
            false,//"123456",
            true,//"123&_@",
            false,//"zxcvbnmlkjhgfdsaqwert123",
            false,//"Test@1234",
            true,//"Test@111",
            true,//"135test",
            false,//"abcdef",
            false,//"aaaaaa",
            true,//"113570",
            true,//"abc123"
            false,//"abcdxyz"
            false, //"abc xyz"
            true, //"aaaxxx"
            true, //"111222"
            false, //"asdfg"
            true, // "@@@$$$'
            true, // "121212'
    };

    static boolean isTestCasePass = true;

    public static void main(String[] arg){
        for(int i =0 ; i<passwords.length ; i++){
            if(isValidPassword(passwords[i]) != result[i]){
                System.out.println(passwords[i] + " is not showing the expected result.");
                isTestCasePass = false;
            }
        }

        if(isTestCasePass)
            System.out.println("All Test Cases passed");
    }

    public static boolean isValidPassword(String password) {
        Pattern pattern;
        Matcher matcher;

//        password = "abcd123";
        final String PASSWORD_PATTERN = "^(?=\\S+$).{6,20}$";

        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        boolean isConsecutive = validateConsecutiveSeq(password);
        return matcher.matches() && !isConsecutive;
    }

    public static boolean validateConsecutiveSeq(String consecutivePassword) {
        char consecutivePasswordCharArray[] = consecutivePassword.toCharArray();
        int asciiCode;
        boolean isConSeq = false;
        int previousAsciiCode = 0;
        int numConsecutiveCount = 0;
        int numSequenceCount = 0;

        for (int i = 0; i < consecutivePasswordCharArray.length; i++) {
            asciiCode = consecutivePasswordCharArray[i];
            if ((previousAsciiCode + 1) == asciiCode) {     // consecutive ASCII
                numSequenceCount     = 0;
                numConsecutiveCount++;
                if (numConsecutiveCount >= 3) {
                    isConSeq = true;
                    break;
                }
            } else if ((previousAsciiCode) == asciiCode) {     // Same ASCII
                numConsecutiveCount = 0;
                numSequenceCount++;
                if (numSequenceCount >= 3) {
                    isConSeq = true;
                    break;
                }
            }
            else {
                numSequenceCount     = 0;
                numConsecutiveCount  = 0;
            }
            previousAsciiCode = asciiCode;
        }
        return isConSeq;
    }

}
