class Solution {
    public int lcs(int i,int j,StringBuilder a,StringBuilder b,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=1+lcs(i-1,j-1,a,b,dp);
        else{
            int f=lcs(i,j-1,a,b,dp);
            int l=lcs(i-1,j,a,b,dp);
            return dp[i][j]=Math.max(f,l);
        }
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];

        for(int[] ele:dp)
        Arrays.fill(ele,-1);

        StringBuilder a=new StringBuilder(s);
        StringBuilder b=new StringBuilder(s).reverse();
        

        return lcs(n-1,n-1,a,b,dp);

    }
} 