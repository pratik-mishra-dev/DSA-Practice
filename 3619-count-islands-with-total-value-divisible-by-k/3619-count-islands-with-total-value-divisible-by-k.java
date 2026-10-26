class Solution {
    public long helper(int[][] grid, boolean[][] visited, int i, int j, int m, int n) {
        if (i < 0 ||i >= m || j < 0 ||  j >= n)
            return 0;
        if (grid[i][j] == 0 || visited[i][j])
            return 0;

        visited[i][j] = true;

        long t= helper(grid, visited, i - 1, j, m, n);// top
        long d= helper(grid, visited, i + 1, j, m, n);//down
        long l= helper(grid, visited, i, j - 1, m, n);//left
        long r= helper(grid, visited, i, j + 1, m, n);//rigth

        return t+d+l+r+grid[i][j];

    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == false && grid[i][j] != 0) {
                    long val=helper(grid, visited, i, j, m, n);
                    if(val%k==0) ans++;
                }
            }
        }
        return ans;
    }
}