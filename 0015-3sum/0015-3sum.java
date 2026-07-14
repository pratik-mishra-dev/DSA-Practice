class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        HashSet<List<Integer>> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
            map.put(nums[i], i);

        Arrays.sort(nums);

        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int sum = nums[i];
            for (int j = i + 1; j <= n - 2; j++) {
                sum += nums[j];
                int target = -sum;
                if (map.containsKey(target)) {
                    int ind = map.get(target);
                    if (ind > j) {
                        List<Integer> l = Arrays.asList(nums[i], nums[j], target);
                        set.add(l);
                    }
                }

                sum -= nums[j];
            }
        }
        return new ArrayList<>(set);
    }
}