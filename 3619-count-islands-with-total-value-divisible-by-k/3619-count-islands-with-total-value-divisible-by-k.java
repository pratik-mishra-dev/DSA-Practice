class Solution {
    public long helper(int[][] grid, int i, int j, int m, int n) {
        if (i < 0 ||i >= m || j < 0 ||  j >= n || grid[i][j] == 0 )
            return 0;
        int val=grid[i][j];
        grid[i][j] = 0;

        long t= helper(grid, i - 1, j, m, n);// top
        long d= helper(grid, i + 1, j, m, n);//down
        long l= helper(grid, i, j - 1, m, n);//left
        long r= helper(grid, i, j + 1, m, n);//rigth

        return t+d+l+r+val;

    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    long val=helper(grid, i, j, m, n);
                    if(val%k==0) ans++;
                }
            }
        }
        return ans;
    }
}