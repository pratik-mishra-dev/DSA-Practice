class Solution {
    public int minimizeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int x=nums[n-1]-nums[2];
         int y=nums[n-3]-nums[0];
         int z=nums[n-2]-nums[1];

        if(x<y && x<z) return x;
        else if(y<z) return y;
        return z;

      
    }
}