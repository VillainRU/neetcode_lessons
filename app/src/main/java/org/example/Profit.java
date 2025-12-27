package org.example;

public class Profit {
  public int maxProfit(int[] prices) {

    int left = 0; // buy
    int right = 1; // sell
    int maxProfit = 0;

    while (right < prices.length) {
      if (prices[left] < prices[right]) {
        int profit = prices[right] - prices[left];
        maxProfit = Integer.max(maxProfit, profit);
      } else {
        left = right;
      }
      right++;
    }
    // prices {10 1 5 6 7 1} profit 6
    return maxProfit;
  }
}
