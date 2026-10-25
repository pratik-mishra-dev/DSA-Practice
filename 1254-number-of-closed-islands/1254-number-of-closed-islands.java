class Solution {
    public boolean helper(int[][] grid,boolean[][] visited,int i,int j,int m,int n){
        if(i>=m || i<0 || j>=n || j<0) return false;
        if(grid[i][j]==1 || visited[i][j]) return true;

        visited[i][j]=true;

        boolean top=helper(grid,visited,i-1,j,m,n);
        boolean down= helper(grid,visited,i+1,j,m,n);
        boolean left= helper(grid,visited,i,j-1,m,n);
        boolean right=helper(grid,visited,i,j+1,m,n);
        
        return top && down && left && right;
    }
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        boolean[][] visited=new boolean[m][n];
        int ans=0;

        for(int i=1;i<m-1;i++){
           for(int j=1;j<n-1;j++){
            if(visited[i][j]==false && grid[i][j]==0){
                if(helper(grid,visited,i,j,m,n)) ans++;
            }
                
           }
        }
        return ans;
    }
}