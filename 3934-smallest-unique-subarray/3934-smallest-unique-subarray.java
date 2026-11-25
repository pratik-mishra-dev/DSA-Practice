
import java.util.*;

class Solution {

    static final long MOD1 = 1_000_000_007L;
    static final long MOD2 = 1_000_000_009L;

    public int smallestUniqueSubarray(int[] nums) {

        int n = nums.length;

        long base = 1;

        for (int x : nums) {
            base = Math.max(base, x + 1L);
        }

        int lo = 1, hi = n, ans = n;

        while (lo <= hi) {

            int k = lo + (hi - lo) / 2;

            if (check(base, nums, k)) {
                ans = k;
                hi = k - 1;
            } else {
                lo = k + 1;
            }
        }

        return ans;
    }

    boolean check(long base, int[] nums, int k) {

        int n = nums.length;

        HashMap<Long, Integer> map = new HashMap<>();

        long h1 = 0, h2 = 0;
        long power1 = 1, power2 = 1;

        // Calculate BASE^(k-1)
        for (int i = 1; i < k; i++) {
            power1 = (power1 * base) % MOD1;
            power2 = (power2 * base) % MOD2;
        }

        // First window hash
        for (int i = 0; i < k; i++) {
            h1 = (h1 * base + nums[i]) % MOD1;
            h2 = (h2 * base + nums[i]) % MOD2;
        }

        int unique = 0;

        for (int i = 0; i + k <= n; i++) {

            long hash = h1 * MOD2 + h2;

            int count = map.getOrDefault(hash, 0);

            if (count == 0) unique++;
            else if (count == 1) unique--;

            map.put(hash, count + 1);

            // Slide window
            if (i + k < n) {

                h1 = (h1 - nums[i] * power1 % MOD1 + MOD1) % MOD1;
                h1 = (h1 * base + nums[i + k]) % MOD1;

                h2 = (h2 - nums[i] * power2 % MOD2 + MOD2) % MOD2;
                h2 = (h2 * base + nums[i + k]) % MOD2;
            }
        }

        return unique > 0;
    }
}
