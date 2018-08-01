package com.jagdeep.ds.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class shows previous implementation
 */

public class RegexExample2 {

    static boolean isTestCasePass = true;

    public static void main(String[] arg){

        String password = "Test@11";

        System.out.println("PASSWORD ENTERED IS " + password);

        System.out.println("According to Old password policy  " + isValidPasswordOld(password));
        System.out.println("According to New password policy  " + isValidPasswordNew(password));
    }


    public static boolean isValidPasswordNew(String password) {
        Pattern pattern;
        Matcher matcher;

        final String PASSWORD_PATTERN = "^.{6,20}$";

        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        boolean isConsecutive = validateConsecutiveSeqNew(password);
        return matcher.matches() && !isConsecutive;
    }

    public static boolean validateConsecutiveSeqNew(String consecutivePassword) {
        char consecutivePasswordCharArray[] = consecutivePassword.toCharArray();
        int asciiCode;
        boolean isConSeq = false;
        int previousAsciiCode = 0;
        int numSequenceCount = 0;

        for (int i = 0; i < consecutivePasswordCharArray.length; i++) {
            asciiCode = consecutivePasswordCharArray[i];
            if ((previousAsciiCode + 1) == asciiCode) {     // consecutive ASCII
                numSequenceCount++;
                if (numSequenceCount >= 3) {
                    isConSeq = true;
                    break;
                }
            } else if ((previousAsciiCode) == asciiCode) {     // Same ASCII
                if((asciiCode>=48 && asciiCode<=57)){ // for numbers
                    numSequenceCount++;
                    if (numSequenceCount >= 1) {
                        isConSeq = true;
                        break;
                    }
                }else{ // for characters
                    numSequenceCount++;
                    if (numSequenceCount >= 2) {
                        isConSeq = true;
                        break;
                    }
                }
            } else {
                numSequenceCount     = 0;
            }
            previousAsciiCode = asciiCode;
        }
        return isConSeq;
    }

    public static boolean isValidPasswordOld(String password) {
        Pattern pattern;
        Matcher matcher;

        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=~`!_-])(?=\\S+$).{8,20}$";

        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        boolean isConsecutive = validateConsecutiveSeqOld(password);
        return matcher.matches() && !isConsecutive;

    }

    public static boolean validateConsecutiveSeqOld(String consecutivePassword) {
        char consecutivePasswordCharArray[] = consecutivePassword.toCharArray();
        int asciiCode = 0;
        boolean isConSeq = false;
        int previousAsciiCode = 0;
        int numSeqcount = 0;

        for (int i = 0; i < consecutivePasswordCharArray.length; i++) {
            asciiCode = consecutivePasswordCharArray[i];
            if ((previousAsciiCode + 1) == asciiCode) {
                numSeqcount++;
                if (numSeqcount >= 3) {
                    isConSeq = true;
                    break;
                }
            } else {
                numSeqcount = 0;
            }
            previousAsciiCode = asciiCode;
        }
        return isConSeq;
    }

}
