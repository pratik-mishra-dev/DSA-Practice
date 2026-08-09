class Solution {
    int[][] dp;
    public int lcs(int i,int j,StringBuilder a,StringBuilder b){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=1+lcs(i-1,j-1,a,b);
        else return dp[i][j]=Math.max(lcs(i-1,j,a,b),lcs(i,j-1,a,b));
    }
    public int longestCommonSubsequence(String text1, String text2) {

        StringBuilder a=new StringBuilder(text1);
        StringBuilder b=new StringBuilder(text2);

        int i=a.length();
        int j=b.length();

        dp=new int[i][j];

        for(int[] ele:dp)
        Arrays.fill(ele,-1);

        return lcs(i-1,j-1,a,b);
    }
}