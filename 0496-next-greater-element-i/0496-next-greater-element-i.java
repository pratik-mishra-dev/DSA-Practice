class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        int i = n - 1;
        while (i >= 0) {
            int x = nums2[i];
            while (!st.isEmpty() && st.peek() < nums2[i])
                st.pop();

            if (st.isEmpty())
                map.put(nums2[i], -1);
            else
                map.put(nums2[i], st.peek());

            st.push(nums2[i--]);

        }
        int[] ans = new int[m];
        for (int j = 0; j < m; j++) {
            ans[j] = map.get(nums1[j]);
        }
        return ans;
    }
}