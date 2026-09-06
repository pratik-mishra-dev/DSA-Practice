class Solution {
   boolean flag=true;
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
    public void solve(char[][] board,int i,int j){
        if(i==9){
            flag=false;
            return;
        }
        if(board[i][j]!='.'){
            if(j!=8) solve(board,i,j+1);
            else solve(board,i+1,0);
        }
        else{
            for(char ch='1';ch<='9';ch++){
                if(isvalid(board,i,j,ch)){
                    board[i][j]=ch;
                    if(j!=8) solve(board,i,j+1);
                    else solve(board,i+1,0);
                    if(flag==true)
                     board[i][j]='.';
                }
            }

        }
    }
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
}