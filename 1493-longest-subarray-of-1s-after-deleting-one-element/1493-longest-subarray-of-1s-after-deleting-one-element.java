class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int ele:nums)
        sum+=ele;

        if(sum==n) return n-1;
        sum=0;
        int i=0,j=0;

       while(i<n && nums[i]!=1)
            i++;
        j=i;
       int zero=0;
        int ans=0;
        while(j<n && i<n){
            if(nums[j++]==1) sum++;
            else if(zero==0){
                zero++;
                 continue;
            }
            else{
                ans=Math.max(sum,ans);
                while(i<n && nums[i]==1){
                    sum--;
                    i++;
                }
                 if (i < n && nums[i] == 0) {
                    i++;
                }

            }

        }
        ans=Math.max(sum,ans);
        return ans;
    }
}