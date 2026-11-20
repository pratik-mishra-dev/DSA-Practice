class Solution {
    public int calculate(int m,int n,int[][] dp,int[][] grid,int a,int b){
        if(a>=m || b>=n) return Integer.MAX_VALUE;
        if(a==m-1 && b==n-1) return grid[a][b];
        if(dp[a][b]!=-1) return dp[a][b];
        int val=grid[a][b]+Math.min(calculate(m,n,dp,grid,a+1,b),calculate(m,n,dp,grid,a,b+1));
        return dp[a][b]=val;
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];

        for(int i=0;i<m;i++)
        Arrays.fill(dp[i],-1);

        int cal=calculate(m,n,dp,grid,0,0);
        return cal;
    }
}