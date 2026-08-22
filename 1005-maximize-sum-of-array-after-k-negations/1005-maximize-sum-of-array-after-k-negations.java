class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        Arrays.sort(nums);
       
        int i=0;
        while(i<n && nums[i]<0 && k>0){
            nums[i]=nums[i]*-1;
            i++;
            k--;
        }

       int minIndex = 0;
        for (int j = 1; j < n; j++) {
            if (nums[j] < nums[minIndex]) {
                minIndex = j;
            }
        }
        if (k % 2 == 1) {
            nums[minIndex] = nums[minIndex] * -1;
        }

        for(int ele:nums)
        sum+=ele;

        return sum;
    }
}