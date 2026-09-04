class Solution {
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void helper(int[] nums, int ind, List<List<Integer>> ans) {
        int n = nums.length;
        if (ind == n - 1) {
            List<Integer> l = Arrays.stream(nums).boxed().toList();
            ans.add(l);
            return;
        }
        for (int i = ind; i < n; i++) {
            swap(ind, i, nums);
            helper(nums, ind + 1, ans);
             swap(ind, i, nums);

        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }
}