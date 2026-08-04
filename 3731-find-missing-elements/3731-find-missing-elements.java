import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Add nums to pq1 and find min/max
        for (int num : nums) {
            pq1.offer(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Add all numbers in the range to pq2
        for (int i = min; i <= max; i++) {
            pq2.offer(i);
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq2.isEmpty()) {
            if (!pq1.isEmpty() && pq1.peek().equals(pq2.peek())) {
                pq1.poll();
                pq2.poll();
            } else {
                ans.add(pq2.poll());
            }
        }

        return ans;
    }
}