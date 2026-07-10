class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=0;

        int sum=0;
        while(j<n && sum<target){
            sum+=nums[j++];
        }
        //j--;
        while(i<n){
           if(sum>=target){
             int len=j-i;//j aak age he than of liding window so length not -1
            min=Math.min(min,len);
            sum-=nums[i];
            i++;
           }
            else{
            if(j==n) break; 
             sum+=nums[j++];
        }
        }

        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}