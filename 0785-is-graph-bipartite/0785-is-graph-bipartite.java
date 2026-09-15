class Solution {
    boolean ans=true;
    public void bfs(int i,int[] visited,int[][] graph){
        visited[i]=1;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);

        while(q.size()>0){
            int front=q.remove();
            for(int ele:graph[front]){
                if(visited[front]==visited[ele]){
                    ans=false;
                    return;
                }
                if(visited[ele]==-1){
                    visited[ele]=1-visited[front];
                    q.add(ele);
                }
            }
        }
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] visited=new int[n];

        Arrays.fill(visited,-1);

        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                bfs(i,visited,graph);
            }
        }
        return ans?true:false;
    }
}