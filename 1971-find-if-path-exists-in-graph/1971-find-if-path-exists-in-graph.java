class Solution {
    public void bfs( List<List<Integer>> adj, int s, int e, boolean[] visited) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(s);
        
        while(q.size()>0){
            for(int ele:adj.get(q.remove())){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele]=true;
                    if(ele==e) return;
                }
            }
        }

    }
    public boolean validPath(int n, int[][] edges, int s, int e) {
        if(s==e) return true;

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            adj.add(l);
        }

        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
             int b=edges[i][1];

             adj.get(a).add(b);
              adj.get(b).add(a);
        }
        boolean[] visited=new boolean[n];
        bfs(adj,s,e,visited);

        return visited[e];
    }
}