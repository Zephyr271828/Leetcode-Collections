package Leetcode;

import java.lang.Math;

public class maxProfit {
    public static int maxprofit(int[] prices){
        int maxp = 0;
        int minp = prices[0];
        for (int i = 1; i < prices.length; i++){
            if (prices[i] - minp > maxp){
                maxp = prices[i] - minp;
            }
            if (prices[i] < minp){
                minp = prices[i];
            }
        }
        return maxp;
    }

    public static int maxprofit2(int[] prices){
        int left = 0, right = 1, max_profit = 0;
        while (right < prices.length){
            if (prices[left] < prices[right]){
                max_profit = Math.max(prices[right] - prices[left], max_profit);
            } else{
                left = right;
            }
            right++;
        }
        return max_profit;
    }
    // the second algorithm is actually equivalent to the first one, yet in a more abstract form
    // it's interesting that this method is faster than the first one

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxprofit(prices));
    }
}
