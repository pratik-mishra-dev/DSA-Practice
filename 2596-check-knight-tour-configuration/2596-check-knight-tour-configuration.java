class Solution {
    public boolean helper(int[][] grid,int row, int col,int val){
        int n=grid.length;
        if(val==n*n-1) return true;
        int i,j;
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && grid[i][j]==val+1) return helper(grid,i,j,val+1);

        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]==val+1) return helper(grid,i,j,val+1);

        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]==val+1) return helper(grid,i,j,val+1);

        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]==val+1) return helper(grid,i,j,val+1);

        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]==val+1) return helper(grid,i,j,val+1);

        i=row+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]==val+1) return helper(grid,i,j,val+1);

        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]==val+1) return helper(grid,i,j,val+1);

        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]==val+1) return helper(grid,i,j,val+1);

        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return helper(grid,0,0,0);
    }
}