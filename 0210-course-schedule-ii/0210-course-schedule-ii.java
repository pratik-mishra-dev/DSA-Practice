class Solution {
    public boolean dfs( List<List<Integer>> adj,int[] visited,int i,List<Integer> ans){
         if (visited[i] == 1) return false;
        if (visited[i] == 2) return true;

        visited[i]=1;
        for (int ele : adj.get(i)) {
            if (!dfs(adj, visited, ele, ans)) {
                return false;
            }
        }
        visited[i]=2;
        ans.add(i);
        return true;
    }
    public int[] findOrder(int n, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            int x = p[0];
            int y = p[1];

            adj.get(y).add(x);
        }
         List<Integer> ans=new ArrayList<>();
         int[] visited=new int[n];
         for(int i=0;i<n;i++){
            if (visited[i] == 0) {
                if (!dfs(adj, visited, i, ans)) {
                    return new int[0];
                }
            }
         }
         Collections.reverse(ans);
         int[] arr=ans.stream().mapToInt(Integer::intValue).toArray();

         return arr;
    }
}