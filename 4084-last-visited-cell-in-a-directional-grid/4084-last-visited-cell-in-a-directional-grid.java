class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int row = 0, col = 0;

        int[][] visited = new int[m][n];

        int i = 0, j = 0;

        while (i >= 0 && j >= 0 && i < m && j < n) {
            if (visited[i][j] == 1)
                break;
            row = i;
            col = j;
            visited[i][j] = 1;

            char c = grid[i][j];

            if (c == 'L')
                j--;
            else if (c == 'R')
                j++;
            else if (c == 'D')
                i++;
            else
                i--;
            ;
        }
        return new int[] { row, col };
    }
}