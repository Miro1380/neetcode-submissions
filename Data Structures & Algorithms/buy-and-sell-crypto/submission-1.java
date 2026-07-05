class Solution {
    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int profit = 0;

        for(int i = 0 ; i < prices.length-1;i++){
           if(prices[buy] < prices[sell]){
               if(profit < prices[sell]- prices[buy]){
                   profit = prices[sell]- prices[buy];
               }
           }
            else {
                buy = sell;
            }
            sell++;
        }
        System.out.println("Profit: " + profit);
        return profit;
    }
}
