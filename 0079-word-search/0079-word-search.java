class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (search(board, word, i, j, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, String word, int i, int j, int index,  boolean[][] visited){
            
        // Boundary check
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length) {
            return false;
        }

        // Already used in current path
        if (visited[i][j]) {
            return false;
        }

        // Character doesn't match
        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        // Entire word matched
        if (index == word.length() - 1) {
            return true;
        }

        // Choose
        visited[i][j] = true;

        // Explore 4 directions
        boolean found =
                search(board, word, i - 1, j, index + 1, visited) || // up
                search(board, word, i + 1, j, index + 1, visited) || // down
                search(board, word, i, j - 1, index + 1, visited) || // left
                search(board, word, i, j + 1, index + 1, visited);   // right

        // Backtrack
        visited[i][j] = false;

        return found;
    }
}