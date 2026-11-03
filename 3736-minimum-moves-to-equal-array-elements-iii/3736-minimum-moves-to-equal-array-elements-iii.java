class Solution {
    public int minMoves(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // for (int ele : nums) {
        //     if (ele > max)
        //         max = ele;
        // }
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int ans = 0;
        for (int ele : nums) {
            ans += max - ele;
        }
        return ans;
    }
}
