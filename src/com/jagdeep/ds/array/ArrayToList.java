package com.jagdeep.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

//    static int[] array = new int[]{1,2,3};

    public static void main(String[] args) {

        Integer[] array = new Integer[]{1,2,3};

        List<Integer> al = new ArrayList<>();
        al  = convertArrayToList(array);

        al.add(4);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }

    public static <T> List<T> convertArrayToList(T array[])
    {
       List<T> list = Arrays.asList(array);

        // Return the converted List
        return list;
    }
}

