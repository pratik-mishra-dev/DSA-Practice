class Solution {
    public int helper(String s, String t,int i,int j,int[][] dp){
       if(j==t.length()) return 1;
       if(i==s.length()) return 0;

       if(dp[i][j]!=-1) return dp[i][j];

       int total=0;
       if(s.charAt(i)==t.charAt(j)){
        total=helper(s,t,i+1,j+1,dp)+helper(s,t,i+1,j,dp);
       }
       else total=helper(s,t,i+1,j,dp);

       return dp[i][j]=total;
    }
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m][n];
        for(int[] ele:dp)
        Arrays.fill(ele,-1);
        return helper(s,t,0,0,dp);
    }
}