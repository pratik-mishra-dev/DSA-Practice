class Solution {
    public boolean isvalid(char[][] board,int row,int col,char num){
        // check col
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        // check row
        for(int i=0;i<9;i++){
            if(board[row][i]==num) return false;
        }

        //imp math and obserbation
        int srow=row/3*3;//this 2 line very imp
        int scol=col/3*3;
        for(int i=srow;i<srow+3;i++){
            for(int j=scol;j<scol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num == '.')
                    continue;
                board[i][j] = '.';
                if (isvalid(board, i, j,num) == false)
                    return false;
                board[i][j] = num;
            }
        }
        return true;
    }
}