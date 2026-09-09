class Solution {
    public void bfs(int i,int[][] adj,boolean[] visited){
        int n=adj.length;
       visited[i]=true;
        Queue<Integer> q=new ArrayDeque<>();
        q.add(i);
            while(q.size()>0){
                int front=q.remove();
                for(int j=0;j<n;j++){
                    if(adj[front][j]==1 && visited[j]==false){
                        q.add(j);
                        visited[j]=true;
                    }
                }
            }
       }
    public int findCircleNum(int[][] adj){
        int n=adj.length;  
        int count=0;
        boolean[] visited=new boolean[n];

        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,adj,visited);
                count++;
            }
        }

        return count;
        
    }
}