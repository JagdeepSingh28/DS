package com.jagdeep.ds.leet;

public class Best_time_to_buy_sell_stock_121 {

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        Best_time_to_buy_sell_stock_121 best_time_to_buy_sell_stock_122 = new Best_time_to_buy_sell_stock_121();
        System.out.println(best_time_to_buy_sell_stock_122.maxProfit(prices));
    }

    public void getProfit(int[] profit, int[] price, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(price[i] > price[j])
                    profit[i] = Math.max(profit[i], price[i] - price[j]);
            }
        }
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] profit = new int[n];
        for(int i = 0; i < n; i++)
            profit[i] = -1 * prices[i];

        getProfit(profit, prices, n);
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            if(profit[i] > max)
                max = profit[i];
        }

        return max;
    }
}
