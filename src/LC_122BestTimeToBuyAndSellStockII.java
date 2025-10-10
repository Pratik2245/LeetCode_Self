public class LC_122BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else {
                profit+=prices[i]-buy;
                buy=prices[i];
            }
        }
        return profit;
    }
}
