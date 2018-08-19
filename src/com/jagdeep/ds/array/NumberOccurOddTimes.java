package com.jagdeep.ds.array;


import java.util.HashMap;
import java.util.Map;

/***
 * In an array having positive integers, except for one number which occurs odd number of times, all other numbers occur even number of times. Find the number.
 * Example -
 * Input : 2 5 9 1 5 1 8 2 8
 * Output: 9
 */
public class NumberOccurOddTimes {

    public static void printNumberOccuringOddNumberOfTimes(int[] input) {
        if(input == null || input.length == 0) {
            System.out.println("Empty input array.");
            return;
        }
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = result ^ input[i];
        }
        System.out.println("Number occurring odd number of times is " + result);
    }

    public static void printNumberOccuringOddNumberOfTimesHash(int[] input) {
        if(input == null || input.length == 0) {
            System.out.println("Empty input array.");
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if(map.containsKey(input[i])) {
                map.put(input[i], map.get(input[i]) + 1);
            } else {
                map.put(input[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 1) {
                System.out.println("Number occurring odd number of times is " + entry.getKey());
                return;
            }
        }
    }

    public static void printNumberOccuringOddNumberOfTimesNaive(int[] input) {
        if(input == null || input.length == 0) {
            System.out.println("Empty input array.");
            return;
        }

        for(int i = 0; i < input.length; i++) {
            int count = 1;
            for (int j = 0; j < input.length; j++) {
                if(input[i] == input[j] && i != j) {
                    count++;
                }
            }
            if(count % 2 == 1) {
                System.out.println("Number occurring odd number of times is " + input[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 4, 3, 1, 4, 5, 1, 4, 2, 5};
//        printNumberOccuringOddNumberOfTimes(input);
        printNumberOccuringOddNumberOfTimesHash(input);
    }
}
