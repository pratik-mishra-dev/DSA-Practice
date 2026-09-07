class Solution {
    public int distinctSubseqII(String s) {
        int n = s.length();
        long MOD = 1_000_000_007;
        
        long[] dp = new long[n + 1];
        int[] last = new int[26];

        Arrays.fill(last, -1);
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int ch = s.charAt(i - 1) - 'a';

            dp[i] = (2 * dp[i - 1]) % MOD;
            if (last[ch] != -1) {
                dp[i] = (dp[i] - dp[last[ch] - 1] + MOD) % MOD;  // Remove duplicate subsequences
            }
            last[ch] = i; // Current character's latest position
        }
        return (int)((dp[n] - 1 + MOD) % MOD);//remove empty
    }
}