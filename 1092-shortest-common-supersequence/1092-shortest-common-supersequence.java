class Solution {
     public String lcs(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();

        int[][] dp=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        //print string extra
        String s="";
        int i=m,j=n;
        while(i>0 && j>0){
            if(text1.charAt(i-1)==text2.charAt(j-1)) {
               
                s=text1.charAt(i-1)+s;
                 i--;
                j--;
            }
            else{
                if(dp[i-1][j]>=dp[i][j-1]) i--;
                else j--;
            }
        }
        System.out.println(s);

        return s;

    }
    public String shortestCommonSupersequence(String a, String b) {
        String s=lcs(a,b);
        int i=0,j=0,k=0;  // a->i ,b->j, k->s

        String ans="";
        
        while(i<a.length() && j<b.length() && k<s.length()){
            while(a.charAt(i)!=s.charAt(k)){
                ans+=a.charAt(i);
                i++;
            }

            while(b.charAt(j)!=s.charAt(k)){
                ans+=b.charAt(j);
                j++;
            }

            ans+=s.charAt(k);
            i++; j++; k++;
        }

         while(i<a.length()){
                ans+=a.charAt(i);
                i++;
            }
        
        while(j<b.length()){
                ans+=b.charAt(j);
                j++;
            }
    return ans;
    }
}