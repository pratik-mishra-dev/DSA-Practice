class Solution {
    public int magic(int[] dp,int n){
        if(n<=1) return n;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];

        return dp[n]=magic(dp,n-1)+magic(dp,n-2)+magic(dp,n-3);

    }
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
     
        return magic(dp,n);
    }
}