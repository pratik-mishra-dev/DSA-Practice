class Solution {
    int sum=0;
    public int calculate(int i,int[] nums,int curr,int target,int[][] dp){
        if(i==nums.length){
            if(curr==target) return 1;
            return 0;
        }
        if(dp[i][curr+sum]!=-1) return dp[i][curr+sum];
        int positive=calculate(i+1,nums,curr+nums[i],target,dp);
        int negative=calculate(i+1,nums,curr-nums[i],target,dp);

        return dp[i][curr+sum]=positive+negative;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        sum=0;
        for(int i=0;i<n;i++)
        sum+=nums[i];

        int[][] dp=new int[n][2*sum+1];

        for(int[] ele:dp)
        Arrays.fill(ele,-1);

        return calculate(0,nums,0,target,dp);
    }
}