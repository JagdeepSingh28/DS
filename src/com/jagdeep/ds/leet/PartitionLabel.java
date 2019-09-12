package com.jagdeep.ds.leet;


import java.util.ArrayList;
import java.util.List;

public class PartitionLabel {

    public static void main(String[] args) {
        String S = "ababcbacadefegdehijhklij";

        PartitionLabel partitionLabel = new PartitionLabel();
        ArrayList<Integer> a = (ArrayList<Integer>) partitionLabel.partitionLabels(S);

        for (int i : a)
            System.out.println(i);
    }

    public List<Integer> partitionLabelss(String S) {

        StringBuffer sb = new StringBuffer(S);

        String reverseS = sb.reverse().toString();

        List<Integer> ar = new ArrayList<>();

        for(int i =0; i<S.length(); i++){
            int lastIndexInReverse = reverseS.indexOf(S.charAt(i));
            int lastIndex = S.length() - lastIndexInReverse;
            int j =i+1;
            while(j<lastIndex){
                if(reverseS.indexOf(S.charAt(j)) < lastIndexInReverse){
                    lastIndexInReverse = reverseS.indexOf(S.charAt(j));
                    lastIndex = S.length() - lastIndexInReverse ;
                }
                j++;
            }
            ar.add(j-i);
            i=j-1;
        }

        return ar;
    }

    public List<Integer> partitionLabels(String S) {
        int [] last = new int[26];
        for(int i = 0; i<S.length(); i++){
            last[S.charAt(i)-'a'] = i;
        }

        List<Integer> res = new ArrayList<Integer>();
        int maxJump = 0;
        int start = 0;
        for(int i = 0; i<S.length(); i++){
            maxJump = Math.max(maxJump, last[S.charAt(i)-'a']);
            if(i == maxJump){
                res.add(i-start+1);
                start = i+1;
            }
        }

        return res;
    }

}
