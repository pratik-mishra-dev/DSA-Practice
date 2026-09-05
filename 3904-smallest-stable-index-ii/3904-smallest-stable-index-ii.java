class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        int[] left=new int[n];
        int[] right=new int[n];

        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            left[i]=max;
        }

        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            right[i]=min;
        }
        
        for(int i=0;i<n;i++){
            if(left[i]-right[i]<=k) return i;
        }
        return -1;
    }
}