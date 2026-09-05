class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        int[] left=new int[n];
        int[] right=new int[n];

        int i=0,j=n-1;
        while(i!=n){
             if(max<nums[i]) max=nums[i];
            left[i]=max;

            if(min>nums[j]) min=nums[j];
            right[j]=min;

            i++;
            j--;
        }
        for(i=0;i<n;i++){
            if(left[i]-right[i]<=k) return i;
        }
        return -1;
    }
}