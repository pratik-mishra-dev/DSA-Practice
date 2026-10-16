
import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    long[] sum, sq, lazy;
    int n;

    public int sumCounts(int[] nums) {
        n = nums.length;
        sum = new long[4 * n];
        sq = new long[4 * n];
        lazy = new long[4 * n];

        HashMap<Integer, Integer> last = new HashMap<>();
        long ans = 0;

        for (int j = 0; j < n; j++) {
            int prev = last.getOrDefault(nums[j], -1);

            update(1, 0, n - 1, prev + 1, j);

            ans = (ans + sq[1]) % MOD;
            last.put(nums[j], j);
        }

        return (int) ans;
    }

    // Apply an increment of val to every element in this segment
    void apply(int node, int start, int end, long val) {
        long len = end - start + 1L;

        sq[node] = (sq[node]
                + 2L * val % MOD * sum[node] % MOD
                + val * val % MOD * len % MOD) % MOD;

        sum[node] = (sum[node] + val * len) % MOD;
        lazy[node] = (lazy[node] + val) % MOD;
    }

    void push(int node, int start, int end) {
        if (lazy[node] == 0 || start == end) {
            return;
        }

        int mid = start + (end - start) / 2;
        long val = lazy[node];

        apply(node * 2, start, mid, val);
        apply(node * 2 + 1, mid + 1, end, val);

        lazy[node] = 0;
    }

    void update(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return;
        }

        if (l <= start && end <= r) {
            apply(node, start, end, 1);
            return;
        }

        push(node, start, end);

        int mid = start + (end - start) / 2;

        update(node * 2, start, mid, l, r);
        update(node * 2 + 1, mid + 1, end, l, r);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        sq[node] = (sq[node * 2] + sq[node * 2 + 1]) % MOD;
    }
}
