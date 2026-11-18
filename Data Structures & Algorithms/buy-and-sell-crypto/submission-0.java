
class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            // Find the minimum buying price
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate profit if sold today
            else {
                int profit = price - minPrice;

                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}
