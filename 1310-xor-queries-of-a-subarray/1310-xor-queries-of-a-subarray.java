class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
         int n = queries.length;
        int[] ans = new int[n];

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] ^ arr[i];
        }
        for (int i = 0; i < n; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            if (l == 0)
                ans[i] = prefix[r];
            else
                ans[i] = prefix[r] ^ prefix[l - 1];
        }

        return ans;
    }
}