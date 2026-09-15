class Solution {
    public void bfs(int i,int[][] nums,boolean[] visited){
        int n=nums.length;
        Queue<Integer> q=new ArrayDeque<>();
        visited[i]=true;
        q.add(i);

        while(q.size()>0){
            int front=q.remove();
            for(int j=0;j<n;j++){
                if(nums[front][j]==1 && visited[j]==false){
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
    }
    public int findCircleNum(int[][] nums) {
        int n=nums.length;
        boolean[] visited=new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(visited[i]==false){
                count++;
                bfs(i,nums,visited);
            }
        }
        return count;
    }
}