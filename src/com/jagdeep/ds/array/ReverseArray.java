package com.jagdeep.ds.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] values = new int[]{1, 20,53,42,55};
        int[] rev = reverse(values.clone());
        for (int i = 0; i < values.length; i++) {
            System.out.println("Reverse: " + values[i] + "->"
                + rev[i]);
        }
    }

    private static int[] reverse(int[] values) {
        int N = values.length;
        for (int i = 0; i < N / 2; i++) {
            int tmp = values[i];
            values[i] = values[N-i-1];
            values[N-i-1] = tmp;
        }
        return values;
    }
}
