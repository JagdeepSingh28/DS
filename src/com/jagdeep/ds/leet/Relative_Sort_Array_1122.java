package com.jagdeep.ds.leet;

import java.util.*;

public class Relative_Sort_Array_1122 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[]{2,1,4,3,9,6};

        int[] arr3 = new int[11];

        arr3 = relativeSortArray(arr1, arr2);

    }


    public static int[] relativeSortArray_(int[] arr1, int[] arr2) {
        if (arr2.length == 0) {
            Arrays.sort(arr1);
            return arr1;
        }
        int len = arr1.length;
        int[] res = new int[len];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        int len2 = arr2.length;
        int index = 0;
        for (int i = 0; i < len2; i++) {
            int count = map.get(arr2[i]);
            for (int j = 0; j < count; j++) {
                res[index] = arr2[i];
                index++;
            }
            map.remove(arr2[i]);
        }

        if (map.size() > 0) {
            int[] temp = new int[len - index];
            int indexT = 0;
            Set<Integer> keys = map.keySet();
            Iterator<Integer> it = keys.iterator();
            while (it.hasNext()) {
                int child = it.next();
                int count = map.get(child);
                for (int j = 0; j < count; j++) {
                    temp[indexT] = child;
                    indexT++;
                }
            }
            Arrays.sort(temp);
            for (int i = 0; i < temp.length; i++) {
                res[index] = temp[i];
                index++;
            }
        }

        return res;
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        int[] cnt = new int[1001], ans = new int[arr1.length];
        for (int i : arr1)            // Count each number in arr1.
            ++cnt[i];
        for (int i : arr2)            // Sort the common numbers in both arrays by the order of arr2.
            while (cnt[i]-- > 0)
                ans[k++] = i;
        for (int i = 0; i < 1001; ++i)// Sort the numbers only in arr1.
            while (cnt[i]-- > 0)
                ans[k++] = i;
        return ans;
    }
}
