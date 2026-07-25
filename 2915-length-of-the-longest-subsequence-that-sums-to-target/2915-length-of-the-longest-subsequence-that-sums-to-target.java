class Solution {
  
    public int calculate(int i,List<Integer> nums, int target,int[][] dp){
        if(i==nums.size()){
            if(target==0) return 0;
            return Integer.MIN_VALUE;
        }
        if(dp[i][target]!=-1) return dp[i][target];
         int skip=calculate(i+1,nums,target,dp);
         if(target-nums.get(i)<0) return dp[i][target]=skip;
         int pick=calculate(i+1,nums,target-nums.get(i),dp);

         if (pick != Integer.MIN_VALUE) {
            pick = 1 + pick;
        }
         return dp[i][target]=Math.max(skip,pick);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        
        int[][] dp=new int[nums.size()][target+1];
        for(int[] ele:dp)
        Arrays.fill(ele,-1);

        int ans=calculate(0,nums,target,dp);
        if(ans==Integer.MIN_VALUE) return -1;
        return ans;
       
    }
}