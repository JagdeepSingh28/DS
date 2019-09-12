package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;

public class IsHappyNumber_202 {

    public static void main(String[] args) {
        IsHappyNumber_202 isHappyNumber_202 = new IsHappyNumber_202();
        System.out.println(isHappyNumber_202.isHappy(2));
    }

//    public boolean isHappy(int n) {
//        int x = 0;
//        List<Integer> prevVals = new ArrayList<>();
//        while (x != 1) {
//            x = calc(n);
//            System.out.println(x);
//            if (prevVals.contains(x)) {
//                return false;
//            }
//            n = x;
//            prevVals.add(x);
//        }
//        return true;
//    }

//    public int calc(int n) {
//        int val = 0;
//        while (n > 0) {
//            val += Math.pow((n % 10), 2);
//            n /= 10;
//        }
//        return val;
//    }


    List<Integer> prevVals = new ArrayList<>();
    public boolean isHappy(int n) {
        return isHappy(getIndividualNums(n));
    }

    public boolean isHappy(List<Integer> nums){
        int result = 0;
        for(int i : nums){
            result += i*i;
        }
        if(prevVals.contains(result))
            return false;

        prevVals.add(result);

        if(result == 1)
            return true;

        return isHappy(getIndividualNums(result));
    }

    public List<Integer> getIndividualNums(int num){
        List<Integer> result = new ArrayList<>();
        while(num > 0){
            result.add(num % 10);
            num = num/10;
        }

        return result;
    }
}
