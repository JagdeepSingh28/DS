package com.jagdeep.ds.leet;

public class Best_time_to_buy_sell_stock_122 {

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        Best_time_to_buy_sell_stock_122 best_time_to_buy_sell_stock_122 = new Best_time_to_buy_sell_stock_122();
        System.out.println(best_time_to_buy_sell_stock_122.maxProfit_(prices));
    }

    public int maxProfit_(int[] prices) {
        int curMin = 0;
        int curMax = 0;
        int sum = 0;


        while(curMax<prices.length-1){
            if(prices[curMax]>prices[curMax+1]){
                sum = prices[curMax] - prices[curMin];
                curMax++;
                curMin = curMax;
            }else
                curMax++;
        }
        if(prices[curMax]>prices[curMin])
            sum = prices[curMax] - prices[curMin];

        return sum;
    }






    public int maxProfit(int[] prices) {
        int i =0;
        int j =0;
        int count = 0;

        while(j<prices.length){
            if(j == prices.length-1){
                count += prices[j]-prices[i];
                j++;
            }else if(prices[j]>prices[j+1]){
                count += prices[j]-prices[i];
                j++;
                i = j;
            }else{
                j++;
            }
        }

        return count;
    }
}
