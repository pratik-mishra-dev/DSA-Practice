class Solution {
    public void nqueen(int ind,char[][] chess, List<List<String>> ans){
        int n=chess.length;

        if(ind==n){
            List<String> l=new ArrayList<>();

            for(int i=0;i<n;i++){
                String s="";
                for(int j=0;j<n;j++){
                    s+=chess[i][j];
                }
                l.add(s);
            }
            ans.add(l);
        }
        for(int j=0;j<n;j++){
            if(is_safe(chess,ind,j)){
                chess[ind][j]='Q';
                nqueen(ind+1,chess,ans);
                chess[ind][j]='.';
            }
        }
    }

    public boolean is_safe(char[][] chess, int row,int col){
        int n=chess.length;

        //check column Q
        for(int i=0;i<n;i++){
            if(chess[i][col]=='Q') return false;
        }
        
       //not check row bcz every time we check for the queen is fit or not any row,
       // and dont check for down word , bcz we go from up to down , so obbiously not present any queen in down word


        //check for NE
        int i=row;
        int j=col;
        while(i>=0 && j<n){
             if(chess[i][j]=='Q') return false;
             i--;
             j++;
        }

        //check for Nw
         i=row;
         j=col;
        while(i>=0 && j>=0){
             if(chess[i][j]=='Q') return false;
             i--;
             j--;
        }

        return true;
    }

    public int totalNQueens(int n) {
        char[][] chess=new char[n][n];

        for(char[] ele:chess)
        Arrays.fill(ele,'.');

        List<List<String>> ans=new ArrayList<>();

        nqueen(0,chess,ans);

        return ans.size();
    }
}