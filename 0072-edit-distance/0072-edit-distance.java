class Solution {
    public int lcs(int i,int j,StringBuilder a,StringBuilder b,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;

        if(dp[i][j]!=-1) return dp[i][j];

        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=lcs(i-1,j-1,a,b,dp);
        else{
            int x=lcs(i-1,j,a,b,dp);// remove one element 1st 
             int y=lcs(i,j-1,a,b,dp);// add same chat at extra, after extra 2nd one reduce
              int z=lcs(i-1,j-1,a,b,dp);//change char at 1 as2nd last bala
              return dp[i][j]=1+Math.min(x,Math.min(y,z));
        }
    }
    public int minDistance(String word1, String word2) {
        StringBuilder a=new StringBuilder(word1);
         StringBuilder b=new StringBuilder(word2);
        int i=word1.length();
        int j=word2.length();
        int[][] dp=new int[i][j];
        
        for(int[] ele:dp)
        Arrays.fill(ele,-1);

         return lcs(i-1,j-1,a,b,dp);
    }
}