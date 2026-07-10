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
        j--;
        while(j<n && i<n){
            int len=j-i+1;//j aak age he than of liding window so length not -1
            if(sum>=target) min=Math.min(min,len);
            sum-=nums[i];
            i++;j++;
            while(j<n && sum<target){
                sum+=nums[j++];
            }
            j--;
            
        }

        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}