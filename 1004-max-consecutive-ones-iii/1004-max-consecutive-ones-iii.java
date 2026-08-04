class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int i=0;
        int ind=0;
        int ans=0;
        while(ind<n){
            if(nums[ind]==1){
                 sum++;
                 ind++;
            }
            else if(nums[ind]==0 && k!=0){
                ind++;
                sum++;
                k--;
            }
            else{
                ans=Math.max(sum,ans);
              
                while(nums[i]!=0){
                   sum--;
                    i++;
                }
                i++;
                ind++;
                // sum-- remove the current 0, then sum++ for add new zero, so not change
                //also one achive all k, remove one add 1, check
            }
        }
        ans=Math.max(sum,ans);
        return ans;
    }
}