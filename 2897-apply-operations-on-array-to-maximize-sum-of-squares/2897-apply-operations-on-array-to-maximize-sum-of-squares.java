import java.util.List;

class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] count = new int[32];
        
        // Count the occurrences of each set bit across all numbers[cite: 1]
        for (int num : nums) {
            for (int b = 0; b < 32; b++) {
                if ((num & (1 << b)) != 0) {
                    count[b]++;
                }
            }
        }
        
        long result = 0;
        long mod = 1_000_000_007;
        
        // Greedily construct k largest possible numbers[cite: 1]
        while (k-- > 0) {
            long curr = 0;
            for (int b = 0; b < 32; b++) {
                if (count[b] > 0) {
                    count[b]--;
                    curr = curr | (1L << b); // Use 1L to avoid signed integer overflow
                }
            }
            // Add the square of the constructed number to the result, modulo 10^9 + 7
            result = (result + (curr * curr) % mod) % mod;
        }
        
        return (int) result;
    }
}