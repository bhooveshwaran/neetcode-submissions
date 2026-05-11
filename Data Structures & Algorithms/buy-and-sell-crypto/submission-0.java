class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0,profit=0;
        int i=0,j=1;
        while(j<prices.length){
            int buy = prices[i];
            int sell = prices[j];
            profit = sell - buy;
            if(profit>maxProfit){
                maxProfit = profit;
            }
            if(prices[j]<prices[i]){
                i=j;
                j=i+1;
                continue;
            }
            j++;
        }
        return maxProfit;
    }
}
