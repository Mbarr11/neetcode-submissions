class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;
        
        while(r < prices.length){
            int currentProfit = prices[r] - prices[l];
            maxProfit = Math.max(maxProfit, currentProfit);
            if(prices[r] <  prices[l]){
                l = r;
            }
            r++;
        }

        return maxProfit;
    }
}
