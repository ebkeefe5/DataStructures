package Puzzles.Greedy;

// You are given an array prices where prices[i] is the price of a given stock on the ith day.

//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Stock {
    public int maxProfit(int[] prices) {
        //if the list is size 0 return 0
        if (prices.length == 0 || prices.length == 1)
            return 0;
        
        if (prices.length == 2)
            return Math.max(0, prices[1] - prices[0]);
        
        int smallest = Math.min(prices[0], prices[1]);
        int maxprofit = Math.max(0, prices[1] - prices[0]);
        
        for (int i = 2; i < prices.length; i++)
        {
           if (prices[i] - smallest > maxprofit)
               maxprofit = prices[i] - smallest;
            if (prices[i] < smallest)
                smallest = prices[i];
        }
        return maxprofit;
        
    }
}