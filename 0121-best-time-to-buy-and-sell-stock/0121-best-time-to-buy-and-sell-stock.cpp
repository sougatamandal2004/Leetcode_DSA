class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int buyPrice = INT_MAX;
        int profit = 0;
        for(int i=0;i<n;i++){
            if(buyPrice < prices[i]){
                int p = prices[i] - buyPrice;
                profit = max(profit, p);
            } else{
                buyPrice = prices[i];
            }
        }
        return profit;
    }
};