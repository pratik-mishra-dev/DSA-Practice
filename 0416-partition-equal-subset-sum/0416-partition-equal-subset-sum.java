class Solution {
    private boolean calculate(int i,int[] nums,int weight,int[][] dp){
        if(i==nums.length){
            if(weight==0) return true;
            return false;
        }
        if(dp[i][weight]!=-1) return dp[i][weight]==1;
        boolean ans=false;
        boolean skip=calculate(i+1,nums,weight,dp);
        if(weight-nums[i]<0) ans=skip;
        else{
            boolean include=calculate(i+1,nums,weight-nums[i],dp);
       ans=skip||include;
        }
        dp[i][weight]=ans?1:0;
        return ans;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        sum+=nums[i];

        if(sum%2!=0) return false;
        sum/=2;
        int[][] dp=new int[n][sum+1];
        for(int i=0;i<n;i++)
        Arrays.fill(dp[i],-1);
        return calculate(0,nums,sum,dp);
        
    }
}