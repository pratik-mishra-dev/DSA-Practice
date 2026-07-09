class Solution {
    // public int calculate(int m,int n,int[][] dp,int[][] grid,int a,int b){
    //     if(a>=m || b>=n) return Integer.MAX_VALUE;
    //     if(a==m-1 && b==n-1) return grid[a][b];
    //     if(dp[a][b]!=-1) return dp[a][b];
    //     int val=grid[a][b]+Math.min(calculate(m,n,dp,grid,a+1,b),calculate(m,n,dp,grid,a,b+1));
    //     return dp[a][b]=val;
    // }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];

        dp[0][0]=grid[0][0];

       for(int i=1;i<m;i++)
       dp[i][0]=dp[i-1][0]+grid[i][0];

        for(int i=1;i<n;i++)
       dp[0][i]=dp[0][i-1]+grid[0][i];

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }

        }
        return dp[m-1][n-1];
    }
}