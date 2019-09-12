package com.jagdeep.ds.leet;

import java.util.Arrays;

public class Boats_to_Save_People_881 {

    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{3,2,2,1}, 3));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        // 1,2,2,3
        int i = 0;
        int j = people.length-1;
        int counter = 0;

        while(i<=j){
            if(people[i] + people[j] <= limit){
                i++;
                j--;
            }else
                j--;

            counter++;
        }

        return counter;
    }
}
