class Solution {
    public int maxProfit(int[] prices) {
        int min=0;
        int max=0;

        int profit=0;
        int n=prices.length;

        if(n==1) return 0;

        else if(n==2){
            if(prices[1]>=prices[0]){
                return prices[1]-prices[0];
            }
            else{
                return 0;
            }
        }

        else{
            min=prices[0];
            max=prices[0];
            for(int i=1;i<n;i++){
                if(prices[i]>max){
                    max=prices[i];
                }
                else{
                    if(prices[i]<min){
                        min=prices[i];
                        max=min;
                    }
                }
                profit=Math.max(profit,max-min);
            }


        }
        return profit;
        
    }
}