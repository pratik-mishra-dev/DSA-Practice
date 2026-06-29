class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long[] ans=new long[n];
        int max=nums[0];
        ans[0]=nums[0]*2;
        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            ans[i]=nums[i]+max+ans[i-1];
        }
        return ans;
    }
}