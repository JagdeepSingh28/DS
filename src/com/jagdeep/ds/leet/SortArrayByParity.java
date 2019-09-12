package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortArrayByParity {

    public static void main(String[] args) {
//        int[] a = new int[]{1,2,5,4};
//        int[] b = sortArrayByParityII_(a);

//        for(int i =0; i<b.length; i++){
//            System.out.print(b[i]);
//        }

        hh();
    }

    public static int[] sortArrayByParityII(int[] A) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> A2 = new ArrayList<>();

        for(int i=0; i<A.length; i++){
            if(A[i]%2 == 0)
                A1.add(A[i]);
            else
                A2.add(A[i]);
        }

        Collections.sort(A1);
        Collections.sort(A2);

        int[] result = new int[A.length];
        int b1 = 0;
        int b2 = 0;

        for(int i=0; i<A.length; i++){
            if(i%2==0){
                result[i] = A1.get(b1);
                b1++;
            }else{
                result[i] = A2.get(b2);
                b2++;
            }
        }

        return result;
    }

    public static int[] sortArrayByParityII_(int[] A) {
        int N = A.length;
        int[] ans = new int[N];

        int t = 0;
        for (int x: A) if (x % 2 == 0) {
            ans[t] = x;
            t += 2;
        }

        t = 1;
        for (int x: A) if (x % 2 == 1) {
            ans[t] = x;
            t += 2;
        }

        return ans;
    }

//    Input: ["bella","label","roller"]
//    Output: ["e","l","l"]
    private static ArrayList<String> hh(){
        String[] A = new String[]{"bella","label","roller"};

        HashMap<Character, Integer> union = new HashMap<>();
        for(int i = 0; i < A[0].length(); i++)
            union.put(A[0].charAt(i), union.getOrDefault(A[0].charAt(i), 0)+1);

        for(int i = 1; i < A.length; i++){
            HashMap<Character, Integer> temp = new HashMap<>();
            for(int j = 0; j < A[i].length(); j++){
                char curr = A[i].charAt(j);
                if(union.containsKey(curr))
                    temp.put(curr, Math.min(union.get(curr), temp.getOrDefault(curr, 0)+1));
            }
            union = temp;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(char c : union.keySet()){
            for(int i = 0; i < union.get(c); i++) ans.add(c + "");
        }

        return ans;

    }

}
