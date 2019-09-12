package com.jagdeep.ds.leet;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket {

    public static void main(String[] args) {
        FruitIntoBasket fruitIntoBasket = new FruitIntoBasket();
        System.out.print(fruitIntoBasket.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }

    public int totalFruit(int[] tree) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int res = 0, i = 0;
        for (int j = 0; j < tree.length; ++j) {
            count.put(tree[j], count.getOrDefault(tree[j], 0) + 1);
            while (count.size() > 2) {
                count.put(tree[i], count.get(tree[i]) - 1);
                if (count.get(tree[i]) == 0) count.remove(tree[i]);
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }

}
