package LeetCode;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int prices[]) {
        int maxProfit = 0;
        int smallestInvest = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= smallestInvest)
                maxProfit = Math.max(maxProfit, prices[i] - smallestInvest);
            smallestInvest = Math.min(smallestInvest, prices[i]);
        }
        return maxProfit;
    }
}