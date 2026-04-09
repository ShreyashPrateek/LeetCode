class Solution {
    public int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) 
        {
            // minimum price ke liye
            if (price < minPrice) 
            {
                minPrice = price;
            } 
            // profil calculate
            else 
            {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}