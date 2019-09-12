package com.jagdeep.ds.test;

import java.util.ArrayList;

public class TestLoader2 {
    public static void main(String[] args) {
        boolean[] dd = new boolean[101];

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if(j%i == 0)
                    dd[j] = !dd[j];
            }
        }

        int count = 0;
        for (int i = 0; i < dd.length; i++) {
            if(dd[i]){
                count++;
                System.out.print(i+" - ");
            }
        }

        System.out.println(count);
    }
}

