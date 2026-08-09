class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length;
        int sum=0;
        int j=m-1;
        for(int i=0;i<m;i++){
           int k=j-i;
           if(i==k) sum+=mat[i][k];
           else{
            sum=sum+mat[i][i]+mat[i][k];
           }
        }
        return sum;
    }
}