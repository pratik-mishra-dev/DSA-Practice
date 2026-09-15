class Solution {
    public void dfs(int i,int[][] nums,boolean[] visited){
        int n=nums.length;
        visited[i]=true;
        for(int j=0;j<n;j++){
                if(nums[i][j]==1 && visited[j]==false){
                    visited[j]=true;
                     dfs(j,nums,visited);
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
                visited[i]=true;
                dfs(i,nums,visited);
            }
        }
        return count;
    }
}