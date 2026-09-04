class Solution {
    public long count(int ind,int[] coins, int amount, long[][] dp){
        if(ind==coins.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[ind][amount]!=-1) return dp[ind][amount];

        long skip=count(ind+1,coins,amount,dp);
        if(amount-coins[ind]<0) return dp[ind][amount]=skip;
        long pick=1+count(ind,coins,amount-coins[ind],dp); 
        return dp[ind][amount]=Math.min(pick,skip);
    }
    public int coinChange(int[] coins, int amount) {
        long[][] dp=new long[coins.length][amount+1];

        for(long[] ele:dp)
        Arrays.fill(ele,-1);

        int ans=(int)count(0,coins,amount,dp);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;

    }
}