package com.jagdeep.ds.leet;

public class Best_time_to_buy_sell_stock_122 {

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,8,1};
        Best_time_to_buy_sell_stock_122 best_time_to_buy_sell_stock_122 = new Best_time_to_buy_sell_stock_122();
        System.out.println(best_time_to_buy_sell_stock_122.maxProfit(prices));
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
