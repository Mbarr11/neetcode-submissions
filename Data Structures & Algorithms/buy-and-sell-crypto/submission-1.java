class Solution {
    public int maxProfit(int[] prices) {
    int l = 0;
    int r = 1;
    int max = 0;
    while (r < prices.length){
        if(prices[l] > prices[r]){
            l = r;
        }else{
            int sum = prices[r] - prices[l];
            max = Math.max(sum, max);
        }
        r++;
    }
        return max;
    }
}
