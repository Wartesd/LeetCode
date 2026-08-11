class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        if (prices.length == 1) return maxProfit;
        for (int i =1; i<prices.length; i++){
            maxProfit += Math.max(prices[i]-prices[i-1], 0);
        }
        return maxProfit;
    }  
}  

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna