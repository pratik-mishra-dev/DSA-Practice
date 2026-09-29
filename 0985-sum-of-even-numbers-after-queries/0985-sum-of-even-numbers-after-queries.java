class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int m=queries.length;

        int[] ans=new int[m];
        int k=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) sum+=nums[i];
        }

        for(int i=0;i<m;i++){
            int val=queries[i][0];
            int ind=queries[i][1];

            if(nums[ind]%2==0) sum-=nums[ind];

            nums[ind]=nums[ind]+val;
            if(nums[ind]%2==0) sum+=nums[ind];

            ans[k++]=sum;

        }
        return ans;
    }
}