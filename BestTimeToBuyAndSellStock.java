public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for (int sell : prices) {
            if(sell > buy) 
                profit = Math.max(profit, sell - buy);
            else
                buy = sell;
        }

        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTime = new BestTimeToBuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(bestTime.maxProfit(prices)); 
    }
    
}
