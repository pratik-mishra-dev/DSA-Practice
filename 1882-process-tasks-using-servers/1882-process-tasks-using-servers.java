class Solution {
    class Pair_two {
        int val;
        int ind;

        Pair_two(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }
    }

    class Pair_three {
        int time;
        int val;
        int ind;

        Pair_three(int time, int val, int ind) {
            this.time = time;
            this.val = val;
            this.ind = ind;
        }
    }

    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;

        PriorityQueue<Pair_two> pq_one = new PriorityQueue<>(
                (a, b) -> {
                    if (a.val != b.val) {
                        return Integer.compare(a.val, b.val);
                    }
                    return Integer.compare(a.ind, b.ind);
                });
        PriorityQueue<Pair_three> pq_two = new PriorityQueue<>(
                (a, b) -> {
                    if (a.time != b.time) {
                        return Integer.compare(a.time, b.time);
                    } else if (a.val != b.val) {
                        return Integer.compare(a.val, b.val);
                    }
                    return Integer.compare(a.ind, b.ind);
                });

        int[] ans = new int[m];

        for (int i = 0; i < n; i++) {
            pq_one.add(new Pair_two(servers[i], i));
        }

        int time = 0;

        for (int i = 0; i < m; i++) {
            time = Math.max(time, i);

            while (pq_two.size() != 0 && pq_two.peek().time <= time) {
                Pair_three x = pq_two.remove();
                pq_one.add(new Pair_two(x.val, x.ind));
            }

            if (pq_one.isEmpty()) {

                time = pq_two.peek().time;

                while (pq_two.size() != 0 && pq_two.peek().time <= time) {
                    Pair_three x = pq_two.remove();
                    pq_one.add(new Pair_two(x.val, x.ind));
                }

            }

            Pair_two x = pq_one.remove();
            ans[i] = x.ind;
            pq_two.add(new Pair_three(time + tasks[i], x.val, x.ind));

        }
        return ans;
    }

}