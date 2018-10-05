package com.jagdeep.ds.strings;

public class AlternateString {// Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        if(s==null && s.trim().length()<=0)
            return 0;

        char[] charArray = s.toCharArray();
        int minDelete = 0;
        int n = charArray.length;
        if(n==1)
            return minDelete;
        //AAABB
        for(int i =0; i<n-1 ; i++){
            if(i<n-1){
                if(charArray[i] == charArray[i+1])
                    minDelete++;
            }
        }

        return minDelete;

    }

    public static void main(String[] args) {

        String[] arr = new String[]{"AAAA"
                ,"BBBBB"
                ,"ABABABAB"
                ,"BABABA"
                ,"AAABBB"};

        for (int qItr = 0; qItr < arr.length; qItr++) {
            String s = arr[qItr];

            int result = alternatingCharacters(s);
            System.out.println(result);
        }



    }
}