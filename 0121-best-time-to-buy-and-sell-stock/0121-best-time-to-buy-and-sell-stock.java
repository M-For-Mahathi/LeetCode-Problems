class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int minCost = prices[0];
        for (int i = 0; i < prices.length; i++){
            max_profit = Math.max(max_profit, prices[i]-minCost);
            minCost = Math.min(minCost, prices[i]);
        }
        return max_profit;
    }
}