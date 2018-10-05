package com.jagdeep.ds.strings;

public class PrintAllSubString {

    static void printSubString(String str, int length){

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                System.out.println(str.substring(i,j));
            }
        }

    }

    public static void main(String[] arg){
        String str = "abcd";
        printSubString(str, str.length());
    }
}
