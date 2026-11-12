class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;

        int ans=1;
        int ans1=1;

        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                ans1++;
            }
            else{
                ans=Math.max(ans,ans1);
                ans1=1;
            }
        }

        ans=Math.max(ans,ans1);
        ans1=1;

         for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                ans1++;
            }
            else{
                ans=Math.max(ans,ans1);
                ans1=1;
            }
        }
        ans=Math.max(ans,ans1);

        return ans;
    }
}