class Solution {
    static int[] dp;
    public int calculate(int[] cost,int n,int x){
        if(x==n) return cost[n];
        if(x>n) return 0;
        if(dp[x]!=-1) return dp[x];
        int min=Math.min(calculate(cost,n,x+1),calculate(cost,n,x+2));
        dp[x]=cost[x]+min;
        return dp[x];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
         dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(calculate(cost,n-1,0),calculate(cost,n-1,1));
    }
}