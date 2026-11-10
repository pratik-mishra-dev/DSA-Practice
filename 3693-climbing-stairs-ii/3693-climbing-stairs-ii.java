class Solution {
    public int helper(int i,int n,int[] costs,int[] dp){
        if(i==n) return 0;
        if(dp[i]!=-1) return dp[i];

        int j=i+1;
        int cost=Integer.MAX_VALUE;

        if(j<=n){
             cost= Math.min(cost,helper(j,n,costs,dp)+costs[j-1]+(j-i)*(j-i));
        }
        j++;
        if(j<=n){
             cost= Math.min(cost,helper(j,n,costs,dp)+costs[j-1]+(j-i)*(j-i));
        }
        j++;
        if(j<=n){
            cost= Math.min(cost,helper(j,n,costs,dp)+costs[j-1]+(j-i)*(j-i));
        }

        return dp[i]=cost;

    }
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        helper(0,n,costs,dp);
        return dp[0];
    }
}