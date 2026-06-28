class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        long product = 1;
        int zeroCount = 0;
        int zeroIndex = -1;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                zeroCount++;
                zeroIndex = i;
            } else {
                product *= nums[i];
            }
        }

        int[] ans = new int[n];

        if(zeroCount > 1){
            return ans;
        }
        if(zeroCount == 1){
            ans[zeroIndex] = (int)product;
            return ans;
        }
         for(int i = 0; i < n; i++){
            ans[i] = (int)(product / nums[i]);
        }

        return ans;
    }
}