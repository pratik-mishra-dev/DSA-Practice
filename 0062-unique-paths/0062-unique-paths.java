class Solution {
    public int calculate(int m,int n,int[][] dp,int s,int e){
        if(s==m-1|| e==n-1) return 1;
        if(dp[s][e]!=0) return dp[s][e];
        return dp[s][e]=calculate(m,n,dp,s+1,e)+calculate(m,n,dp,s,e+1);
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        int ans=calculate(m,n,dp,0,0);
        return ans;
    }
}